package org.yannart.springgarden;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Classe qui initialise l'application SpringGarden.
 */
public class SpringGardenApplication {
	
	/**
	 * Methode main ou commence le flux de l'application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Demarre le contexte de Spring
		new ClassPathXmlApplicationContext("applicationContext.xml",
				SpringGardenApplication.class);
	}
}
