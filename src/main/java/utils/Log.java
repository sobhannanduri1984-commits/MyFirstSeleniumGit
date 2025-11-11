package utils;

import org.slf4j.*;
public class Log {

	public static final Logger logger = LoggerFactory.getLogger(Log.class);
	
	public static void info(String msg) {
		logger.info(msg);
	}
}
