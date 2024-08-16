package Variables;

public class LocalVariables {
	
	public void calculate(){
		int height =0;
		height+= 170;
		System.out.println("Height is : " +height + "cm");
	}

	public static void main(String[] args) {
		LocalVariables a = new LocalVariables();
		a.calculate();

	}

}
