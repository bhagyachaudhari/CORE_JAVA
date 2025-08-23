package org.example.oop.interfacetypes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        try (
                FileInputStream fileIn = new FileInputStream("src/main/resources/doctor.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Doctor doctor = (Doctor) in.readObject();
            System.out.println("Object deserialized successfully: " + doctor.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
