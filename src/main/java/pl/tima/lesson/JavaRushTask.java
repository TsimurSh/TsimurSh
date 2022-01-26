package pl.tima.lesson;


import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/*
Писатель в файл с консоли
*/

public class JavaRushTask {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sours = reader.readLine();
            BufferedWriter newWriter = new BufferedWriter(new FileWriter(sours));
            StringBuilder string = new StringBuilder();

            String temp = "";
            while (!temp.equals("exit")){
                temp = reader.readLine();
                string.append(temp).append(" ");
            }
            newWriter.write(string.toString());
            newWriter.close();
        }
    }



