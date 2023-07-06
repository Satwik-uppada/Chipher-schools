public class TimeComplexity {
    // Check if a number is prime (naive approach)
    static boolean isPrime1(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Check if a number is a prime (optimized approach)
    static boolean isPrime2(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 100000;
        long start = System.currentTimeMillis(); // Note the time before function call
        System.out.println(isPrime1(n));
        long end = System.currentTimeMillis(); // Note the time after the function executed
        System.out.println("Time taken by isPrime1(): " + (end - start)); // Time taken by function1 to be executed

        start = System.currentTimeMillis(); // Note the time before function call
        System.out.println(isPrime2(n));
        end = System.currentTimeMillis(); // Note the time after the function executed
        System.out.println("Time taken by isPrime2(): " + (end - start)); // Time taken by function2 to be executed
    }
}
