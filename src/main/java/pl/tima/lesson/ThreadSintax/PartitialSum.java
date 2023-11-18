package pl.tima.lesson.ThreadSintax;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class SumNumbers {
    private static final Long value = 1_000_000_000L;
    private static Long sum = 0L;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<Long>> numbers = new ArrayList<>();
        long valueDivideBy10 = value / 10;
        for (int i = 0; i < 10; i++) {
            long from = valueDivideBy10 * i + 1;
            long to = valueDivideBy10 * (i + 1);
            PartitialSum task = new PartitialSum(from, to);
            var futurePartSum = executor.submit(task);
            numbers.add(futurePartSum);
            for (Future<Long> result : numbers
            ) {
                sum += result.get();
            }
            executor.shutdown();
            System.out.println("Total sum =" + sum);
        }
    }
}

class PartitialSum implements Callable<Long> {
    long localSum;
    long from;
    long to;

    public PartitialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    public Long call() {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.println("Sum grom: " + from + "+ to: " + to + " = " + localSum);
        return localSum;
    }
}
