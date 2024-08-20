package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		logger.info("This is the information message");
		logger.error("This is the error message");
		logger.warn("This is the error message");
		logger.fatal("This is the error message");
		System.out.println("Completed");
	}

}
