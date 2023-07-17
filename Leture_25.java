// Recursion: Printing numbers in descending order
static void printDescending(int n) {
    if (n < 1) return; // Base case: stop recursion when n < 1
    System.out.println(n); // Print the current number
    printDescending(n - 1); // Recursively call printDescending with n-1
}

public static void main(String[] args) {
    int n = 5;
    printDescending(n);
}


// Fibonacci using recursion
static int fibo(int n) {
    if (n < 2) return n; // Base case: return n if n is 0 or 1
    int a = fibo(n - 1); // Recursive call to fibo for n-1
    int b = fibo(n - 2); // Recursive call to fibo for n-2
    return a + b; // Return the sum of previous two Fibonacci numbers
}


// Binary Search
int arr[] = {2, 5, 8, 12, 23, 38, 56, 72};
int x = 23;
int l = 0;
int r = arr.length - 1;
while (l <= r) {
    int mid = (l + r) / 2;
    if (arr[mid] == x) {
        System.out.println("Value found at index: " + mid);
        return; // Value found, exit the loop and the function
    } else if (x < arr[mid]) {
        r = mid - 1; // Adjust the right boundary
    } else {
        l = mid + 1; // Adjust the left boundary
    }
}
System.out.println("Value not found");
