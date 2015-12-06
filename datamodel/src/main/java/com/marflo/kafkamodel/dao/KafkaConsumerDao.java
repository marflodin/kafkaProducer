package com.marflo.kafkamodel.dao;

import com.marflo.kafkamodel.document.KafkaConsumerDocument;
import com.mongodb.MongoClient;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

public class KafkaConsumerDao extends BasicDAO<KafkaConsumerDocument, ObjectId> {

    protected KafkaConsumerDao(MongoClient mongoClient, Morphia morphia, String dbName) {
        super(mongoClient, morphia, dbName);
    }
}
