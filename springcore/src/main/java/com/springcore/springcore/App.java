package com.springcore.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
        Student s = (Student)ac.getBean("student1");
        Employee e = (Employee) ac.getBean("employee1");
        System.out.println(s);
        System.out.println("-------------");
        System.out.println(e);
        System.out.println("-------------");
        ReferenceInjection ri = (ReferenceInjection) ac.getBean("aref");
        System.out.println(ri);
        System.out.println("--------------");
        ConstructorInjection ci = (ConstructorInjection) ac.getBean("ci");
        System.out.println(ci);
        System.out.println("-----------------");
        AbstractApplicationContext aac = new ClassPathXmlApplicationContext("config.xml");
        BeanLifeCycle bc = (BeanLifeCycle) aac.getBean("lifecycle");
        System.out.println("bc"+bc);
        System.out.println();
        
        BeanCycleUsingInterface bci = (BeanCycleUsingInterface) aac.getBean("lifecycleinterfcae");
        aac.destroy();
        System.out.println(bci);
        
    }
}
//registerShutDownHook();