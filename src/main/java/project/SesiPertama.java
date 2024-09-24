package project;

public class SesiPertama {
    public static void main(String[] args){
        // Tipe Data Primitif
        // Number
        float iniFloat = 3.14F;
        double iniDouble = 3.14D;
        int iniInteger = 400;
        long iniLong = 3L;

        //Character
        char iniChar = 'A';

        //String
        String iniString = "Tian";

        //Boolean
        boolean iniBoolean = true;

        //Tipe data Bukan Primitif (bisa punya nilai null)
        //Integer
        Integer intNull = null;
        Float floatBukanPrimitif = 3.14F;
        Double doubleBukanPrimitif = 3.14D;
        Boolean booleanBukanPrimitif = false;
        Character charBukanPrimitif = 'u';

        // Primitif vs Bukan Primitif
        // disimpan langsung di memori  || tidak langsung disimpan
        // tidak bisa null              || bisa null

        //Conditional Statement
        int number = 20;
        if(number >= 2){
            System.out.println("Print");
        } else if(number <= 21){
            System.out.println("Print 2");
        } else {
            System.out.println("Print 3");
        }

        //Switch Case
        String buah = "Mangga";
        switch (buah){
            case "Apel":{
                System.out.println("Print");
            }
            case "Anggur":{
                System.out.println("Print Anggur");
            }
            default:
                System.out.println(buah);

        }

        //Ternary
        number = 10;
        String output = number != 10? "A":"B";
        System.out.println(output);

        //Looping
        //While
        int iniAngka = 5;

        while (iniAngka > 1) {
            System.out.println("Print "+ iniAngka);
            iniAngka--;
        }

        //Do While
        iniAngka = 3;
        do{
            System.out.println("Print "+ iniAngka);
            iniAngka--;
        } while (iniAngka > 1);

        //For Loop
        for (int i=0; i<=5;i++){
            System.out.println("Angka " + i);
        }

        // Array
        String[] names = {"tian", "arip", "aqil"};
        System.out.println(names[0]);
        for(String name: names){
            System.out.println("Nama: " + name);
        }

        int[] tests = {1,2,5,6,9};
        for (int test: tests){
            if (test <= 2){
                System.out.println("Print");
            } else {
                System.out.println(test);
            }
        }

        //Break & Continue
        for (String name: names){
            if (name.equals("arip")){
                break;
            }
            System.out.println(name);
        }

        for (String name: names){
            if (name.equals("arip")){
                continue;
            }
            System.out.println(name);
        }


    }
}
