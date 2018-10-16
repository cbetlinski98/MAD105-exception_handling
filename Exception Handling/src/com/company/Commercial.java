package com.company;

public class Commercial extends Customer {
    boolean multi;
    double total;

    public Commercial(String customerName, String customerPhone, String customerAddress, double squareFootage, boolean multi) {
        super(customerName, customerPhone, customerAddress, squareFootage);
    }

    public Commercial(String name, String phone, String address, Double footage) {
        super(name, phone, address, footage);
    }

    public boolean getMulti(){
        return multi;
    }

    public void setMulti(boolean multi){
        this.multi = multi;
    }

    public double multiDiscount(boolean multi) {
        if (multi)
            total = ((squareFootage * 5) / 1000) * 0.90;
        else
            total = (squareFootage * 5) / 1000;
        return total;
    }
}