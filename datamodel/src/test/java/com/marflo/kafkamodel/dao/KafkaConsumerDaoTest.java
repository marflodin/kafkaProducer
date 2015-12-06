package com.marflo.kafkamodel.dao;

import com.marflo.kafkamodel.document.KafkaConsumerDocument;
import com.marflo.kafkamodel.util.MongoDbUtil;
import com.mongodb.MongoClient;
import org.bson.types.ObjectId;
import org.junit.Before;
import org.junit.Test;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.Morphia;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class KafkaConsumerDaoTest {

    private final static Logger logger = LoggerFactory.getLogger(KafkaConsumerDaoTest.class);

    private MongoClient mongoClient;
    private Morphia morphia;
    private KafkaConsumerDao consumerDao;

    @Before
    public void setup() {
        String dbName = "test";
        mongoClient = MongoDbUtil.getMongoClient();
        morphia = new Morphia();
        morphia.map(KafkaConsumerDocument.class);
        consumerDao = new KafkaConsumerDao(mongoClient, morphia, dbName);
    }

    @Test
    public void addAndRemoveNewConsumerBasic() {
        long counter = consumerDao.count();

        Key<KafkaConsumerDocument> id = addConsumer("newGroup", "newTopic");
        long newCounter = consumerDao.count();
        assertEquals(counter + 1, newCounter);

        consumerDao.deleteById((ObjectId) id.getId());
        newCounter = consumerDao.count();
        assertEquals(counter, newCounter);
    }

    @Test
    public void findByIdConsumerBasic() {
        String consumerGroupId = "newGroup";
        String consumerTopic = "newTopic";
        Key<KafkaConsumerDocument> id = addConsumer(consumerGroupId, consumerTopic);

        KafkaConsumerDocument consumer = consumerDao.get((ObjectId) id.getId());
        assertEquals(consumerGroupId, consumer.getGroupId());
        assertEquals(consumerTopic, consumer.getTopic());

        consumerDao.deleteById((ObjectId) id.getId());
    }

    private Key<KafkaConsumerDocument> addConsumer(String groupName, String topicName) {
        KafkaConsumerDocument consumerDocument = new KafkaConsumerDocument();
        consumerDocument.setGroupId(groupName);
        consumerDocument.setTopic(topicName);
       return consumerDao.save(consumerDocument);
    }
}
