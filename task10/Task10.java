package tasks.task10;

import java.util.Scanner;

public class Task10 {
    int reverse(int num, int res) {
        if (num > 0) {
            res = (res * 10) + num % 10;
            return reverse(num / 10, res);
        }
        else {
            return res;
        }
    }

    int onesCounter = 0;

    int countOnes() {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        if (num.equals("00"))
            return onesCounter;
        else if (num.equals("1"))
            onesCounter++;

        return countOnes();
    }

    void printEvens() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0)
            return;
        else if (num % 2 == 0)
            System.out.println(num);

        printEvens();
    }

    void printOdds() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0)
            return;
        else if (num % 2 == 1)
            System.out.println(num);

        printOdds();
    }

    void printFromLeft(int num) {
        if (num == 0)
            return;

        int last = num % 10;

        printFromLeft(num / 10);

        System.out.printf("%d ", last);
    }
}

class Task10Test {
    public static void main(String[] args) {
        Task10 tsk = new Task10();

        int reversed = tsk.reverse(12345, 0);
        System.out.println("Subtask 1");
        System.out.println(reversed);

        System.out.println("Subtask 2");
        int ones = tsk.countOnes();
        System.out.println(ones);

        System.out.println("Subtask 3");
        tsk.printEvens();

        System.out.println("Subtask 4");
        tsk.printOdds();

        System.out.println("Subtask 5");
        tsk.printFromLeft(1234567);
    }
}
