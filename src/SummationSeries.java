
public class SummationSeries implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		int sum=((Integer.parseInt(input) * (Integer.parseInt(input)+1))) / 2 ;
        System.out.println("The summation of series = "  + sum);
		
	}

}
