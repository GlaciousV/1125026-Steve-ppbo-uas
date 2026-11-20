package utils;

import java.util.Scanner;

public class testing {
    private static final Scanner scanner = new Scanner(System.in);

    // 1. String dasar & dengan prompt
    public static String getString() {
        return scanner.nextLine();
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // 2. String yang tidak boleh kosong
    public static String getNonEmptyString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Input tidak boleh kosong, coba lagi.");
        }
    }

    // 3. Integer dasar & dengan prompt
    public static int getInt() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.print("Input harus berupa angka bulat, coba lagi: ");
            }
        }
    }

    public static int getInt(String prompt) {
        System.out.print(prompt);
        return getInt();
    }

    // 4. Integer dengan batas min dan max (cocok untuk menu)
    public static int getInt(String prompt, int min, int max) {
        while (true) {
            int value = getInt(prompt);
            if (value >= min && value <= max) {
                return value;
            }
            System.out.printf("Angka harus antara %d dan %d. Coba lagi.\n", min, max);
        }
    }

    // 5. Angka desimal (Double)
    public static double getDouble(String prompt) {
        System.out.print(prompt);
        while (true) {
            try {
                String input = scanner.nextLine();
                return Double.parseDouble(input.trim());
            } catch (NumberFormatException e) {
                System.out.print("Input harus berupa angka desimal, coba lagi: ");
            }
        }
    }

    // 6. Konfirmasi Ya/Tidak (Boolean)
    public static boolean getBoolean(String prompt) {
        while (true) {
            System.out.print(prompt + " (y/n): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("y") || input.equals("ya")) {
                return true;
            } else if (input.equals("n") || input.equals("tidak")) {
                return false;
            }
            System.out.println("Masukkan 'y' atau 'n'.");
        }
    }
}
