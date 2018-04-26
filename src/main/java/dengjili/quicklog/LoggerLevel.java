package dengjili.quicklog;

import org.apache.log4j.Logger;

/**
 * 
 *
 *	log4j.rootLogger=ERROR, stdout
 */
public class LoggerLevel {

	private final static Logger log = Logger.getLogger(LoggerLevel.class);
	
	public static void main(String[] args) {
		
		
		if (log.isDebugEnabled()) {
			log.debug("debug 模式开启");
		}
		
		if (log.isInfoEnabled()) {
			log.info("info 模式开启");
		}
		
		log.error("error 输出");

	}

}
