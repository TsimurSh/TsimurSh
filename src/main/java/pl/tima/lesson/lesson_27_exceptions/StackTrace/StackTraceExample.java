package pl.tima.lesson.lesson_27_exceptions.StackTrace;

public class StackTraceExample {

    public static void main(String[] args)
    {
        method1();
    }

    public static void method1()
    {
        method2();
    }

    public static void method2()
    {
        method3();
    }


    public static void method3()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getClassName());
            System.out.println(element.getMethodName());
            System.out.println(element.getLineNumber());
        }
    }
}
