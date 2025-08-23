package org.example.oop.cohesion;

public class UserService {

    public void createUser(String name, String email) {
        // Logic to create a user
        System.out.println("User created: " + name + ", Email: " + email);
    }

    public void updateUser(int userId, String name, String email) {
        // Logic to update a user
        System.out.println("User updated: ID=" + userId + ", Name: " + name + ", Email: " + email);
    }

    public void deleteUser(int userId) {
        // Logic to delete a user
        System.out.println("User deleted: ID=" + userId);
    }
}
