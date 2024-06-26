package za.ac.cput.utility;

import za.ac.cput.domain.Address;
import za.ac.cput.domain.Contact;

import java.util.UUID;

public class CustomerHelper {
    public static boolean isStringNullOrEmpty(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        return false;
    }
    public static long generateUniqueID() {
        return UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;

    }
    public static boolean isContactNullOrEmpty(Contact contact) {
        if(contact == null || contact.toString().isEmpty()){
            return true;
        }
        return false;
    }
}
