package Variables;

public class InstanceVariables {
	public int rollNum;
	public String name;
	public int totalMarks;
	public long number;

	public static void main(String[] args) {
		InstanceVariables in = new InstanceVariables();
		in.rollNum =10036;
		in.name = "shourjo";
		in.totalMarks = 100;
		in.number = 983512345;
		
		System.out.println(in.rollNum);
		System.out.println(in.name);
		System.out.println(in.totalMarks);
		System.out.println(in.number);
		
		
	}

}
