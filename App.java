package week5java;



public class App {

	public static void main(String[] args) {
		AsteriskLogger logger = new AsteriskLogger();
	String str = "Hello";
		logger.Log(str);
		System.out.println();
		logger.Error(str);
		System.out.println();
		
		
		SpacedLogger logger1 = new SpacedLogger();
	logger1.Log(str);
    logger1.Error(str);
				

	}

}
