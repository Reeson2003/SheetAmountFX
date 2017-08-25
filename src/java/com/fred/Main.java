package com.fred;

import com.fred.controller.Header;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by nimtego_loc on 19.08.2017.
 */
public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    private static final Logger LOGGER_M = LoggerFactory.getLogger("Myasnikov");
    public static void main(String[] args) {
        LOGGER.debug("Hello");
        LOGGER_M.info("FRED");
        Header header = new Header();
        header.running();

/*        new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService service = ServiceLocator.getUserService();

        User user = new User();
        user = service.saveUser(user);
        user = service.getUser(user.getUserId());*/
    }
}
