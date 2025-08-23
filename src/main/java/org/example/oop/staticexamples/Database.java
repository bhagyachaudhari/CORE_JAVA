package org.example.oop.staticexamples;

public class Database {
    static String connection;

    static {
        System.out.println("Initializing database connection...");
        connection = "Connected to DB";
    }

    public static void getConnection() {
        System.out.println(connection);
    }

    private void getdata() {
        System.out.println("Fetching data from the database..." + connection);
    }

    public static void main(String[] args) {
        getConnection();
    }
}
