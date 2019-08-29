package com.rayProject;

public class Account {
        private String number;
        private double balance;
        private String email;
        private String phoneNum;
        private String name;

        public void deposit(double depositAmount){
            this.balance += depositAmount;
            System.out.println("Deposit success! Current balance is " + this.balance);
        }

        public void withdraw(double withdrawAmount){
            if(this.balance >= withdrawAmount){
                this.balance -= withdrawAmount;
                System.out.println("Withdraw success! Current balance is " + String.format("%.2f", this.balance));
            }else{
                System.out.println("Withdraw fail! Only " + String.format("%.2f", this.balance) + " available! ");
            }
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNum() {
            return phoneNum;
        }

        public void setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

}
