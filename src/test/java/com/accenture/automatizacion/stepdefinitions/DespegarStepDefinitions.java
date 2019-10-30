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

import com.accenture.automatizacion.questions.*;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

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
		juliana.wasAbleTo(OpenBrowser.on(despegarpage), Click.on(despegarpage.VUELOS));
	}

	@When("^I send the information for make the reservation, (\\d+) , \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", (\\d+), \"([^\"]*)\",(\\d+),(\\d+),(\\d+),\"([^\"]*)\",\"([^\"]*)\"$")
	public void iSendTheInformationForMakeTheReservation(int id, String nombre, String apellido, String nombrec,
			String email, int numero, String direccion, int cardnumber, int expidate, int codsecurity,
			String ciudadorigen, String ciudaddestino) throws Exception {

		juliana.attemptsTo(GoTo.the(despegarpage.IMPUT_ORIGEN),
				SendKey.called(despegarpage.IMPUT_ORIGEN, ciudadorigen));
		despegarpage.IMPUT_ORIGEN.resolveFor(juliana).sendKeys(Keys.ENTER);
		juliana.attemptsTo(GoTo.the(despegarpage.IMPUT_DESTINO),
				SendKey.called(despegarpage.IMPUT_DESTINO, ciudaddestino));
		despegarpage.IMPUT_DESTINO.resolveFor(juliana).sendKeys(Keys.ENTER);
		juliana.attemptsTo(Click.on(despegarpage.DATE1), Click.on(despegarpage.OPTION_DATE1),
				Click.on(despegarpage.OPTION_DATE2), Click.on(despegarpage.BUTTON_BUSCAR),
				Click.on(despegarpage.BUTTON_SELECCIONAR), Click.on(despegarpage.BUTTON_EQUIPAJE),
				Click.on(despegarpage.RADIO_PSE), Click.on(despegarpage.DROP_BANCO));

		for (int i = 0; i < 8; i++) {
			despegarpage.DROP_BANCO.resolveFor(juliana).sendKeys(Keys.DOWN);
		}
		
		Scroll.to(despegarpage.DROP_BANCO);

		despegarpage.DROP_BANCO.resolveFor(juliana).sendKeys(Keys.ENTER);
		
		Scroll.to(despegarpage.IMPUT_CEDULA);
		juliana.attemptsTo(SendKey.called(despegarpage.IMPUT_NAME, nombre));
		
		juliana.attemptsTo(	SendKey.called(despegarpage.IMPUT_LAST_NAME, apellido));

	}

	@Then("^I validate the if i sen all the information$")
	public void iValidateTheIfISenAllTheInformation() throws Exception {

	}
}