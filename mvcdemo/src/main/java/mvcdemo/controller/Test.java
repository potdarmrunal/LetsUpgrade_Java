package mvcdemo.controller;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "This Is My First Java Program";
		
		int countT = 0;
		int counth = 0;
		if(one.toLowerCase().contains("t")) {
			countT++;
		} 
		if(one.contains("h")) {
			counth++;
		}
		
System.out.println("count T" + countT);
		
	}

}
