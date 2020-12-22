package com.atguigu.javase.bank;

public class Account {
    private double balance;

    public Account(double init_balance){
        balance = init_balance;
    }

    public double getBalance(){
        return balance;
    }

    public double deposit(double amt){
        return balance += amt;
    }

    public void withdraw(double amt){
        balance -= amt;
    }


}
