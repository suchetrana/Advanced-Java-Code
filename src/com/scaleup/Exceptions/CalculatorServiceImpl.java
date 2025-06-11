package com.scaleup.Exceptions;

public class CalculatorServiceImpl implements CalculatorService{
    public void divide(Integer... array) throws  ScaleUpException{
        int quotient ;
//        if (array[1] == 0){
//            throw  new ScaleUpException("Exception Occur.");
//        }
        CustomResource customResource = new CustomResource();
        CustomResource customResource2 = new CustomResource();
        try(customResource; customResource2) { // try-with-resources if you want to pass multiple resources in try block add ";" to it
            customResource.process();
            customResource2.process();
            quotient = array[0] / array[1];
            System.out.println("Quotient of " + array[0] + " and " + array[1] + " is " + quotient);

//        } catch (ArithmeticException exception) {
//            System.out.println("Can not divide by 0.");
//        } catch (ArrayIndexOutOfBoundsException exception){
//            System.out.println("Minimum 2 arguments are needed.");
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException exception){  //Mutli-catch Block
            System.out.println("Either Arithmetic or IndexOutOfBound exception.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}