package ru.gulnaz.lesson4;

import java.util.HashMap;

public class Test {
    public static void main(String [] args) {
        TelephoneList telephoneList = new TelephoneList();
        telephoneList.add("bob", "2525");
        telephoneList.add("bob", "4545");
        telephoneList.add("bob", "3535");


        telephoneList.add("rute", "6565");
        telephoneList.add("rute", "7575");

        System.out.println(telephoneList.get("bob"));
        System.out.println(telephoneList.get("rute"));


        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] strings {
            "ruta", "4595", "bob231%#", "975", "25@#%$",
                    "4595", "bob231%#", "975", "25@#%$",
                    "bob231%#", "975", "25@#%$",
                    "975", "25@#%$",
                    "25@#%$"

        } ;
        for (String s : strings) {
            if (hashMap.get(s) == null)
                hashMap.put(s, 1);
        }

        else{
            hashMap.put(s, hashMap.get(s) + 1);
        }
        System.out.println(hashMap);

    }
}
