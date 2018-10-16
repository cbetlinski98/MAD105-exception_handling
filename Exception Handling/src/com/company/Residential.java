package com.company;

public class Residential extends Customer {
    boolean senior;
    double total;

    public Residential(String customerName, String customerPhone, String customerAddress, double squareFootage, boolean senior) {
        super(customerName, customerPhone, customerAddress, squareFootage);
    }

    public Residential(String name, String phone, String address, Double footage) {
        super(name, phone, address, footage);
    }

    public boolean getSenior(){
        return senior;
    }

    public void setSenior(boolean senior){
        this.senior = senior;
    }

    public double seniorDiscount(boolean senior) {
        if (senior)
            total = ((squareFootage * 6) / 1000) * 0.85;
        else
            total = (squareFootage * 6) / 1000;
        return total;
    }
}