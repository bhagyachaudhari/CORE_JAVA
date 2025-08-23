package org.example.oop.interfacetypes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Smith", 45, "Cardiology");
        System.out.println("Doctor Name: " + doctor.getName());
        System.out.println("Doctor Age: " + doctor.getAge());
        System.out.println("Doctor Specialization: " + doctor.getSpecialization());

        // Ensure the directory exists
        File directory = new File("src/main/java/resources");
        if (!directory.exists()) {
            directory.mkdirs(); // Create the directory if it doesn't exist
        }

        try (FileOutputStream fileOut = new FileOutputStream("src/main/resources/doctor.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(doctor);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
