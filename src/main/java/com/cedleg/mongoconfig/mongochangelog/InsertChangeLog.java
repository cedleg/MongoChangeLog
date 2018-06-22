package com.cedleg.mongoconfig.mongochangelog;


import com.cedleg.model.User;
import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import org.bson.types.ObjectId;

import java.util.Random;
import java.util.UUID;

@ChangeLog(order = "001")
public class InsertChangeLog {

    @ChangeSet(order = "001", id = "InsertChangeSet", author = "cedleg")
    public void someInsert1(DB db) {
        // This is deprecated in mongo-java-driver 3.x, use MongoDatabase instead
        // type: com.mongodb.DB : original MongoDB driver v. 2.x, operations allowed by driver are possible
        // example:
        DBCollection mycollection = db.getCollection("mycollection");
        BasicDBObject doc = new BasicDBObject().append("user", "1");
        mycollection.insert(doc);
    }

    @ChangeSet(order = "002", id = "InsertChangeSet2", author = "cedleg")
    public void someInsert2(DB db) {
        // This is deprecated in mongo-java-driver 3.x, use MongoDatabase instead
        // type: com.mongodb.DB : original MongoDB driver v. 2.x, operations allowed by driver are possible
        // example:
        DBCollection mycollection = db.getCollection("mycollection");
        BasicDBObject doc = new BasicDBObject().append("user", "2");
        mycollection.insert(doc);
    }

    @ChangeSet(order = "003", id = "InsertChangeSet3", author = "cedleg")
    public void someInsert3(DB db) {
        // This is deprecated in mongo-java-driver 3.x, use MongoDatabase instead
        // type: com.mongodb.DB : original MongoDB driver v. 2.x, operations allowed by driver are possible
        // example:
        DBCollection mycollection = db.getCollection("mycollection");
        BasicDBObject doc = new BasicDBObject().append("user", "3");
        mycollection.insert(doc);
    }

    @ChangeSet(order = "004", id = "InsertChangeSet4", author = "cedleg")
    public void someInsert4(DB db) {
        // This is deprecated in mongo-java-driver 3.x, use MongoDatabase instead
        // type: com.mongodb.DB : original MongoDB driver v. 2.x, operations allowed by driver are possible
        // example:
        DBCollection mycollection = db.getCollection("mycollection");
        BasicDBObject doc = new BasicDBObject().append("user", "4");
        mycollection.insert(doc);
    }

    @ChangeSet(order = "005", id = "InsertChangeSet5", author = "cedleg")
    public void someInsert5(DB db) {
        // This is deprecated in mongo-java-driver 3.x, use MongoDatabase instead
        // type: com.mongodb.DB : original MongoDB driver v. 2.x, operations allowed by driver are possible
        // example:
        DBCollection mycollection = db.getCollection("mycollection");
        BasicDBObject doc = new BasicDBObject().append("user", "5");
        mycollection.insert(doc);
    }

    @ChangeSet(order = "006", id = "InsertChangeSet6", author = "cedleg")
    public void someInsert6(DB db) {
        // This is deprecated in mongo-java-driver 3.x, use MongoDatabase instead
        // type: com.mongodb.DB : original MongoDB driver v. 2.x, operations allowed by driver are possible
        // example:
        DBCollection mycollection = db.getCollection("mycollection");
        BasicDBObject doc = new BasicDBObject().append("user", "6");
        mycollection.insert(doc);
    }

    @ChangeSet(order = "007", id = "InsertChangeSet7", author = "cedleg")
    public void someInsert7(DB db) {
        // This is deprecated in mongo-java-driver 3.x, use MongoDatabase instead
        // type: com.mongodb.DB : original MongoDB driver v. 2.x, operations allowed by driver are possible
        // example:
        DBCollection collection = db.getCollection(User.COLLECTION_NAME);


        for(int i=0; i< 100; i++) {
            collection.insert(BasicDBObjectBuilder
                    .start()
                    .add(User.FIELD_USER_ID, new ObjectId())
                    .add(User.FIELD_USER_FIRST_NAME, "Paul")
                    .add(User.FIELD_USER_LAST_NAME, "Camambert")
                    .add(User.FIELD_USER_CITY, "Paris")
                    .add(User.FIELD_USER_AGE, 30)
                    .get());

            collection.insert(BasicDBObjectBuilder
                    .start()
                    .add(User.FIELD_USER_ID, new ObjectId())
                    .add(User.FIELD_USER_FIRST_NAME, "Robert")
                    .add(User.FIELD_USER_LAST_NAME, "Dupont")
                    .add(User.FIELD_USER_CITY, "Paris")
                    .add(User.FIELD_USER_AGE, 82)
                    .get());

            collection.insert(BasicDBObjectBuilder
                    .start()
                    .add(User.FIELD_USER_ID, new ObjectId())
                    .add(User.FIELD_USER_FIRST_NAME, "Zoro")
                    .add(User.FIELD_USER_LAST_NAME, "Masque")
                    .add(User.FIELD_USER_CITY, "Espagne")
                    .add(User.FIELD_USER_AGE, 10)
                    .get());
        }

    }
}
