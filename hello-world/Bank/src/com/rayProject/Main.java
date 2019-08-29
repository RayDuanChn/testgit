package com.rayProject;
public class Main {

    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        a.setAccountNum(123456);
        a.setBalance(100.00);
        a.setEmail("abc@abc.com");
        a.setPhoneNum("0987654321");

        System.out.println("The account number is " + a.getAccountNum());
        System.out.println("The balance is " +  a.getBalance());
        System.out.println("The Email is " +  a.getEmail());
        System.out.println("The phone number is " + a.getPhoneNum());

        double newBalance = a.depositFunds(45.20);
        System.out.println("The new Balance id " +  newBalance);

        Boolean l = a.withDrawFunds(30.00);
        if(l){
            System.out.println("The balance is " +  a.getBalance());
        }else{
            System.out.println("There is no enough balance!");
        }

        System.out.println("The account number is " + a.getAccountNum());
        System.out.println("The balance is " +  a.getBalance());
        System.out.println("The Email is " +  a.getEmail());
        System.out.println("The phone number is " + a.getPhoneNum());


        Account b = new Account();

        b.setName("Ray");
        b.setEmail("abc@ray.com");
        b.setNumber("12345678");
        b.setBalance(100.00);
        b.withdraw(102.20);
        b.deposit(50.3);
        b.withdraw(102.00);
    }
}
