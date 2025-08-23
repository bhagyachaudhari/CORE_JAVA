package org.example.java17;

public class Client {

    public static void main(String[] args) {
        String day = "MONDAY";

        String typeOfDay = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

        System.out.println(typeOfDay);  // Output: Weekday


        int number = 3;

        String result = switch (number) {
            case 1, 2 -> "One or Two";
            case 3 -> {
                System.out.println("Matched 3");
                yield "Three"; //Use yield to return a value from a block.
            }
            default -> "Other";
        };

        System.out.println(result);  // Output: Matched 3 \n Three

        Object obj = "Hello, Java 17!";
        if (obj instanceof String s) {
            System.out.println("String length: " + s.length());
        } else {
            System.out.println("Not a String");
        }

        String json = """
                    {
                        "name": "Alice",
                        "age": 30,
                        "city": "Wonderland"
                    }
                    """;

        System.out.println(json);
    }
}
