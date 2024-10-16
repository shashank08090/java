package org.example;

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
       // Student s1=(Student) context.getBean("Student1");
       // System.out.println(s1);
//        context.registerShutdownHook();
    }
}
