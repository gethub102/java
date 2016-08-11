/*
test big O time complexity
*/

public class BigO {
    public static void main(String[] args) {
        System.out.println("Test big O time complexity");
        System.out.println("product(2, 3): " + product(2, 3));
        System.out.println("power(2, 3): " + power(2, 3));
        System.out.println("mod(2, 3): " + mod(2, 3));
        System.out.println("div(2, 3): " + div(2, 3));
        System.out.println("sqrt(8): " + sqrt(8));
        System.out.println("DigitSum(8): " + DigitSum(18));
        System.out.println("pritnSortedStrings(5): ");
        printSortedStrings(5, "-");
    }
    
    /* o(b) */
    static int product(int a, int b){
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }
        return sum;
    }
    
    /* O(b) */
    static int power(int a, int b) {
        if (b < 0) return 0;
        else if (b == 0) return 1;
        else return a * power(a, b - 1);
    }
    
    /* O(1) */
    static int mod(int a, int b) {
        if (b <= 0)  return -1; //err
        int div = a / b;
        return a - div * b;
    }
    
    /* O(a/b) */
    static int div(int a, int b) {
        int count = 0;
        int sum = b;
        while (sum <= a) {
            sum += b;
            count++;
        }
        return count;
    }
    
    /* O(log n) */
    static int sqrt(int n) {
        return sqrt_helper(n, 1, n);
    }
    static int sqrt_helper(int n, int min, int max) { // need type in parameters
        if (max < min) return -1;
        int guess = (min + max) / 2;
        if (guess * guess == n) return guess;
        else if (guess * guess < n) {
            return sqrt_helper(n, guess + 1, max);
        } else {
            return sqrt_helper(n, 1, guess - 1);
        }
    }
    
    /* O(n.length()) */
    static int DigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
    /*
    the following code will print all the strings of length k where the characters are in sorted order. It does this by generating all the strings of
    length k and then checking if each is sorted. The run time is = ?
    */
    static int numChar = 26;
    static void printSortedStrings(int remaining) {
        printSortedStrings(remaining, "");
    }
    static void printSortedStrings(int remaining, String prefix) {
        if (remaining == 0) {
            if (isInOrder(prefix)) {
                System.out.println(prefix);
            }
        } else {
            for (int i = 0; i < numChar; i++) {
                char c = ithLetter(i);
                printSortedStrings(remaining - 1, prefix + c);
            }
        }
    }
    static boolean isInOrder(String prefix) {
        for (int i = 1; i < prefix.length(); i++) {
            int prev = ithLetter(prefix.charAt(i - 1));
            int curr = ithLetter(prefix.charAt(i));
            if (prev > curr) {
                return false;
            }
        }
        return true;
    }
    static char ithLetter(int i) {
        return (char)(((int)'a') + i);
    }
}
