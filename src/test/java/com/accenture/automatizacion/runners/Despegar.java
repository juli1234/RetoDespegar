/**
 * 
 */
package com.accenture.automatizacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

/**
 * @author Juliana
 *
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features", 
glue = "com.accenture.automatizacion.stepdefinitions", 
snippets = SnippetType.CAMELCASE)

//monochrome = true, 
//dryRun = false, plugin = {
	//	"json:reportJson/cucumber.json" })

public class Despegar {

}
