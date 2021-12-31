package everybodyintothepool;

public class InsufficientElementsException  extends RuntimeException{
  
  public void throwError(){
    System.out.println("Condition not satisfied! Please Try Again");
  }
  
}
