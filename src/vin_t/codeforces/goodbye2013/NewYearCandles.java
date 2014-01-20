package vin_t.codeforces.goodbye2013;

import java.util.Scanner;

/**
 *
 * Created by Vin on 14-1-20.
 */
public class NewYearCandles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candles = scanner.nextInt(), lightedHours = 0, burnedCandles = 0;
        final int b = scanner.nextInt();

        while (true) {
            // burn
            lightedHours++;
            candles--;
            burnedCandles++;

            if (burnedCandles == b) {
                candles++;
                burnedCandles = 0;
            }
            if (candles < 1)
                break;
        }
        System.out.println(lightedHours);
        scanner.close();
    }

}
