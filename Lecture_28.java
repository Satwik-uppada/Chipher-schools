package Strings;

public class Reverse_String {
    public static void main(String[] args) {
        String name = "CipherSchools";
        int n = name.length();

        // Method 1: Using character array and loop
        char[] arr = new char[name.length()];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[n - i - 1] = name.charAt(i);
        }
        String rev = new String(arr);
        System.out.println(rev);
        // Time Complexity: O(n)
        // Not an in-place reversal

        // Method 2: Using concatenation in a loop
        String revs = "";
        for (int i = n - 1; i >= 0; i--) {
            revs += name.charAt(i);
        }
        // Time complexity: O(n), but new objects are created in each iteration
        System.out.println(revs);

        // Approach 3: Using two-pointer approach
        char[] arr1 = name.toCharArray();
        int left = 0;
        int right = arr1.length - 1;
        while (left < right) {
            char temp = arr1[left];
            arr1[left] = arr1[right];
            arr1[right] = temp;
            left++;
            right--;
        }
        String res = new String(arr1);
        System.out.println(res);
    }
}
