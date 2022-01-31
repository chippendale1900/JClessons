package ru.gulnaz.lesson4;
import java.util.ArrayList;
import java.util.HashMap;

public class TelephoneList {
    HashMap<String, ArrayList<String>> telephonesandNames = new HashMap<>();

        public void add(String name, String telephone) {

            if (telephonesandNames.get(name) == null) {
                ArrayList<String> telephones = new ArrayList<>();
                telephones.add(telephone);
                telephonesandNames.put(name, telephone;
            }
            else {
                telephonesandNames.get(name).add(telephone);
            }
        }

        public ArrayList<String> get(String name) {
           return telephonesandNames.get(name);
        }


}
