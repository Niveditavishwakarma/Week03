package Inputstreamreaderdemo.readwritefile;
import java.io.*;
class UserInputToFile {

        public static void readwrite() {
            String fileName = "C:/Users/asus/OneDrive/Desktop/Daily Learning notes/git commands.txt";

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                 FileWriter writer = new FileWriter(fileName, true)) {

                System.out.println("Enter text (type 'exit' to quit):");

                String input;
                while (!(input = reader.readLine()).equalsIgnoreCase("exit")) {
                    writer.write(input + "\n");
                }

                System.out.println("Input has been saved to " + fileName);
            } catch (IOException e) {
                System.err.println("An error occurred while reading input or writing to the file.");
                e.printStackTrace();
            }
        }
    }


