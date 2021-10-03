package tasks.task1;

import java.util.Random;
import java.util.Arrays;

class Task1 {
    static int[] array =  {1 , 4, 54, 65};

    private static int forBasedSum(int[] arr){
        int sum = 0;
        for(int elem: arr){
            sum += elem;
        }
        return sum;
    }

    private static int whileBasedSum(int[] arr){
        int sum = 0;
        int i = 0;
        int arrLen = arr.length;
        while(i < arrLen){
            sum += arr[i];
            i++;
        }
        return sum;
    }

    private static int doWhileBasedSum(int[] arr){
        int sum = 0;
        int i = 0;
        int arrLen = arr.length;
        do{
            sum += arr[i];
            i++;
        }while(i < arrLen);
        return sum;
    }

    private static void garmPrint(){
        for(int i = 1; i <= 10; i++){
            System.out.println(1 / (float)i);
        }
    }

    private static void generator(){
        int[] arr = new int[10];
        Random r = new Random();
        for(int i = 0; i < 10; i++){
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void fact(int num){
        int fact = 1;
        int number = num;

        while(number >= 1){
            fact *= number;
            number--;
        }

        System.out.println(fact);
    }

    public static void main(String[] args) {
        System.out.println("subtask 1");
        System.out.println(forBasedSum(array));
        System.out.println("subtask 2");
        System.out.println(whileBasedSum(array));
        System.out.println("subtask 3");
        System.out.println(doWhileBasedSum(array));

        System.out.println("subtask 4");
        for(String arg: args)
            System.out.println(arg);

        System.out.println("subtask 5");
        garmPrint();

        System.out.println("subtask 6");
        generator();

        System.out.println("subtask 7");
        fact(6);
    }
}
