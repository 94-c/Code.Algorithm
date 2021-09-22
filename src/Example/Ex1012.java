package Example;

import java.util.Scanner;

public class Ex1012 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();

        //String.format()메소드
        String y = String.format("%.6f", x);

        System.out.print(y);
        sc.close();

    }
}


