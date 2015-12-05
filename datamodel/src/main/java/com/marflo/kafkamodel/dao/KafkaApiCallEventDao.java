package com.marflo.kafkamodel.dao;

import com.marflo.kafkamodel.document.KafkaApiCallEventDocument;
import com.mongodb.MongoClient;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

public class KafkaApiCallEventDao extends BasicDAO<KafkaApiCallEventDocument, ObjectId> {

    private static String dbName = "kafkaApiRequestDb";

    public KafkaApiCallEventDao(Morphia morphia, MongoClient mongoClient)  {
        super(mongoClient, morphia, dbName);
    }
}
