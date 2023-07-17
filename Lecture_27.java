package Recursion_Study;

public class TwoPointer {
    public static void main(String[] args) {
        int arr[] = {10, 20, 35, 50, 75, 80};
        int target = 95;
        int left = 0; // Left pointer starting at the beginning of the array
        boolean found = false; // Flag to indicate if the sum is found
        int right = arr.length - 1; // Right pointer starting at the end of the array
        
        while (left < right) {
            int sum = arr[left] + arr[right]; // Calculate the sum of elements at left and right pointers
            
            if (sum == target) {
                System.out.println("Sum is found at indices " + left + " and " + right);
                found = true;
                break;
            } else if (sum < target) {
                left++; // Move the left pointer to the right
            } else {
                right--; // Move the right pointer to the left
            }
        }
        
        if (!found) {
            System.out.println("Sum not found");
        }
    }
}
