import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutenticationSteps {

    @Given("^that Julian wants to log in in order to manage his products$")
    public void that_Julian_wants_to_log_in_in_order_to_manage_his_products() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Primer step");
    }

    @When("^he send the information required to log in$")
    public void he_send_the_information_required_to_log_in() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Segundo step");
    }

    @Then("^he should be given access to manage his products$")
    public void he_should_be_given_access_to_manage_his_products() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Tercer step");
    }

    @Given("^me voy a loguear en la pagina \"([^\"]*)\"$")
    public void me_voy_a_loguear_en_la_pagina(String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cuarto step");
    }

    @Given("^con el usuario \"([^\"]*)\"$")
    public void con_el_usuario(String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Quinto step");
    }

    @When("^envie el formulario$")
    public void envie_el_formulario() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Sexto step");
    }

    @Then("^debe responder de manera correcta$")
    public void debe_responder_de_manera_correcta() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Septimo step");
    }

}
