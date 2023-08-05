package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = null;
    }

    public PhoneBook() {
        this(null);
    }

    public void add(String name, String phoneNumber) {
        if (!hasEntry(name)) {
            ArrayList<String> list = new ArrayList<>();
            list.add(phoneNumber);
            phonebook.put(name, list);

        }
        phonebook.get(name).add(phoneNumber);
    }

    public void addAll(String name, String... phoneNumbers) {
        if (!hasEntry(name)) {
            ArrayList<String> list = new ArrayList<>();
            list.addAll(List.of(phoneNumbers));
            phonebook.put(name, list);

        }
        phonebook.get(name).addAll(List.of(phoneNumbers));
    }

    public void remove(String name) {

    }

    public Boolean hasEntry(String name, String phoneNumber) {
        if (name  == null || phoneNumber == null){
            return false;
        }
        return phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String result = "";
        if (phonebook.containsValue(phoneNumber)){
            for (Map.Entry<String, List<String>> entry: phonebook.entrySet()){
                if (Objects.equals(entry.getValue(), phoneNumber)){
                    result += entry.getKey();
                }
            }
        }
//        return result;
//        ArrayList<String> temp = new ArrayList<>();
//        for (Map.Entry<String, List<String>> pn: phonebook.entrySet()){
//            if (Objects.equals(phoneNumber, pn.getValue())){
//                temp.add(pn.getKey());
//            }
//        }
//        return String.valueOf(temp);
        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return null;
    }
}
