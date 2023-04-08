package week5java;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String str) {
System.out.println("*** " + str + " ***");

	}

	@Override
	public void Error(String str) {
	System.out.println("*".repeat(15+ str.length()));
	System.out.println("*** " + "Error: " + str + " ***");
	System.out.println("*".repeat(15+ str.length()));

	}

}
