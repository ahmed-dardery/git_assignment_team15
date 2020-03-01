import java.util.Scanner;

public class CircleCircumference implements ISubscriber {
    
     @Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		System.out.println("Hello, I am CircleCircumference subscriber and I am notified with " + input);
                display(input);
	}
        
    void display(String input){ // accept input and check if valid or not then call get_CircleCircumference and display the result.
        int radius=0;
        try{ //check if the input can converted to integer or not ..
        radius=Integer.parseInt(input); // convert input String to integer.
	if (radius<0) {System.out.println(" Sorry,You enterd invalid radius. "); return; } //its invalid if the input radius < 0.
        }catch (NumberFormatException e) {
            System.out.println(" invalid input ");
            System.out.println("  "+ e.getMessage());
            return;
        }
        double circumference = get_CircleCircumference(radius);
        System.out.println(" Circumference of a Circle = " + circumference);
    }
    
    double get_CircleCircumference(double radius){ //calc CircleCircumference.
        double circumference;
        circumference = 2 * Math.PI * radius;
        return circumference;
    }
    
   
    
        

}
