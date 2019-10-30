/**
 * 
 */
package com.accenture.automatizacion.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

/**
 * @author Juliana
 *
 */
public class OpenBrowser implements Task {
	
	private PageObject page;

	public OpenBrowser(PageObject page) {
		this.page = page;
	}

	@Override
	@Step("{0} opens the browser on the '#page' ")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));

	}

	public static OpenBrowser on(PageObject page) {

		return Tasks.instrumented(OpenBrowser.class, page);
	}

}
