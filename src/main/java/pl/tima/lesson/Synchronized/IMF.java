package pl.tima.lesson.Synchronized;

/*public class IMF {
        private static IMF imf;

        public static IMF getFund() {
            synchronized (IMF.class) {
                if (imf == null) {
                    imf = new IMF();
                }
            }
            return imf;
        }
        private IMF() {
        }
    }
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/*
Заметки
*/

public class IMF {
    public static void main(String[] args) {
        new NoteThread().start();
        new NoteThread().start();
    }

    public static class Note {

        public static final List<String> notes = new ArrayList<>();

        public static void addNote(String note) {
            notes.add(0, note);
        }

        public static void removeNote(String threadName) {
            String note = notes.remove(0);
            if (note == null) {
                System.out.println("Другая нить удалила нашу заметку");
            } else if (!note.startsWith(threadName)) {
                System.out.println("Нить [" + threadName + "] удалила чужую заметку [" + note + "]");
            } else {
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                PrintStream console = new PrintStream(stream);
                console.println("Нить [" + threadName + "] удалила свою заметку [" + note + "]");
            }
        }
    }
    public static class NoteThread extends Thread{

        public void run(){
            int i = 1000;
            do {
                try {
                    Note.addNote(getName() + "-Note" + i);
                    Thread.sleep(1);
                }
                catch (InterruptedException interup){
                    interup.printStackTrace();
                }
                Note.removeNote(getName());
                i--;
            }
            while (i > 0);
        }
    }
}
