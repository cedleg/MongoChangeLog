package com.cedleg.mongoconfig.mongochangelog;

import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;

@ChangeLog(order = "003")
public class RemoveChangeLog {

    @ChangeSet(order = "001", id = "RemoveChangeSet", author = "cedleg")
    public void someInsert1(DB db) {
        // This is deprecated in mongo-java-driver 3.x, use MongoDatabase instead
        // type: com.mongodb.DB : original MongoDB driver v. 2.x, operations allowed by driver are possible
        // example:
        DBCollection mycollection = db.getCollection("mycollection");
        BasicDBObject doc = new BasicDBObject().append("user", "3");
        mycollection.remove(doc);
    }
}
