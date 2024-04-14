public class CheckIfArrayIsPalindromic {

    public static void main(String[] args) {
        int[] array = {0,1,2,1,0};
        boolean palindrome = CheckIfArrayIsPalindromic.isPalindrome(array);
        if (palindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }

    }
    public static boolean isPalindrome(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
