package com.Assignment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ApplicationRunnable {
	UserService userService = new UserService();
	public static void main(String[] args) {
		
		
		//Array
		Users[] users = new User[20];
		
		for (int i = 0; i < 20; i++) {
			users[i] = userService.createUser("user" + (i+1), "password" + (i+1), )
			static Scanner scanner = new Scanner(System.in);
			System.out.println("To login enter your username");
			String username = scanner.next();
			System.out.println("Enter your password");
			String password = scanner.next();
			System.out.println("Welcome" + name);
		}
		System.out.println(users);
		

	}

}
