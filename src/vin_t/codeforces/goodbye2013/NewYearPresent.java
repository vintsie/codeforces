package vin_t.codeforces.goodbye2013;

import java.util.Scanner;

/**
 * New Year Present
 * Created by Vin on 14-1-20.
 */
public class NewYearPresent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cols = scanner.nextInt();
        // storing the coins of all the wallets
        int[] wallets = new int[cols];
        int i = 0;

        while (i < cols) {
            wallets[i++] = scanner.nextInt();
        }

        StringBuilder commands = new StringBuilder();

        i = 0;
        while (i < cols - 1) {
            stepForward(i++, wallets, commands);
        }

        if (wallets[i] == 1)
            commands.append("P");
        if (wallets[i] > 1) {
            for (int x = 0; x < wallets[i] - 1; x++) {
                commands.append("PLR");
            }
            commands.append("P");
        }
        System.out.println(commands.toString());
        scanner.close();
    }

    private static void stepForward(int index, int[] wallets, StringBuilder commands) {
        if (wallets[index] == 0)
            commands.append("R");
        if (wallets[index] == 1)
            commands.append("PR");
        if (wallets[index] > 1) {
            for (int i = 0; i < wallets[index] - 1; i++)
                commands.append("PRL");
            commands.append("PR");
        }
    }

//    private static String leftOrRight(int index, int walletNum) {
//        if (index == walletNum - 1)
//            return "LR";
//        return "RL";
//    }
}
