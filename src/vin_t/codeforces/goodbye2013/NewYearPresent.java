package vin_t.codeforces.goodbye2013;

import java.util.Scanner;

/**
 * <p>The New Year is coming! That's why many people today
 * are busy preparing New Year presents. Vasily the Programmer
 * is no exception.</p>
 *
 * <p>Vasily knows that the best present is (no, it's not a
 * contest) money. He's put n empty wallets from left to right
 * in a row and decided how much money to put in what wallet.
 * Vasily decided to put ai coins to the i-th wallet from the
 * left.</p>
 *
 * <p>Vasily is a very busy man, so the money are sorted into
 * the bags by his robot. Initially, the robot stands by the
 * leftmost wallet in the row. The robot can follow instructions
 * of three types: go to the wallet that is to the left of the
 * current one (if such wallet exists), go to the wallet that
 * is to the right of the current one (if such wallet exists),
 * put a coin to the current wallet. Due to some technical
 * malfunctions the robot cannot follow two "put a coin"
 * instructions in a row.</p>
 *
 * <p>Vasily doesn't want to wait for long, so he wants to write
 * a program for the robot that contains at most 106 operations
 * (not necessarily minimum in length) the robot can use to put
 * coins into the wallets. Help him.</p>
 *
 * <p><b>Input</b><br></br>The first line contains integer n (2 ≤ n ≤ 300)
 * — the number of wallets. The next line contains n integers
 * a1, a2, ..., an (0 ≤ ai ≤ 300).It is guaranteed that at least
 * one ai is positive.</p>
 *
 * <p><b>Output</b><br></br>Print the sequence that consists of k
 * (1 ≤ k ≤ 106) characters, each of them equals: "L", "R" or "P".
 * Each character of the sequence is an instruction to the robot.
 * Character "L" orders to move to the left, character "R" orders
 * to move to the right, character "P" orders the robot to put a
 * coin in the wallet. The robot is not allowed to go beyond the
 * wallet line. In other words, you cannot give instructions "L"
 * if the robot is at wallet 1, or "R" at wallet n.</p>
 *
 * <p>As a result of the performed operations, the i-th wallet
 * from the left must contain exactly ai coins. If there are
 * multiple answers, you can print any of them.</p>
 *
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
