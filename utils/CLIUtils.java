package utils;

import java.util.Scanner;

public class CLIUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.nextLine();
    }

    public static int getInt() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.print("Input harus berupa angka, coba lagi: ");
            }
        }
    }
}