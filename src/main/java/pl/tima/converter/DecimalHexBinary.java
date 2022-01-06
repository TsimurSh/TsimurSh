package pl.tima.converter;

 public class DecimalHexBinary {
     /*
         private static final String HEX = "0123456789abcdef";

             public static void main(String[] args) {
                 int decimalNumber = 1256;
                 System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
                 String hexNumber = "4e8";
                 System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
             }

             public static String toHex(int decimalNumber) {
                 String hexNumber = "";
                 if (decimalNumber <= 0) {
                     return hexNumber;
                 }

                 while (decimalNumber != 0) {
                     hexNumber = HEX.charAt(decimalNumber % 16) + hexNumber;
                     decimalNumber = decimalNumber / 16;
                 }
                 return hexNumber;
             }

             public static int toDecimal(String hexNumber) {
                 int decimalNumber = 0;
                 if (hexNumber == null) {
                     return decimalNumber;
                 }

                 for (int i = 0; i < hexNumber.length(); i++) {
                     decimalNumber = 16 * decimalNumber + HEX.indexOf(hexNumber.charAt(i));
                 }
                 return decimalNumber;
             }
         }

             public static void main(String[] args) {
                 int decimalNumber = Integer.MAX_VALUE;
                 System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
                 String binaryNumber = "1111111111111111111111111111111";
                 System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
             }

             public static String toBinary(int decimalNumber) {
                 String binaryNumber = "";
                 if (decimalNumber <= 0) {
                     return binaryNumber;
                 }

                 while (decimalNumber != 0) {
                     binaryNumber = decimalNumber % 2 + binaryNumber;
                     decimalNumber = decimalNumber / 2;
                 }
                 return binaryNumber;
             }

             public static int toDecimal(String binaryNumber) {
                 int decimalNumber = 0;
                 if (binaryNumber == null) {
                     return decimalNumber;
                 }

                 for (int i = 0; i < binaryNumber.length(); i++) {
                     int index = binaryNumber.length() - 1 - i;
                     int value = Character.getNumericValue(binaryNumber.charAt(index));
                     decimalNumber += value * Math.pow(2, i);
                 }
                 return decimalNumber;
             }
         }
     } */
public static void main(String[] args) {
        String string = "JavaRush";
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            print(charArray[i]);
        }
    }

    private static void print(int number) {
        String result = String.format("Номер символа %s в таблице Unicode - %d, а в двоичной системе - %s",+
                (char) number, number, toBinary(number));
        System.out.println(result);
    }

    public static String toBinary(int number) {
        String result = "";
        while (number != 0) {
            result = number % 2 + result;
            number /= 2;
        }
        return result;
    }
}
