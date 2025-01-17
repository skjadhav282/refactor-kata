package com.digite.kata.refactoring;

import java.util.Vector;

public class Customer {
    private String _name;
    private Vector<Rental> _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public Vector<Rental> getRental() {
        return _rentals;
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        Invoice w_invoice = new Invoice();
        return Invoice.generateInvoice(_name, _rentals);
    }
}