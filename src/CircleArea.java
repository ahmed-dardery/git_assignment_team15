
public class CircleArea extends DoubleSubscriber { 
 @Override
    public void preProcess(int input) throws Exception {
        System.out.print("Hello, I'm CircleArea , and I'm notified with: " + input + " as radius. ");
        if (input < 0) throw new Exception("Negative radius is invalid!"); }

	
	 @Override
    public double doCalculation(int input) {
       return  Math.PI * input *input;
    }

    @Override
    public void printAnswer(double output) {
       System.out.println("Circle Area is: " + output);
   }   
}


 
