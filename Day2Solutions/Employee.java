class Employee {

	String name =  "Saurab";
	String City = "Chennai";
	int age = 23;

	void display(){
		System.out.println("The name is " + this.name);
		System.out.println("The age is " + this.age);
		System.out.println("The city is " + this.City);
	}

	public static void main(String args[]) {
		Employee ep1 = new Employee();
		System.out.println("Object One Called...");
		ep1.display();
		Employee ep2 = new Employee();
		System.out.println("\nObject Second Called...");
		ep2.display();
	}
}