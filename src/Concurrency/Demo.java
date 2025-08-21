package Concurrency;

import Concurrency.repository.EmployeeRepository;
import Concurrency.repository.impl.EmployeeRepositoryImpl1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started fetching");
        EmployeeServiceImpl employeeServiceImpl = null;
        EmployeeRepository[] employeeRepositories = { new EmployeeRepositoryImpl1()};

        long startTime = System.currentTimeMillis();

//        ExecutorService executorService = Executors.newSingleThreadExecutor(3);
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < employeeRepositories.length; i++) {
            employeeServiceImpl = new EmployeeServiceImpl(employeeRepositories[i]);
            executorService.execute(employeeServiceImpl);
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed in " + (System.currentTimeMillis() - startTime) + " milliseconds");
        System.out.println(Thread.currentThread().getName() + " finished fetching");
    }
}
