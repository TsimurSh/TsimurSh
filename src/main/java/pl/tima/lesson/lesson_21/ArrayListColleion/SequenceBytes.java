package pl.tima.lesson.lesson_21.ArrayListColleion;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Самые частые байты
*/

public class SequenceBytes {
        public static void main(String[] args) throws Exception {
            BufferedReader readName = new BufferedReader (new InputStreamReader(System.in));
            // String fileName;
            FileInputStream input = new FileInputStream(readName.readLine());
            ArrayList <Integer> intList = new ArrayList<>();

            while (input.available() > 0 ){
                intList.add(input.read());
            }
            input.close();
            Collections.sort(intList);
            ArrayList <Integer> mostSequenceMAX = new ArrayList<>();
            ArrayList <Integer> mostSequence = new ArrayList<>();
            mostSequence.add(intList.get(0));

            int count = 1;
            int max = 1;
            for (int i = 0; i < intList.size(); i ++){
                if (intList.get(i). equals(intList.get(i+1))){
                    max++;
                    mostSequenceMAX.add(intList.get(i+1));
                }
                else if (max > count){
                    mostSequence.clear();
                    count = max;
                    mostSequence.addAll(mostSequenceMAX);
                    mostSequenceMAX.clear();
                }
                else {max = 1;
                    mostSequenceMAX.clear();
                }

            }
            if (max > count){
                for (Integer intI : mostSequenceMAX){
                    System.out.print(intI + " ");
                }}
            else {
                for (Integer intI : mostSequence){
                    System.out.print(intI + " ");
                }
            }
        }
    }
