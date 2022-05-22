package com.company.Main;

class T3{
    String Owner,No_Account;
    int balance;
    public T3(String owner, String Acc_No, int balance){
        this.Owner=owner;
        this.No_Account=Acc_No;
        this.balance=balance;
    }
    // Getters
    public String getOwner()
    {
        return Owner;
    }
    public String getNo_Account()
    {
        return No_Account;
    }
    public int getbalance()
    {
        return balance;
    }
    // Setters
    public void setOwner(String nv)
    {
        this.Owner = nv;
    }
    public void setNo_Account(String nv)
    {
        this.No_Account = nv;
    }
    public void setbalance(int nv) {
        this.balance = nv;
    }

    //Method Transfer
    public void Transfer(int amount) throws NotEnoughMoneyException{
        if(balance>amount){
            balance-=amount;
        }
        else{
            throw new NotEnoughMoneyException("There is no enough money in your account");
        }
    }

}

public class Account {
    public static void main(String[]args) throws NotEnoughMoneyException {
        T3 User01 = new T3("Jack","0000 1111 2222 3333 4444",9000);
        T3 User02 = new T3("Samuel","0000 2211 3322 4433 1144",7000);
        try{
            User02.Transfer(8000);
        }
        catch(NotEnoughMoneyException ex){
            System.out.println(ex);
        }
        finally{
            System.out.println("Amount left on Jack's Bank is " + User01.balance);
            System.out.println("Amount left on Samuel's Bank is " + User02.balance);
        }

    }
}
