/**
 * 
 */
package com.accenture.automatizacion.stepdefinitions;

import org.apache.tools.ant.taskdefs.Sleep;
import org.hamcrest.core.Is;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.accenture.automatizacion.tasks.GoTo;
import com.accenture.automatizacion.tasks.OpenBrowser;
import com.accenture.automatizacion.tasks.SendKey;
import com.accenture.automatizacion.userinterfaces.DespegarPage;
import com.google.inject.Inject;
import com.accenture.automatizacion.questions.*;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.statematchers.IsEnabledMatcher;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import net.thucydides.core.annotations.Managed;

/**
 * @author Juliana
 *
 */
public class DespegarStepDefinitions {

	@Managed(driver = "chrome")
	private WebDriver driver;
	private DespegarPage despegarpage;
	private Actor juliana = Actor.named("juliana");

	@Before
	public void setUp() {

		juliana.can(BrowseTheWeb.with(driver));

	}

	@Given("^I need to go to the page despagar\\.com$")
	public void iNeedToGoToThePageDespagarCom() throws Exception {
		juliana.wasAbleTo(OpenBrowser.on(despegarpage));
	}

	@When("^I send the information for make the reservation, \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void iSendTheInformationForMakeTheReservation(String id, String nombre, String apellido, String nombrec, String email, String numero, String direccion, String codarea, String ciudadorigen, String ciudaddestino) throws Exception {

	
	juliana.attemptsTo(SendKey.called(ciudadorigen,ciudaddestino,nombre,apellido,id,direccion,email,codarea,numero));
		
		/*juliana.attemptsTo(GoTo.the(despegarpage.IMPUT_ORIGEN),
				SendKey.called(despegarpage.IMPUT_ORIGEN, ciudadorigen));
		despegarpage.IMPUT_ORIGEN.resolveFor(juliana).sendKeys(Keys.ENTER);
		juliana.attemptsTo(GoTo.the(despegarpage.IMPUT_DESTINO),
				SendKey.called(despegarpage.IMPUT_DESTINO, ciudaddestino));
		despegarpage.IMPUT_DESTINO.resolveFor(juliana).sendKeys(Keys.ENTER);
		juliana.attemptsTo(Click.on(despegarpage.DATE1), Click.on(despegarpage.OPTION_DATE1),
				Click.on(despegarpage.OPTION_DATE2), Click.on(despegarpage.BUTTON_BUSCAR));
				
				if(despegarpage.POPAP.resolveFor(juliana).isCurrentlyEnabled()) {
					
					juliana.attemptsTo(Click.on(despegarpage.POPAP));
				}
				
			juliana.attemptsTo(Click.on(despegarpage.BUTTON_SELECCIONAR), Click.on(despegarpage.BUTTON_EQUIPAJE));
			
			
			if(despegarpage.RADIO_PSE.resolveFor(juliana).isCurrentlyEnabled()) {
				
				juliana.attemptsTo(Click.on(despegarpage.RADIO_PSE));
				
				
			}else {
				
				juliana.attemptsTo(Click.on(despegarpage.RADIO_PSE2));
			}
					
					
					
					
					juliana.attemptsTo(Click.on(despegarpage.DROP_BANCO));
	
		for (int i = 0; i < 8; i++) {
			despegarpage.DROP_BANCO.resolveFor(juliana).sendKeys(Keys.DOWN);
		}
		
		Scroll.to(despegarpage.DROP_BANCO);

		despegarpage.DROP_BANCO.resolveFor(juliana).sendKeys(Keys.ENTER);
		
		Scroll.to(despegarpage.IMPUT_CEDULA);
		juliana.attemptsTo(SendKey.called(despegarpage.IMPUT_NAME, nombre));
		
		juliana.attemptsTo(	SendKey.called(despegarpage.IMPUT_LAST_NAME, apellido));
		
		juliana.attemptsTo(	SendKey.called(despegarpage.IMPUT_CEDULA, id));
		
		for (int i = 0; i < 3; i++) {
			despegarpage.IMPUT_DEPART.resolveFor(juliana).sendKeys(Keys.UP);
			
		}
		despegarpage.IMPUT_DEPART.resolveFor(juliana).sendKeys(Keys.ENTER);
		
		juliana.attemptsTo(	SendKey.called(despegarpage.IMPUT_CIUDAD, ciudadorigen));
		
		juliana.attemptsTo(	SendKey.called(despegarpage.IMPUT_DIRECCION, direccion));
		*/
				}

	
	@Then("^I validate the if i sen all the information$")
	public void iValidateTheIfISenAllTheInformation() throws Exception {

	}
}