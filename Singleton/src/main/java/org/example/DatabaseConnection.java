package org.example;

public class DatabaseConnection {
    private static DatabaseConnection connection;
    private DatabaseConnection() {}
    public static DatabaseConnection getInstance() {
        if(connection == null) {
            connection = new DatabaseConnection();
        }
        return  connection;
    }
    public void connectToDB() {
        System.out.println("Hey! I'm connected to db");
    }

}
