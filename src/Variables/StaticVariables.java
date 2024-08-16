package Variables;

public class StaticVariables {
	public static int radius;
	private static final double pi = 3.14;
	public static void main(String[] args) {
		radius = 3;
		System.out.println("Circumference of circle: "+ 2*pi*radius);
	}

}
