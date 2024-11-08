package BT3;

import java.util.ArrayList;

public class Account {
    private String id;
    private String name;
    private double soDu;
    private ArrayList<Transaction> arr; 
    public Account(String id, String name, double soDu) {
        this.id = id;
        this.name = name;
        this.soDu = soDu;
        this.arr = new ArrayList<>(); 
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }
    public void napTien(double amount) {
    	this.soDu += amount;
        arr.add(new Transaction(true, amount));
    }

    public void rutTien(double amount) {
        if (this.soDu >= amount) {
        	this.soDu -= amount;
            arr.add(new Transaction(false, amount));
        } else {
            System.out.println("Insufficient funds for withdrawal");
        }
    }
    @Override
    public String toString() {
        return "ID: " + this.id + ", Name: " + this.name + ", Balance: " + this.soDu;
    }
    public void lichSu() {
        if (arr.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            for (Transaction transaction : arr) {
                System.out.println(transaction.toString()+",So du:"+this.soDu); 
            }
        }
    }
}
