import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DatabaseTest {
    public static void main(String[] args) {

        MongoClientURI connectionString = new MongoClientURI("mongodb://Nick:CS485@cluster0-shard-00-00-udju4.mongodb.net:27017,cluster0-shard-00-01-udju4.mongodb.net:27017,cluster0-shard-00-02-udju4.mongodb.net:27017/test?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin&retryWrites=true");
        MongoClient mongoClient = new MongoClient(connectionString);

        MongoDatabase onlineStore = mongoClient.getDatabase("OnlineStore");

        MongoCollection<Document> inventory = onlineStore.getCollection("Inventory");

        Document baseball = inventory.find().first();
        String filePath = baseball.find({"ImagePath":1});

    }//end main
}//end class
