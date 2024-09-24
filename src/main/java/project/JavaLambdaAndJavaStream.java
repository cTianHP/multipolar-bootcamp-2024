package project;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaLambdaAndJavaStream {
    public static void main(String[] args) {
        // Java Lambda & Java Stream (Aliran Data)
        // .stream() pengganti foreach
        // .filter() pengganti conditional
        List<String> data = Arrays.asList("1", "2", "3", "4");
        List<String> output = data.stream().filter(i -> i.equals("4")).toList();
        System.out.println(output);
        // Manual
        List<String> output2 = new ArrayList<>();
        for (String dat: data){
            if (dat.equals("4")) {
                output2.add(dat);
            }
        }
        System.out.println(output2);

    }
}
