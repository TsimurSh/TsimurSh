package pl.tima.lesson.fileStreamReader;


import java.io.*;

/*
*/

public class Potoki {
        public static void main(String[] args) throws IOException {

            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Username\\Desktop\\test.txt",
                    true); // boolean append if true тогда данные не перезаписываются

            String greetings = "Привет! Добро пожаловать на JavaRush - лучший сайт для тех, кто хочет стать программистом!\r\n";

            fileOutputStream.write(greetings.getBytes());
            fileOutputStream.close();

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sours = reader.readLine();
            BufferedWriter newWriter = new BufferedWriter(new FileWriter(sours));
            StringBuilder string = new StringBuilder();

            String temp = "";
//            while (!temp.equals("exit")){
//                temp = reader.readLine();
//                string.append(temp).append(" ");
//            }
            newWriter.write(string.toString());
            newWriter.close();
            int charr = (char) ',';
            System.out.println(charr);
        }
    }



