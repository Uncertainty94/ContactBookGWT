package ru.reksoft.lab.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.reksoft.lab.server.domain.Contact;
import ru.reksoft.lab.server.service.ContactManager;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by mishanin on 10.05.2016.
 */
public class ServerMain {
    public List<Contact> getLst(){
        ApplicationContext context =
            new ClassPathXmlApplicationContext("config.xml");

        ContactManager cm = (ContactManager) context.getBean("contactManager");

        try {
            return cm.getContacts();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
