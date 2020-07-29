package Call_function_from_Java;

import java.util.Random;

public class Random_Number {
    public static void main(String[] args){
        Random random = new Random();

        int randomGeneratedNumber = random.nextInt();
        System.out.println(randomGeneratedNumber);

        // show random value between two specific numbers
        int max = 15, min = 10;
        int randomGeneratedNumber2 = min + random.nextInt(max - min + 1);
        System.out.println(randomGeneratedNumber2);
    }
}
