package Inputstreamreaderdemo.bytetochar;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

    public class Main {

        public static void main(String[] args) {
            try (InputStreamReader isr = new InputStreamReader(new FileInputStream("C:/Users/asus/OneDrive/Desktop/Daily Learning notes/git commands.txt"), "UTF-8")) {
                int i;
                while ((i = isr.read()) != -1) {
                    System.out.print((char) i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




