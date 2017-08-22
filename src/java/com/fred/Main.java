package com.fred;

import com.fred.entity.User;
import com.fred.service.ServiceLocator;
import com.fred.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nimtego_loc on 19.08.2017.
 */
public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    private static final Logger LOGGER_M = LoggerFactory.getLogger("Myasnikov");
    public static void main(String[] args) {
        LOGGER.debug("Hello");
        LOGGER_M.info("FRED");

        new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService service = ServiceLocator.getUserService();

        User user = new User();
        user.setFirstName("Vasya");
        user = service.saveUser(user);

        user = service.getUser(user.getUserId());

        LOGGER.debug(user.getUserId() + " " + user.getFirstName());

        LOGGER.debug(String .valueOf(service == null));
    }
}
