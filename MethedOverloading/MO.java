package MethedOverloading;

public class MO {

	void add(int a) {
		System.out.println("integer : "+a);
	}
	
	void add(String n) {
		System.out.println("String : "+n);
	}
	
	void add(int a, String n) {
		System.out.println("Integer-String : "+a+','+n);
	}
	
	void add(String n, int a) {
		System.out.println("String-Integer : "+n+','+a);
	}
	public static void main(String[] args) {
		MO n= new MO();
		 n.add(100);
		 n.add("Nimap");
		 n.add(100, "Nimap");
		 n.add("Nimap",100);

	}

}





	
	
	

