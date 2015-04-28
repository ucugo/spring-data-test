package util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import repositories.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by uchegc01 on 28/04/2015.
 */
public class SqlPersonGenerator {

    private static final String insert = "insert";
    private static final  String dbName = "test";
    private static final String into = "into";

    private static final String FIRST_NAMES[] = {"Patrick","Steven","Kevin","Harry","Niranjan","David","Stephen","Bradly","Anthony","Daniel"};
    private static final String LAST_NAMES[] = {"Clinton","Fitzgerald","Bush","Kennedy","Davis","Wellbeck","Sonia","Sanchez","Arteta","Madu"};


    private static final Logger LOGGER = LoggerFactory.getLogger(SqlPersonGenerator.class);


    private static void generatePersonSQL(){


        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for(int count = 0 ; count < 100; count++){
            builder.append("INSERT INTO person ");
            builder.append("(");
            builder.append("firstName ,lastName");
            builder.append(") ");
            builder.append("VALUES (");
            builder.append(FIRST_NAMES[random.nextInt(10)]).append(", ").append(LAST_NAMES[random.nextInt(10)]);
            builder.append(") ");
            builder.append(";");
            builder.append("\n");
        }
        System.out.println(builder.toString());

    }

    public static void main(String args[]){
        SqlPersonGenerator.generatePersonSQL();
    }
}
