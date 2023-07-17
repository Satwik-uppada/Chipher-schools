package Strings;
public class Main {
    public boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        String str = s1 + s1; // Concatenate s1 with itself
        return str.contains(s2); // Check if s2 is a substring of str
    }

    public static void main(String[] args) {
        Main solution = new Main();        
        String s1 = "rotation";
        String s2 = "tionrota";
        boolean result = solution.areRotations(s1, s2);

        System.out.println("Are " + s1 + " and " + s2 + " rotations of each other? " + result);
    }
}
