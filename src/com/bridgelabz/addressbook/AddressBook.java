package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.addressbook.dto.Person;

public class AddressBook {

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System....!");
		Contact contact = new Contact();
		contact.performOperations();
	}
}
