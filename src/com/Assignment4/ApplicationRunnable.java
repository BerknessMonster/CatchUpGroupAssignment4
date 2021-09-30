package com.Assignment4;

public class ApplicationRunnable {

	public static void main(String[] args) {
		UserService userService = new UserService();
		
		//Array
		Users[] users = new User[20];
		
		for (int i = 0; i < 20; i++) {
			users[i] = userService.createUser("user" + (i+1), "password" + (i+1), )
			static Scanner scanner = new Scanner(System.in);
		}
		System.out.println(users);
		

	}

}
