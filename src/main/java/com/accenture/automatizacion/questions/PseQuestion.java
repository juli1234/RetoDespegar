/**
 * 
 */
package com.accenture.automatizacion.questions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.accenture.automatizacion.interactions.ClicksAndScrolls;
import com.accenture.automatizacion.userinterfaces.DespegarPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

/**
 * @author 1020491006
 *
 */
public class PseQuestion implements Question<Boolean> {

	private DespegarPage despegar;

	@Override
	public Boolean answeredBy(Actor actor) {

		String pse = Text.of(despegar.PSE_VALIDATE).viewedBy(actor).asString();
		

		if (pse.equalsIgnoreCase("PSE") && despegar.RADIO_PSE.resolveFor(actor).isCurrentlyEnabled()) {

			actor.attemptsTo(Click.on(despegar.RADIO_PSE));

			return true;
		}else {
			
			actor.attemptsTo(Click.on(despegar.RADIO_PSE2));
			
			return true;
		}

		
	}

	public static PseQuestion at(){
	     return new PseQuestion();
	 }
}