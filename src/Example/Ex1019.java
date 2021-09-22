package Example;

import java.util.Scanner;

public class Ex1019 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x = sc.next();

        String date[] = x.split("[.]");

        int y = Integer.parseInt(date[0]);
        int m = Integer.parseInt(date[1]);
        int d = Integer.parseInt(date[2]);

        System.out.println(String.format("%04d.%02d.%02d", y, m, d));
    }
}

