package com.cedleg.mongoconfig.mongochangelog;

import com.cedleg.model.User;
import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import com.mongodb.*;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ChangeLog(order = "004")
public class FindChangeLog {

    @ChangeSet(order = "001", id = "FindChangeSet", author = "cedleg")
    public void someUpdate1(DB db) {
        // This is deprecated in mongo-java-driver 3.x, use MongoDatabase instead
        // type: com.mongodb.DB : original MongoDB driver v. 2.x, operations allowed by driver are possible
        // example:
        DBCollection mycollection = db.getCollection("mycollection");
        BasicDBObject query = new BasicDBObject().append("user", "10");
        BasicDBObject query2 = new BasicDBObject().append("user", "1");
        //Cursor cursor = mycollection.find(query);

        /*
        BasicDBObject andQuery = new BasicDBObject();
        List<BasicDBObject> obj = new ArrayList<BasicDBObject>();
        obj.add(new BasicDBObject("user", "10"));
        obj.add(new BasicDBObject("user", "1"));


        Cursor cursor = mycollection.find(andQuery);

        while(cursor.hasNext()){
            DBObject value = cursor.next();
            System.out.println(value.get("user"));
        }
        */
    }

    @ChangeSet(order = "002", id = "FindChangeSet2", author = "cedleg")
    public void someUpdate2(final MongoTemplate template) {

        List<User> users = template.findAll(User.class, User.COLLECTION_NAME);
        System.out.println(users.toString());
        System.out.println("*---------------------------------------------*");

        List<User> users2 = template.find(Query.query(Criteria.where(User.FIELD_USER_FIRST_NAME).is("Paul")), User.class, User.COLLECTION_NAME);
        System.out.println(users2.toString());
        System.out.println("*---------------------------------------------*");

        long countNamed = template.count(Query.query(Criteria.where(User.FIELD_USER_FIRST_NAME).exists(true)), User.COLLECTION_NAME);
        System.out.println(countNamed);
        System.out.println("*---------------------------------------------*");


        DBCollection collection = template.getCollection(User.COLLECTION_NAME);

        Map<String, Object> conditions = new HashMap<String, Object>();
        conditions.put(User.FIELD_USER_FIRST_NAME, "Paul");
        conditions.put(User.FIELD_USER_FIRST_NAME, "Zoro");

        Map<String, Object> projections = new HashMap<String, Object>();
        projections.put(User.FIELD_USER_FIRST_NAME, 1);
        projections.put(User.FIELD_USER_CITY, 1);

        DBObject request = new BasicDBObject(conditions);
        DBObject project = new BasicDBObject(projections);
        DBCursor cursor = collection.find(request, project);

        while(cursor.hasNext()){
            DBObject value = cursor.next();
            System.out.println(value.get(User.FIELD_USER_FIRST_NAME) + " " + value.get(User.FIELD_USER_CITY));
        }

        System.out.println("*---------------------------------------------*");

    }
}
