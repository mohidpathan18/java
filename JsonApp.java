package javaappl.pkg6;

import org.json.JSONObject;

public class JsonApp {

    static class Person {
        String name;
        int age;
        String email;

        Person(String name, int age, String email) {
            this.name = name;
            this.age = age;
            this.email = email;
        }
    }

    public static void main(String[] args) {

        Person person = new Person("PATHAN MOHID ", 18, "MOHID@gmail.com");

        JSONObject obj = new JSONObject();
        obj.put("name", person.name);
        obj.put("age", person.age);
        obj.put("email", person.email);

        System.out.println("Encoded JSON:");
        System.out.println(obj.toString(2));

        JSONObject parsed = new JSONObject(obj.toString());

        Person p = new Person(
                parsed.getString("name"),
                parsed.getInt("age"),
                parsed.getString("email")
        );

        System.out.println("\nDecoded:");
        System.out.println("Name: " + p.name);
        System.out.println("Age: " + p.age);
        System.out.println("Email: " + p.email);
    }
}