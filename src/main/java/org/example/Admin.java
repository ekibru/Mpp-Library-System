package org.example;

import java.util.*;

public class Admin {
    public static List<String> getPhoneNums(LibraryMember [] members,LendingItem item){

        List<String> phoneNums = new ArrayList<>();

        for(LibraryMember m : members) {

            for(CheckoutRecordEntry k: m.getList().getCheckoutRecordList())
            {

                if(k.getItem().getNumCopiesLib()>0)
                {
                    if(k.getItem().equals(item))
                    {
                        //res.add(m.getFirstName()+"\n");
                        phoneNums.add(m.getPhone());
                    }
                }
            }


        }

        Collections.sort(phoneNums);

        return phoneNums;
    }
}
