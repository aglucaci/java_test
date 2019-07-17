/**
 * 
 */
package helloworld.java;

/**
 * @author alex
 *
 */
public class HelloWorld {
	//System.out.println("Waht does this do?"); // error
	/**
	 * 
	 */
	//public HelloWorld() {
		// TODO Auto-generated constructor stub
		//System.out.println("Hello World! 2019");
	//}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World! 2019 (BIOINFORMATICS)");
		System.out.println("Works this way too");
		System.out.println(args);
		int x = 10;
		double doubOne = 3 + 2 + x; // do some math here.
		String msg = "Poopie";
		
		System.out.println(doubOne);
		
		//msg = msg + toString(doubOne);
		
		System.out.println("message length: " + msg.length());
		
		//foo();
		//System.out.println(String[]);
		int y = 100;
		if (y > 10) {
			System.out.println("y: " + y);
		}
		else if (y < 10){
			System.out.println("Nope");
		}
		else {
			System.out.println("Yeet");
		}
		
		int api = 10;
		switch (api) {
		case 10: System.out.println("10 smacks"); break;
		}
		
		String msg2 = "AAAAA";
		int minLength = 10;
		while (msg2.length() <= minLength) {
			msg2 = msg2 + "B";
		}
		// also try the do-while loop
		
		System.out.println(msg2);
		
		
		int i;
		for (i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}
		
		foo();
		
	}
	
	/**
	 * 
	 * DOCUMENTAITON ABOUT FUNCTION
	 * @param param
	 * @return
	 */
	
	public static double Poopie(double param) {
		System.out.println("in poopie");
		return param * 10;
	}
	
	public static void Poopie2(double param) {
		System.out.println("in poopie 2");
		//return param * 10;
	}
	
	public static void foo() {
		boolean b = true;
		final boolean falseBool = false;
		System.out.println("IN FOO");
		
	}
	
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
	
	//System.out.println("Hello World! 2019 (BIOINFORMATICS)");
}
