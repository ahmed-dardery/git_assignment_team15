import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
			new SimpleSubscriber(),
			new ReallySimpleSubscriber(),
			new SphereCircumference(),
			new SphereVolume(),
			new CircleCircumference(),
	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		try{
			int n = Integer.parseInt(input);
			mathTopic.dispatchEvent(n);
		}catch(NumberFormatException ignored) {
			System.out.println("Your input is not a valid integer.");
		}
	}
}