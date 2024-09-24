package project;

public class DefiningMethod {
    public static void main(String[] args) {
        String output = funtionPertama();
        System.out.println(output);

        String[] names = {"Sasa", "Salsa", "Dirga"};
        System.out.println(checkSize(names));

        printName(names);

        int input = 5;
        System.out.println(input + " factorial= " + calculateFactorial(input));
    }
    static String funtionPertama(){
        return "1";
    }

    static int checkSize(String[] inputs){
        return inputs.length;
    }

    // Overloading Method (nama function/method sama dengan parameter yang berbeda)
    static void printName(String[] inputs) {
        for (String name : inputs) {
            System.out.println("Nama: " + name);
        }
    }
    static void printName(String[] inputs, int count){
        System.out.println("TEST");
    }

    static int calculateFactorial(int input){
        if(input == 0){
            return 1;
        }
        return input * calculateFactorial(input-1);
    }

}
