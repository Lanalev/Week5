package week5java;


	public class SpacedLogger implements Logger {

		@Override
		public void Log(String str) {
			String msg = "";
			for (int i = 0; i < str.length(); i++) {
			msg += str.charAt(i) + " ";
			}
			
			System.out.println(msg);

		}

		@Override
		public void Error(String str) {
			String message = "";
			for (int i = 0; i < str.length(); i++) {
			message += str.charAt(i) + " ";

		}
			System.out.print("Error: " + message);
	}
	}

