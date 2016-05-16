package ru.reksoft.lab.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.reksoft.lab.server.domain.Contact;
import ru.reksoft.lab.server.service.ContactManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mishanin on 13.05.2016.
 */
public class ServerMain {

    public static List<Contact> getCo() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");

        ContactManager cm = (ContactManager) context.getBean("contactManager");

        try {
            return cm.getContacts();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
