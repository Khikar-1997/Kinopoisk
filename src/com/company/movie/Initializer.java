package com.company.movie;

import com.company.Genre;
import com.company.user.User;

import java.util.Scanner;

public class Initializer {
    static Movie initializeMovies(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create movie name");
        String name = scanner.nextLine();
        System.out.println("Create the movies genre from this list \n" +
                "COMEDY\n" +
                "FANTASY\n" +
                "THRILLER\n" +
                "HORROR\n" +
                "BIOGRAPHY");
        String genre = scanner.nextLine().toUpperCase();
        System.out.println("Create the movies duration");
        double duration = scanner.nextDouble();
        return new Movie(name,Genre.valueOf(genre),duration);
    }

//    public static User initilizeUser(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Create user name");
//
//        String name = scanner.nextLine();
//        System.out.println("Create user role from this list\n" +
//                "ADMINISTRATOR\n" +
//                "USER");
//
//    }
}
