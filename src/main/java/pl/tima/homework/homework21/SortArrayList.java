package pl.tima.homework.homework21;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static ArrayList <String> toArrayList (String ... str){
        ArrayList <String> output = new ArrayList<>();
        for (String read : str){
        output.add(read);
        }
        Collections.sort(output);
        return output;
    }

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(toArrayList("width","pacionate","clerck","chambermaid","addAll","asList"));
        ArrayList <String> listA = new ArrayList<>(toArrayList("length","intern","clerck","scrubwoman","addition","artist"));
        System.out.println(listA.equals(list));

    }
    public int [] insertionSort (int [] sortArr){
        for (int s = 1; s< sortArr.length; s++){
            int current = sortArr[s];
            int j = s-1;
            while (j >= 0 && current < sortArr[j]){
                sortArr [j+1] = sortArr[j];
                j--;
            }
            sortArr [j+1] = current;
        }
    return sortArr;
    }

}
