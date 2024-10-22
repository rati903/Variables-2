public class Main {
    public static void main(String[] args) {
        int x = 5, y = 10;
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + ", y = " + y);
        int x1 = 5, y1 = 10;
        x1 = x1 + y1;
        y1 = x1 - y1;
        x1 = x1 - y1;
        System.out.println("x = " + x1 + ", y = " + y1);
        double num = 10.234;
        double aramtelinum = num - (int)num;
        System.out.println(aramtelinum);
        int number = 123;
        if (number >= 100 && number <= 999) {
            System.out.println(number + " samnishnaa.");
        } else {
            System.out.println( number + " araa samnishna.");
        }
        char smallLetter = 'r';
        char bigLetter = (char)(smallLetter - 32);
        System.out.println(bigLetter);
        double n = 14.4;
        int rounded = (int)(n + 0.5);
        System.out.println(rounded);

        n = 11.5;
        rounded = (int)(n + 0.5);
        System.out.println(rounded);
        int a = 10, b = 12, k = 3;
        int numSquaresA = a / k;
        if (a % k != 0) {
            numSquaresA++;
        }
        int numSquaresB = b / k;
        if (b % k != 0) {
            numSquaresB++;
        }
        int numSquares = numSquaresA * numSquaresB;

        System.out.println("საჭიროა: " + numSquares + " კვადრატი");
        int totalSeconds = 3665;
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        if (hours > 0) {
            System.out.print(hours + ":");
        } else {
            System.out.print("0:");
        }

        if (minutes > 0) {
            System.out.print(minutes + ":");
        } else {
            System.out.print("0:");
        }

        if (seconds > 0) {
            System.out.println(seconds);
        } else {
            System.out.println("0");
        }
        totalSeconds = 3665;
         hours = totalSeconds / 3600;
         minutes = (totalSeconds % 3600) / 60;
         seconds = totalSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);









    }
}