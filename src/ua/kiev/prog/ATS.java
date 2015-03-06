package ua.kiev.prog;

import java.util.HashMap;

public class ATS {

    private static HashMap<String,Phone> phoneList = new HashMap<String,Phone>();

    public static void setPhone(String number, Phone phone) {
        phoneList.put(number, phone);
    }

    static void dial(String number) {
        Phone phone = phoneList.getOrDefault(number, null);
        if(phone == null) {
            System.out.println("Number is missing!");
            return;
        }
        phone.answer();
    }
}
