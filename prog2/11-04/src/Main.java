import models.Member;

import javax.sound.midi.MetaMessage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the amount of members to be inserted ");
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        Member[] members = new Member[quantity];

        for (int i = 0; i < members.length; i++) {
            System.out.println("Enter the member's name:" + i);
            String name = sc.next();
            System.out.println("Enter the member's lastname: " + i);
            String lastname = sc.next();
            System.out.println("Enter the member's dni: " + i);
            String dni = sc.next();
            System.out.println("Enter the member's phone: " + i);
            String phone = sc.next();
            System.out.println("Enter the member's age: " + i);
            int age = sc.nextInt();
            System.out.println("Enter the member's year of inscription: " + i);
            int yearOfInscription = sc.nextInt();

            members[i] = new Member(name, lastname, dni, phone, age, yearOfInscription);
            System.out.println("Members inserted successfully");
        }

        System.out.println("Enter 1 if you want to search by dni");
        System.out.println("Enter 2 if you want to see if a member is an adult");

        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter the member's dni");
                String dni = sc.next();
                Member.searchByDni(dni, members);
                break;
            case 2:
                System.out.println("Enter the amount of members to be inserted");
                break;
        }
    }
}