package day1;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int k = random.nextInt(9) +1;
        for(int i = 1; i < 10; i++){
            System.out.printf("%d x %d = %d\n",i ,k ,i*k);
        }
    }
}
