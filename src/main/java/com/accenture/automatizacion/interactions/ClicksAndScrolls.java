/**
 * 
 */
package com.accenture.automatizacion.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import com.accenture.automatizacion.questions.PseQuestion;
import com.accenture.automatizacion.tasks.SendKey;
import com.accenture.automatizacion.userinterfaces.DespegarPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

/**
 * @author 1020491006
 *
 */
public class ClicksAndScrolls implements Interaction {

	
	private DespegarPage despegar;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
	/*	juliana.attemptsTo(Click.on(despegarpage.DATE1), Click.on(despegarpage.OPTION_DATE1),
				Click.on(despegarpage.OPTION_DATE2), Click.on(despegarpage.BUTTON_BUSCAR));*/
		
		
		actor.attemptsTo(Click.on(despegar.DATE1), Click.on(despegar.OPTION_DATE1),
				Click.on(despegar.OPTION_DATE2), Click.on(despegar.BUTTON_BUSCAR));
		
		if(despegar.POPAP.resolveFor(actor).isCurrentlyEnabled()) {
			
			actor.attemptsTo(Click.on(despegar.POPAP));
		}
		
		actor.attemptsTo(Click.on(despegar.BUTTON_SELECCIONAR));
		
		
		if(despegar.BUTTON_EQUIPAJE.resolveFor(actor).isCurrentlyEnabled()) {
			
		actor.attemptsTo(Click.on(despegar.BUTTON_EQUIPAJE));
		}
		
		
		
		actor.asksFor(PseQuestion.at());
		
		
		actor.attemptsTo(Click.on(despegar.DROP_BANCO));
		
		for (int i = 0; i < 8; i++) {
			despegar.DROP_BANCO.resolveFor(actor).sendKeys(Keys.DOWN);
		}
	actor.attemptsTo(Scroll.to(despegar.DROP_BANCO));	
	}
	
	
	public static ClicksAndScrolls called(){
        return instrumented(ClicksAndScrolls.class);
	
	

}
	}
