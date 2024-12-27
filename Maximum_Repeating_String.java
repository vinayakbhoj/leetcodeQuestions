public class Maximum_Repeating_String {
    public static int maxRepeating(String sequence, String word) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        str.append(word);
        while (sequence.contains(str) == true) {
            count++;
            str.append(word);
        }
        return count;
    }

    public static void main(String[] args) {
        String sequence = "ababac";
        String word = "ab";
        maxRepeating(sequence,word);
    }
}
