import java.util.Scanner;

public class BinaryToASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter binary string: ");
        String binaryInput = scanner.nextLine();

        String[] binaryArray = binaryInput.split("(?<=\\G.{8})");

        StringBuilder asciiOutput = new StringBuilder();

        for (String binary : binaryArray) {
            int decimal = Integer.parseInt(binary, 2);
            asciiOutput.append((char) decimal);
        }

        System.out.println("ASCII output: " + asciiOutput);
    }
}
