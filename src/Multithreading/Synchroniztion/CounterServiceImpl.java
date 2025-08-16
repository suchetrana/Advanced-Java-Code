package Multithreading.Synchroniztion;

public class CounterServiceImpl implements CounterService{
    private int count;
    @Override
    public int getCount() {
        return count;
    }

    @Override
    public synchronized void incrementCount() {
       ++count;
   }
}
