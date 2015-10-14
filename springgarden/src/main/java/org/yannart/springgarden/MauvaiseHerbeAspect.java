package org.yannart.springgarden;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.annotation.Resource;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * Cette classe implemente tout le mal de la mauvaise herbe ;-).
 */
@Aspect
@Component
public class MauvaiseHerbeAspect {
	
	/**
	 * Mauvaise herbe qui vole les nutriments.
	 */
	@Resource
	IPlante mauvaiseHerbe;
	
	/**
	 * Advice associe a l'execution d'une methode avec le prefixe "nourri" d'un
	 * bean avec le suffixe "Malade".
	 * 
	 * @param joinPoint
	 *            reference au point de jonction de l'aspect.
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	@Around("execution(* nourri*(..)) && bean(*Malade)")
	public void mauvaiseHerbeAdvice(final ProceedingJoinPoint joinPoint)
			throws IllegalAccessException, InvocationTargetException {
		
		// On sait que l'objet destin de l'appel est une Plante
		IPlante plante = (IPlante) joinPoint.getTarget();
		
		// On sait que le JoinPoint est une methode
		Method method = ((MethodSignature) joinPoint.getSignature())
				.getMethod();
		
		System.out.println("    * mauvaise herbe sent la methode "
				+ method.getName() + " sur " + plante.getNomPlante());
		
		// Ce qu'allais recevoir la plante est recu par la mauvaise herbe
		method.invoke(mauvaiseHerbe, joinPoint.getArgs());
	}
}
