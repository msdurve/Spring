package org.core;

import org.omg.CORBA.portable.ApplicationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{	
	public static Logger log = LoggerFactory.getLogger(App.class) ; 
	public static final String CONFIG_PATH = "beans.xml" ; 
    public static void main( String[] args )
    {
    	log.info("Guess the Number --- Start ");
    	
    	ConfigurableApplicationContext context = new  AnnotationConfigApplicationContext(AppConfig.class);  
    	
    	//NumberGenerator numberGenerator =  context.getBean("numberGenerator" , NumberGenerator.class)  ; 
    	NumberGenerator numberGenerator =  context.getBean(NumberGenerator.class)  ; 
    	int randomNumber =  numberGenerator.getNext() ; 
    	
    	
    	log.debug("Number =  {}  {} " , randomNumber , randomNumber) ;
    	
    	Game game = context.getBean(Game.class) ; 
    	
    	//game.reset();
    	
    	context.close();
    	
    }
}
