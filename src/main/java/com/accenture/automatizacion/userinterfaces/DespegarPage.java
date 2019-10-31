/**
 * 
 */
package com.accenture.automatizacion.userinterfaces;



import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * @author Juliana
 *
 */
@DefaultUrl("https://www.despegar.com.co/vuelos/	")
public class DespegarPage extends PageObject {
	

	
	public static final Target IMPUT_ORIGEN = Target.the("origen").located(By.xpath("//*[@placeholder=\"Ingresa desde dónde viajas\" or class=\"input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-origin-input sbox-primary sbox-places-first places-inline\" ]"));
	public static final Target OPTION_DATE1 = Target.the("opcion").located(By.xpath("/html/body/div[4]/div/div[5]/div[2]/div[4]/span[1]"));
	public static final Target IMPUT_DESTINO = Target.the("destino").located(By.xpath("//*[@placeholder=\"Ingresa hacia dónde viajas\" or  class=\"input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-destination-input sbox-secondary sbox-places-second places-inline\"]"));
	public static final Target VUELOS = Target.the("vuelos").located(By.xpath("//*[@class=\"button-circle-label\"]"));
	public static final Target DATE1 = Target.the("date1").located(By.xpath("//*[@class=\"input-container sbox-bind-event-click-start-date\"]"));
	public static final Target OPTION_DATE2 = Target.the("date2").located(By.xpath("/html/body/div[4]/div/div[5]/div[2]/div[4]/span[8]"));
	public static final Target BUTTON_BUSCAR = Target.the("buscar").located(By.xpath("//*[@class=\"sbox-button -ml3-l -mt5-l\"]"));
	public static final Target BUTTON_SELECCIONAR = Target.the("seleccionar").located(By.xpath("//*[@class=\"-md eva-3-btn -primary\" or href=\"javascript:;\" ]"));
	
	
	public static final Target POPAP = Target.the("popap").locatedBy("//*[@class=\"dreck-modal-keep\"]");
	public static final Target BUTTON_EQUIPAJE= Target.the("equipaje").locatedBy("//*[@class=\"eva-3-btn -lg -primary btn-yes\" ]");
	public static final Target RADIO_PSE = Target.the("pse").locatedBy("//*[@for=\"payment-method-2\"]");
	public static final Target RADIO_PSE2= Target.the("pse2").locatedBy("//*[@for=\"payment-method-5\"]");
	public static final Target PSE_VALIDATE =Target.the("validate").locatedBy("//*[@id=\"checkout-content\"]/div[1]/payment-component/payment-method-selector/div/ul/li[3]/p/label/span[2]");
	public static final Target DROP_BANCO = Target.the("banco").located(By.id("card-selector-0"));
	
	public static final Target IMPUT_NAME = Target.the("name").locatedBy("//*[@name=\"formData.paymentData.cashPayments[0].invoice.firstName\" ]");
	public static final Target IMPUT_LAST_NAME = Target.the("lastname").locatedBy("//*[@id=\"invoice-last-name-0\" ]");
	public static final Target IMPUT_CEDULA = Target.the("cedula").locatedBy("//*[@id=\"invoice-fiscal-identification-number-0\" ]");
	public static final Target IMPUT_DEPART = Target.the("departamento").locatedBy("//*[@id=\"invoice-fiscal-address-state-0\"]");
	public static final Target IMPUT_CIUDAD = Target.the("ciudad").locatedBy("//*[@id=\"invoice-fiscal-address-city-CASH_TRANSFER_BOG-0\"]");
	public static final Target IMPUT_DIRECCION = Target.the("direccion").locatedBy("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/payment-component/div/div[6]/payment-method/div/prepaid-payment-container/div/selected-card-info-container/span/div/invoice-component/div/div[3]/div/invoice-default-component/div/address/div/div[4]/input-component-v2/div/div/div/input");
	
