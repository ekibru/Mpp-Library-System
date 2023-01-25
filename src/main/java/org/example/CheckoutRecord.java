package org.example;

import java.util.*;

public class CheckoutRecord {
    private List<CheckoutRecordEntry> list;

    public CheckoutRecord() {
        this.list = new ArrayList<>();
    }

    public List<CheckoutRecordEntry> getCheckoutRecordList() {
        return list;
    }

    public void addCheckoutEntry(CheckoutRecordEntry l) {
        list.add(l);
    }
}
