package com.techelevator.view;

import java.io.File;
import java.util.Scanner;

public class ReadFromFileUsingScanner {
        public static void main(String[] args) throws Exception {
            File file = new File("C:\\Users\\Student\\workspace\\nlr-12-module-1-capstone-team-4\\vendingmachine.csv");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine())
                System.out.println(sc.nextLine());
        }
    }