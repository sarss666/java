package practice;

import java.awt.*;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class GetDigitOfNumber {

    public static int[] getDigits(long n){
        Deque<Integer> stack = new LinkedList<>();
        while (n > 0){
            int digit = (int)(n % 10);
            stack.push(digit);
            n = n / 10;
        }
        int[] array = new int[stack.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLong()){
            long n = scanner.nextLong();

            System.out.println(Arrays.toString(getDigits(n)));
        }
    }

}
