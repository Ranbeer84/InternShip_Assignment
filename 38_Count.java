import java.util.Scanner; // Import the Scanner class

public class CharacterCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        countCharacters(inputString);

        scanner.close();
    }

    public static void countCharacters(String str) {
        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("The string is : " + str);
        System.out.println("letter: " + letterCount);
        System.out.println("space: " + spaceCount);
        System.out.println("number: " + numberCount);
        System.out.println("other: " + otherCount);
    }
}