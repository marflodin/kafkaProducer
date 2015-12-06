package com.marflo.kafkamodel.dao;

import com.marflo.kafkamodel.document.KafkaConsumerDocument;
import com.marflo.kafkamodel.util.MongoDbUtil;
import com.mongodb.MongoClient;
import org.junit.Before;
import org.junit.Test;
import org.mongodb.morphia.Morphia;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;

public class KafkaConsumerDaoTest {

    private final static Logger logger = LoggerFactory.getLogger(KafkaConsumerDaoTest.class);

    private MongoClient mongoClient;
    private Morphia morphia;
    private KafkaConsumerDao consumerDao;
    private final String dbname = "test";

    @Before
    public void initiate() {
        mongoClient = MongoDbUtil.getMongoClient();
        morphia = new Morphia();
        morphia.map(KafkaConsumerDocument.class);
        consumerDao = new KafkaConsumerDao(mongoClient, morphia, dbname);
    }

    @Test
    public void addNewConsumerTest() {
        long counter = consumerDao.count();
        logger.debug("The count is [{}]", counter);

        KafkaConsumerDocument consumerDocument = new KafkaConsumerDocument();
        consumerDocument.setGroupId("newGroup");
        consumerDocument.setTopic("newTopic");
        consumerDao.save(consumerDocument);

        long newCounter = consumerDao.count();
        logger.debug("The new count is [{}]", newCounter);

        assertTrue((counter + 1) == newCounter);
    }
}
