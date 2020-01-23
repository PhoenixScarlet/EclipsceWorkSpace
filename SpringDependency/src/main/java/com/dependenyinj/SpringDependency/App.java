package com.dependenyinj.SpringDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");// for Enterprise app-ApplicationContext,for small app -BeanFactory
    	
    	
    	//Vehicle obj=(Vehicle)context.getBean("vehicle");//injects object externally i.e here using xml
       //Vehicle obj=(Vehicle)context.getBean("bike");//using annotation 
       //obj.drive();
       
       //Tyre t=(Tyre)context.getBean("tyre");
       //System.out.println(t);
       
       
       Car obj=(Car)context.getBean("car");
       obj.drive();
       
    }
}
