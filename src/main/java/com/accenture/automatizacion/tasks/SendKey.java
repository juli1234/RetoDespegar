/**
 * 
 */
package com.accenture.automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

/**
 * @author Juliana
 *
 */
public class SendKey implements Task {

	

	private static Target target;
	private static String text;

	public SendKey(Target target, String text) {
		this.target = target;
		this.text = text;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Enter.theValue(text).into(target));
		// actor.attemptsTo(Enter.theValue("medellin").into(trivago.IMPUT_CITY));

	}

	public static SendKey called(Target target, String text) {
		return new SendKey(target, text);

	}

}
