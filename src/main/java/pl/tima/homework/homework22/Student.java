package pl.tima.homework.homework22;

public class Student {
    StringBuilder name;
    byte course;
    float grade;
    public static char[][] chars = {
                {'a', 'b', 'c', 'd', 'e', 'f'},
                {'g', 'h', 'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p', 'q', 'r'},
                {'s', 't', 'u', 'v', 'w', 'x'}};

        public static void main(String[] args) {
            printArray();

            for (int i =0; i < chars.length; i++){
                for (int j =0; j <chars[i].length; j++){
                    if ( i != 0 && j != 0 &&  i != 3 && j != 5)
                        chars [i][j] = '-';
                }
            }

            printArray();
        }

        private static void printArray() {
            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < chars[i].length; j++) {
                    System.out.print(chars[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
