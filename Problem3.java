// Problem-3: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
 
//   Output: (examples)
//     1) input a = 1, then output : 1
//     2) input a = 2, then output : 1
//     3) input a = 3, then output : 1, 3, 5
//     4) input a = 4, then output : 1, 3, 5
//     5) input a = 5, then output : 1, 3, 5, 7, 9
//     6) input a = 6, then output : 1, 3, 5, 7, 9
//     .
//     .
//     7) input a = x, then output : 1, 3, 5, 7, .......

import java.util.Scanner;

class OddSeries {
    private int a;

    public OddSeries(int a) {
        this.a = a;
    }

    public void generateSeries() {
        int terms = (a % 2 == 0) ? a - 1 : a; // if even -> a-1, else a
        for (int i = 1; i <= terms; i++) {
            int odd = 2 * i - 1; // nth odd number formula
            System.out.print(odd);
            if (i < terms) {
                System.out.print(", ");
            }
        }
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        OddSeries series = new OddSeries(a);

        series.generateSeries();

        sc.close();
    }
}
