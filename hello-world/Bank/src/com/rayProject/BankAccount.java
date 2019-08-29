package com.rayProject;

public class BankAccount {
    private int accountNum;
    private double balance;
    private String email;
    private String phoneNum;

    public void setAccountNum(int n){
        this.accountNum = n;
    }

    public void setBalance(double b){
        balance = b;
    }

    public void setEmail(String e){
        email = e;
    }

    public void setPhoneNum(String p){
        phoneNum = p;
    }

    public int getAccountNum(){
        return accountNum;
    }

    public double getBalance(){
        return balance;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNum(){
        return phoneNum;
    }

    public double depositFunds(double funds){
        balance = balance + funds;
        int tempBalance = (int)(balance * 100);
        balance = (double)(tempBalance / 100);
        return balance;
    }

    public boolean withDrawFunds(double funds){
        if(funds < balance){
            balance = balance - funds;
            return true;
            //return balance;
        }else{
            //System.out.print("There is no enough balance!");
            return false;
        }
    }

}
