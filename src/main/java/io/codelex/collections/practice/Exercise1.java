package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Audi");
        arrayList.add("BMW");
        arrayList.add("Honda");
        arrayList.add("Mercedes");
        arrayList.add("VolksWagen");
        arrayList.add("Mercedes");
        arrayList.add("Tesla");

        System.out.println("ArrayList:");
        for (String brand : arrayList) {
            System.out.println(brand);
        }

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Audi");
        hashSet.add("BMW");
        hashSet.add("Honda");
        hashSet.add("Mercedes");
        hashSet.add("VolksWagen");
        hashSet.add("Mercedes");
        hashSet.add("Tesla");

        System.out.println("\nHashSet:");
        for (String brand : hashSet) {
            System.out.println(brand);
        }

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Audi", "Germany");
        hashMap.put("BMW", "Germany");
        hashMap.put("Honda", "Japan");
        hashMap.put("Mercedes", "Germany");
        hashMap.put("VolksWagen", "Germany");
        hashMap.put("Tesla", "USA");

        System.out.println("\nHashMap:");
        for (String brand : hashMap.keySet()) {
            String origination = hashMap.get(brand);
            System.out.println(brand + " -> " + origination);
        }
    }
}