	public static final Target IMPUT_NAME2= Target.the("name2").locatedBy("//*[@class=\"input-tag traveler-first-name ng-untouched ng-pristine ng-invalid\"]");
	public static final Target PAIS_RESIDENT= Target.the("pais").locatedBy("//*[@name=\"formData.travelers[0].nationality\"]");
	public static final Target IMPUT_LAST_NAME2= Target.the("apellido2").locatedBy("//*[@class=\"input-tag traveler-last-name ng-untouched ng-pristine ng-invalid\"]");
	public static final Target IMPUT_CEDULA2=Target.the("cedula2").locatedBy("//*[@name=\"formData.travelers[0].identifications[0].number\"]");
	public static final Target IMPUT_EMAIL=Target.the("email").locatedBy("//*[@class=\"input-tag contact-email ng-untouched ng-pristine ng-invalid\"]");
	public static final Target IMPUT_CONFIRM_EMAIL=Target.the("email2").locatedBy("//*[@placeholder=\"Ingresa tu email\"]");
	public static final Target IMPUT_COD_AREA=Target.the("codigoArea").locatedBy("//*[@placeholder=\"Ingresa un código de área\"]");
	public static final Target INPUT_NUM=Target.the("numero").locatedBy("//*[@class=\"input-tag phone-number-code ng-untouched ng-pristine ng-invalid\"]");
	
	
	/*public static final Target IMPUT_NAME = Target.the("name").located(By.xpath("//*[@id=\"card-holder_name-0\"]"));
	public static final Target IMPUT_ID = Target.the("id").located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/payment-component/div/div[1]/payment-method/div/prepaid-payment-container/div/card-payment-info/div[1]/card-payment-data/div/div[2]/input-component/div/div/div/input"));
	public static final Target IMPUT_NAME2 = Target.the("name2").located(By.xpath("//*[@id=\"invoice-first-name-0\"]"));
	public static final Target IMPUT_LAST_NAME = Target.the("lastname").located(By.xpath("//*[@id=\"invoice-last-name-0\"]"));
	public static final Target IMPUT_CEDULA = Target.the("cedula").located(By.xpath("//*[@id=\"invoice-fiscal-identification-number-0\"]"));
	public static final Target DROP_DEP = Target.the("departamento").located(By.xpath("//*[@id=\"invoice-fiscal-address-state-0\"]"));
	public static final Target IMPUT_CIUDAD = Target.the("ciudad").located(By.xpath("//*[@id=\"invoice-fiscal-address-city-ONE_CARD_CREDIT-0\"]"));
	public static final Target IMPUT_DIREC = Target.the("direccion").located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/payment-component/div/div[1]/payment-method/div/prepaid-payment-container/div/div[2]/invoice-component/div/div[3]/div/invoice-default-component/div/address/div/div[4]/input-component-v2/div/div/div/input"));
	public static final Target IMPUT_NAME3 = Target.the("name3").located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/travelers/div/ul/li/ul/li/traveler/div/div[2]/div/div[1]/div[1]/traveler-first-name-input/input-component-v2/div/div/div/input"));
	public static final Target IMPUT_LAST_NAME2 = Target.the("apellidos").located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/travelers/div/ul/li/ul/li/traveler/div/div[2]/div/div[1]/div[2]/traveler-last-name-input/span/input-component-v2/div/div/div/input"));
	public static final Target IMPUT_CEDULA2 = Target.the("cedula2").located(By.xpath("//*[@id=\"traveler-identification-number-0\"]"));
	public static final Target IMPUT_EMAIL = Target.the("email").located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/contact/div/div/email-address/div/div/input-component[1]/div/div/div/input"));
	public static final Target IMPUT_C_EMAIL = Target.the("email").located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/contact/div/div/email-address/div/div/input-component[2]/div/div/div/input"));
	public static final Target IMPUT_COD_AREA = Target.the("area").located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/contact-phone/div/div/phones/ul/li/phone/div/div[2]/input-component-v2[1]/div/div/div/input"));
	public static final Target IMPUT_NUMERO = Target.the("numero").located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/contact-phone/div/div/phones/ul/li/phone/div/div[2]/input-component-v2[2]/div/div/div/input"));
	

	public static final Target CLOSE = Target.the("close").located(By.xpath("/html/body/div[13]/div[1]/i"));
    public static final Target VALIDATE =Target.the("validate").located(By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/buy-component/div/flight-data-revision/div/div[1]"));

*/
}


// 16
//  0320	id="90sa97kxlomgbujvyd9s5u"


