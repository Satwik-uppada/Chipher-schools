// Anagram check
static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length())
        return false;
    
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    int n = s1.length();
    int[] frequency1 = new int[256];
    int[] frequency2 = new int[256];
    
    for (int i = 0; i < n; i++) {
        int index = s1.charAt(i) - 'a';
        frequency1[index]++;
        
        int index2 = s2.charAt(i) - 'a';
        frequency2[index2]++;
    }
    
    for (int i = 0; i < 256; i++) {
        if (frequency1[i] != frequency2[i])
            return false;
    }
    
    return true;
}

//----------------------------------------------------------

// Palindrome check
static boolean checkPalindrome(String s) {
    s = s.toLowerCase();
    int left = 0;
    int right = s.length() - 1;
    
    while (left < right) {
        if (s.charAt(left) != s.charAt(right))
            return false;
        left++;
        right--;
    }
    
    return true;
}
