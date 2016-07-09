package chapter12Apis;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class A1LoggerDemo {
public static void main(String[] args) throws SecurityException, IOException {
	Logger logger = Logger.getLogger(A1LoggerDemo.class.getName());
	
	logger.setLevel(Level.FINE); // 1 filter by level 
	
//	for(Handler handler : logger.getParent().getHandlers()){ //2 filter by handler
//		handler.setLevel(Level.FINE);
//	}
//	
//	
	logger.log(Level.SEVERE, "1 -- Waring information");
//	logger.log(Level.CONFIG, "2 -- Waring information");
//	logger.log(Level.INFO, "3 -- Waring information");
//	logger.log(Level.OFF, "4 -- Waring information");
//	FileHandler handler = new FileHandler("%h/config.log%g.log");
//	handler.setLevel(Level.CONFIG);
//	logger.addHandler(handler);
//	logger.config("looger dynamic finished3");
}
}
