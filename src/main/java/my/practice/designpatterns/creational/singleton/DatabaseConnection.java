package my.practice.designpatterns.creational.singleton;

public class DatabaseConnection {

    private static volatile DatabaseConnection instance = null;

    private DatabaseConnection() {

    }

    public static DatabaseConnection getInstance() {
        if(instance == null) {
            synchronized(DatabaseConnection.class) {
                if(instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }

        return instance;
    }
}
