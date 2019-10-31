/**
 * 
 */
package com.accenture.automatizacion.tasks;

import org.openqa.selenium.Keys;

import com.accenture.automatizacion.interactions.ClicksAndScrolls;
import com.accenture.automatizacion.questions.PseQuestion;
import com.accenture.automatizacion.userinterfaces.DespegarPage;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * @author Juliana
 *
 */
public class SendKey implements Task {

	private DespegarPage despegar;
	private static String ciudadorigen;
	private static String ciudaddestino;
	private static String nombre;
	private static String apellido;
	private static String id;
	private static String direccion;
	private static String email;
	private static String codarea;
	private static String numero;
	
	
	
	

	

	public SendKey(String ciudadorigen,String ciudaddestino,String nombre,String apellido,String id,String direccion,String email,String codarea,String numero) {
		super();
		this.ciudadorigen = ciudadorigen;
		this.ciudaddestino=ciudaddestino;
		this.nombre=nombre;
		this.apellido=apellido;
		this.id=id;
		this.direccion=direccion;
		this.email=email;
		this.codarea=codarea;
		this.numero=numero;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Enter.theValue(ciudadorigen).into(DespegarPage.IMPUT_ORIGEN));
		DespegarPage.IMPUT_ORIGEN.resolveFor(actor).sendKeys(Keys.ENTER);
		
		actor.attemptsTo(Enter.theValue(ciudaddestino).into(DespegarPage.IMPUT_DESTINO));
		
		DespegarPage.IMPUT_DESTINO.resolveFor(actor).sendKeys(Keys.ENTER);
		
		actor.attemptsTo(ClicksAndScrolls.called());
		
	
		
    despegar.DROP_BANCO.resolveFor(actor).sendKeys(Keys.ENTER);
		
	actor.attemptsTo(Scroll.to(despegar.IMPUT_DIRECCION));	
		
		
		
		actor.attemptsTo(Enter.theValue(nombre).into(despegar.IMPUT_NAME));
		actor.attemptsTo(Enter.theValue(apellido).into(despegar.IMPUT_LAST_NAME));
		actor.attemptsTo(Enter.theValue(id).into(despegar.IMPUT_CEDULA));
		
		
		for (int i = 0; i < 3; i++) {
			despegar.IMPUT_DEPART.resolveFor(actor).sendKeys(Keys.UP);
			
		}
		//despegar.IMPUT_DEPART.resolveFor(actor).sendKeys(Keys.ENTER);
		
		
		
		actor.attemptsTo(Enter.theValue(ciudadorigen).into(despegar.IMPUT_CIUDAD));
		
	//	despegar.IMPUT_CIUDAD.resolveFor(actor).sendKeys(Keys.DOWN);
		despegar.IMPUT_CIUDAD.resolveFor(actor).sendKeys(Keys.ENTER);
		
		
		
	//	Scroll.to(despegar.IMPUT_NAME2);
		
		
		actor.attemptsTo(Enter.theValue(direccion).into(despegar.IMPUT_DIRECCION));
		actor.attemptsTo(Scroll.to(despegar.PAIS_RESIDENT));
		
		actor.attemptsTo(Enter.theValue(nombre).into(despegar.IMPUT_NAME2));
		
		actor.attemptsTo(Enter.theValue(apellido).into(despegar.IMPUT_LAST_NAME2));
		actor.attemptsTo(Enter.theValue(id).into(despegar.IMPUT_CEDULA2));
		actor.attemptsTo(Enter.theValue(email).into(despegar.IMPUT_EMAIL));
		actor.attemptsTo(Enter.theValue(email).into(despegar.IMPUT_CONFIRM_EMAIL));
		actor.attemptsTo(Enter.theValue(codarea).into(despegar.IMPUT_COD_AREA));
		actor.attemptsTo(Enter.theValue(numero).into(despegar.INPUT_NUM));
		
		
		
	}

	public static SendKey called(String ciudadorigen,String ciudaddestino,String nombre,String apellido,String id,String direccion,String email,String codarea,String numero){
        return instrumented(SendKey.class,ciudadorigen,ciudaddestino,nombre,apellido,id,direccion,email,codarea,numero);
    }

	
}