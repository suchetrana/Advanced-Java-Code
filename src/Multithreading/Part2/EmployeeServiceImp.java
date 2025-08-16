package Multithreading.Part2;


public class EmployeeServiceImp extends Thread{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImp(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" started fetching from: "+ employeeRepository);
        try {
            employeeRepository.displayEmployees();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" ended fetching from: "+ employeeRepository);
    }
}
