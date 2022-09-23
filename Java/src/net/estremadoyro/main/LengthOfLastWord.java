package net.estremadoyro.main;

public class LengthOfLastWord {
    public int main() {
        String word = "l";
        return lengthOfLastWord(word);
    }

    private int lengthOfLastWord(String s) {
        char[] letters = s.toCharArray();
        char space = ' ';
        int length = 0;
        System.out.printf("Input word: %s%n", s);

        for (int i = 0; i < letters.length; i++) {
            System.out.printf("letters length: %d%n", letters.length);

            int j = letters.length - i - 1;
            System.out.printf("j: %d%n", j);
            if (letters[j] != space) {
                length++;
            }
            if (length > 0 && letters[j] == space) {
                return length;
            }
        }

        return length;
    }
}
