package project;

import java.util.*;

public class SesiKedua {
    public static void main(String[] args){
        // Array
//        int[] iniCollection = new int[0]; // Collection satu elemen
        int[] iniCollection = new int[4]; // Collection empat elemen
        iniCollection[0] = 1;
        iniCollection[1] = 4;
        iniCollection[2] = 7;
        iniCollection[3] = 8;

        int[] contohKedua = {1,2};

        int output1 = iniCollection[0];

        System.out.println("Length: " + iniCollection.length);

        for (int number: iniCollection){
            System.out.println(number);
        }

        //List
        //Dapat berisi beberapa elemen tanpa harus dideklarasikan ukurannya
        List<String> iniList = new ArrayList<>();
        iniList.add("1");
        iniList.add("3");
        iniList.add("4");
        iniList.add("Nama");

        System.out.println("Elemen index 0: " + iniList.get(0));
        iniList.remove(3);
        System.out.println(iniList);

        List<String> contoh = new ArrayList<>();
        contoh.add("1");
        contoh.add("2");

        contoh.set(0, "3");
        System.out.println(contoh);

        //Set (collection elemen unik)
        Set<String> sets = new HashSet<>();
        sets.add("1");
        sets.add("2");
        sets.add("3");
        sets.add("3");
        System.out.println(sets);
        System.out.println("Sets Length: " + sets.size());
        sets.remove("3");
        System.out.println(sets);

        //Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"tian");
        map.put(2,"arif");
        System.out.println(map);
    }

}
