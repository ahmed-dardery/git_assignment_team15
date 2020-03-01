public class SphereCircumference implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        System.out.println("Hello, I am Sphere Circumference and I am notified with " + input);

        double radius;
        try {
            radius = Double.parseDouble(input);
            if (radius < 0) {
                System.out.println("Radius is negative.");
                return;
            }

        } catch (NumberFormatException ignored) {
            System.out.println("Radius is not a number.");
            return;
        }

        System.out.println("Radius is " + radius + ", Sphere Circumference is: " + doCalculation(radius));
    }

    public double doCalculation(double input) {
        return 2 * Math.PI * input;
    }
}