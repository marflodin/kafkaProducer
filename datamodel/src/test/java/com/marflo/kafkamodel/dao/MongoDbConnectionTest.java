package com.marflo.kafkamodel.dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import java.util.Date;

public class MongoDbConnectionTest {

    public static void main(String[] args) {

        try {

            MongoClient mongo = new MongoClient("localhost", 27017);
            DB db = mongo.getDB("test");
            DBCollection table = db.getCollection("kafkaApiRequests");

            BasicDBObject document = new BasicDBObject();
            document.put("name", "Martin");
            document.put("age", 29);
            document.put("createdDate", new Date());
            table.insert(document);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
