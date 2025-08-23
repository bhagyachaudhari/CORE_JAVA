package org.example.oop.coupling;

class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connecting to MySQL Database...");
    }
}