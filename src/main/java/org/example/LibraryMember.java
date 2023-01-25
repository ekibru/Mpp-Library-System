package org.example;

public class LibraryMember {
    private String memberId;
    private String firstname;
    private String lastName;
    private String phone;
    private CheckoutRecord list;

    public LibraryMember(String memberId, String firstname,String lastName, String phone) {
        this.memberId = memberId;
        this.firstname = firstname;
        this.phone = phone;

    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public CheckoutRecord getList() {
        return list;
    }

    public void setCheckoutRecord(CheckoutRecord list) {
        this.list = list;
    }
}
