public class Reverse_String {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.print(s);
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o','w'};
        reverseString(s);
    }
}
