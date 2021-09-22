package Example;

import java.util.Scanner;

public class Ex1020 {

    public static void main(String[] args) {

        String x;
        String [] code;
        Scanner scanner = new Scanner(System.in);

        x = scanner.nextLine();
        code = x.split("\\-");

        String a = String.valueOf(code[0]);
        String b = String.valueOf(code[1]);

        System.out.println(a+b);
    }
}
