package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefinitions {

    private Belly bohdanBelly;

    @Given("I have {int} cakes in my belly")
    public void i_have_cakes_in_my_belly(Integer numberOfCakes) {
        bohdanBelly = new Belly();
        bohdanBelly.eat(numberOfCakes);
    }

    @When("I wait {int} hour")
    public void i_wait_hour(Integer digestTime) {
        bohdanBelly.digest(digestTime);
    }

    @Then("my belly should not growl")
    public void my_belly_should_not_growl() {
        assertFalse(bohdanBelly.isFull());
    }

    @Given("There is update function in Redlike Helper")
    public void there_is_update_function_in_redlike_helper() {
        Helper helper = new Helper();
    }

    @When("As POS admin want run update in night hours")
    public void as_pos_admin_want_run_update_in_night_hours() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("There will be new option in Helper for run update only in specific hours")
    public void there_will_be_new_option_in_helper_for_run_update_only_in_specific_hours() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("System is not updated")
    public void system_is_not_updated() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Time is {int} PM")
    public void time_is_pm(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Update is triggred")
    public void update_is_triggred() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
