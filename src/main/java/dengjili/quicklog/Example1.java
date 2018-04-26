package dengjili.quicklog;

import org.apache.log4j.Logger;

public class Example1 {

	private final static Logger logger = Logger.getLogger(Example1.class);
	
	public static void main(String[] args) {
		// 记录debug级别的信息  
        logger.debug("This is debug message.");  
        // 记录info级别的信息  
        logger.info("This is info message.");  
        // 记录error级别的信息  
        logger.error("This is error message.");  
	}

}
