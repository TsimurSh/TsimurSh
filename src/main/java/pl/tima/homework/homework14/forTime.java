package pl.tima.homework.homework14;

public class forTime {
    public static void main(String[] args) {
        OUTER:
        for (int hour = 0; hour < 6; hour++){
            MIDLE:
            for (int min = 0; min < 60; min++){
                if (hour == 1 && min%10==0){
                    break OUTER;
                }
                INNER:
                for (int sec = 0; sec < 60 ; sec++) {
                    if (sec * hour > min ){
                        continue MIDLE;
                    }
                    System.out.println(hour+":"+min+":"+sec);
                }
            }
        }
    }
}
