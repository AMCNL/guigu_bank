package com.atguigu.javase.bank4;

public class Bank {
    private Customer [] customers;
    private int customerNumbers;

    public Bank() {
        customers = new Customer[10];
    }

    public void addCustomer(String f,String l){
        Customer customer = new Customer(f,l);
        customers[customerNumbers] = customer;
        customerNumbers++;
    }

    public int getCustomerNumbers(){
        return customerNumbers;
    }

    //返回指定索引的Customer
    public Customer getCustomer(int index){
        return customers[index];
    }
}
