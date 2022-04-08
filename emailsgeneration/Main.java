package com.emailsgeneration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Valid Email-Id : ");
        String email_id = sc.next();
        String regex = "[a-z]+[./+/a-zA-Z0-9]*[@][a-z]+[.][a-z]{2,4}[./a-z]{0,4}";
        System.out.println(email_id.matches(regex));


    }
}
