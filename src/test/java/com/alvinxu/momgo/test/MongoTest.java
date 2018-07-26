package com.alvinxu.momgo.test;

import com.mongodb.DB;
import com.mongodb.Mongo;
import org.junit.Test;

import java.net.UnknownHostException;
import java.util.Set;

public class MongoTest {
    @Test
    public void testMongo() {
        Mongo mongo = new Mongo("172.16.18.1", 27017);
        DB db = mongo.getDB("test");
        Set<String> collection = db.getCollectionNames();
        for (String name : collection) {
            System.out.println("collection = " + name);
        }
    }
}
