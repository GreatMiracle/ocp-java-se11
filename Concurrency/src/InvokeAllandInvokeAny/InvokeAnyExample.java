package InvokeAllandInvokeAny;

import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class InvokeAnyExample {

    public static void main(String[] args) {

        // Create a collection of Callable lambda expressions
        Collection<Callable<IntSummaryStatistics>> tasks = List.of(
                () -> InvokeAnyExample
                        .doSomething(1, 1111),
                () -> InvokeAnyExample
                        .doSomething(1, 1110),
                () -> InvokeAnyExample
                        .doSomething(1, 1112),
                () -> InvokeAnyExample
                        .doSomething(1, 1109)
        );

        List<Future<IntSummaryStatistics>> results = null;

        ExecutorService poolService = null;
        //  IntSummaryStatistics result = null;

        try {
            poolService = Executors.newCachedThreadPool();

            IntSummaryStatistics result = poolService.invokeAny(tasks, 1, TimeUnit.SECONDS);
//            results = poolService.invokeAll(tasks, 1, TimeUnit.SECONDS);
            System.out.println("------ Result from InvokeAny------ ");
//            if (result != null) {
//                System.out.println(result);
//            }
//            for (Future<IntSummaryStatistics> future : results) {
//                try {
//                    IntSummaryStatistics result = future.get();
//                    System.out.println(result);
//                } catch (InterruptedException | ExecutionException e) {
//                    e.printStackTrace();
//                }
//            }
            System.out.println("---------------------------------- ");

        } catch (InterruptedException | ExecutionException | TimeoutException e) {
//        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (poolService != null) {
                poolService.shutdown();
            }
        }
    }

    private static IntSummaryStatistics doSomething(int seed, int limit) {
        return Stream.iterate(seed, (t) -> t + seed)
                .limit(limit)
                .mapToInt((s) -> s)
                .summaryStatistics();

    }
}