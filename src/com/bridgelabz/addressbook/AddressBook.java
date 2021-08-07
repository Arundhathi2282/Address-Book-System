package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.addressbook.dto.Person;

public class AddressBook {
	static final Scanner SC = new Scanner(System.in);
	ArrayList<Person> personList = new ArrayList<>();
	Person person = new Person();

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System....!");
		AddressBook addressBook = new AddressBook();
		addressBook.addContact();

	}

	/**
	 * Adding new Contact to the Address Book
	 */
	public void addContact() {

		person.setFirstName(SC.next());
		person.setLastName(SC.next());
		person.setAddress(SC.next());
		person.setCity(SC.next());
		person.setState(SC.next());
		person.setZip(SC.next());
		person.setPhoneNumber(SC.next());
		person.setEmail(SC.next());
		personList.add(person);
		System.out.println(personList);
		yesOrNo();
	}

	/**
	 * Asking the user that Do you want to perform again or not
	 */
	public void yesOrNo() {
		System.out.println("Do you want to perform again");
		System.out.println("Choose one Y or N");
		char choice = SC.next().charAt(0);
		if (choice == 'Y' || choice == 'y') {
			addContact();
		}

	}

}
