package vin_t.codeforces.goodbye2013;

import java.util.Scanner;

/**
 * <p>
 * Vasily the Programmer loves romance, so this year he decided
 * to illuminate his room with candles.</p>
 *
 * <p>Vasily has a candles.When Vasily lights up a new candle, it
 * first burns for an hour and then it goes out. Vasily is smart,
 * so he can make b went out candles into a new candle. As a
 * result, this new candle can be used like any other new candle.
 * </p>
 *
 * <p>Now Vasily wonders: for how many hours can his candles light
 * up the room if he acts optimally well? Help him find this number.
 * </p>
 *
 * <p><b>Input</b><br/>The single line contains two integers,
 * a and b (1 ≤ a ≤ 1000; 2 ≤ b ≤ 1000)</p>
 *
 * <p><b>Output</b><br/>Print a single integer — the number of hours
 * Vasily can light up the room for.</p>
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
