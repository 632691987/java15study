package org.jdk15study;

public class Application1
{
    public static void main(String[] args) {
        System.getenv().forEach((s1, s2) -> {
            System.out.println(s1 + "=" + s2);
        });

        System.out.println("======================================================================");
        System.out.println("======================================================================");
        System.out.println("======================================================================");

        System.getProperties().entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        });
    }
}
