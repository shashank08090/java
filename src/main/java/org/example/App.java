package org.example;
import org.example.dao.UserDao;
import org.example.pojo.User;
/**
 * Hello world!
 *
 */

import org.example.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

       AbstractApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
        Student s1=(Student) context.getBean("Student1");
       // System.out.println(s1);
        context.registerShutdownHook();
        UserDao userDao = context.getBean(UserDao.class);
        User user = new User();
        user.setId(1); // Set the ID
        user.setName("Shashank"); // Set the name
        user.setEmail(null); // Set the email to null

        // Save the user to the database
        int result = userDao.saveUser(user);

        // Print the result
        if (result > 0) {
            System.out.println("User saved successfully.");
        } else {
            System.out.println("Failed to save user.");
        }
    }
}
