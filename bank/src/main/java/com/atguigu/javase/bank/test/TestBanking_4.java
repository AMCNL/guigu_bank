package com.atguigu.javase.bank.test;

/*
 * This class creates the program to test the banking classes.
 * It creates a new Bank, sets the Customer (with an initial balance),
 * and performs a series of transactions with the Account object.
 */

import com.atguigu.javase.bank4.Bank;
import com.atguigu.javase.bank4.Customer;

public class TestBanking_4 {

	public static void main(String[] args) {
		Bank bank = new Bank();

		// Add Customer Jane, Simms
		// code
		bank.addCustomer("Jane", "Smms");

		// Add Customer Owen, Bryant
		// code
		bank.addCustomer("Owen", "Bryant");

		// Add Customer Tim, Soley
		// code
		bank.addCustomer("Tim", "Soley");

		// Add Customer Maria, Soley
		// code
		bank.addCustomer("Maria", "Soley");

		for (int i = 0; i < bank.getCustomerNumbers(); i++) {
			Customer customer = bank.getCustomer(i);

			System.out.println("Customer [" + (i + 1) + "] is "
					+ customer.getLastName() + ", " + customer.getFirstName());
		}
	}
}
