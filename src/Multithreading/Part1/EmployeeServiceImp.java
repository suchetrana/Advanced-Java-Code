package Multithreading.Part1;

public class EmployeeServiceImp extends  Thread{
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImp(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+"started fetching from: "+ employeeRepository);
        try {
            employeeRepository.displayEmployees();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+"started fetching from: "+ employeeRepository);
    }

}
