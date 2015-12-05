package com.marflo.kafkamodel.dao;

import com.marflo.kafkamodel.document.KafkaApiRequestDocument;
import com.mongodb.MongoClient;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

public class KafkaApiRequestDao extends BasicDAO<KafkaApiRequestDocument, ObjectId> {

    private static String dbName = "kafkaApiRequestDb";

    public KafkaApiRequestDao(Morphia morphia, MongoClient mongoClient)  {
        super(mongoClient, morphia, dbName);
    }
}
