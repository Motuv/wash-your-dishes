package com.example.washyourdishes.database;

import com.example.washyourdishes.R;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class Connection {

    public static void connect() {
        String connectionString = String.valueOf(R.string.database);
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            databases.forEach(db -> System.out.println(db.toJson()));
        }
    }
}