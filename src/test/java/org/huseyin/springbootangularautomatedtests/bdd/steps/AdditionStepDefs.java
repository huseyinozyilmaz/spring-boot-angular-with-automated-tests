package org.huseyin.springbootangularautomatedtests.bdd.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdditionStepDefs {

    @Given("^I have a Calculator$")
    public void i_have_a_calculator() throws Throwable {
        System.out.println("I have a Calculator");
    }

    @When("^I add 1 and 1$")
    public void i_add_1_and_1() throws Throwable {
        System.out.println("I add 1 and 1");
    }

    @Then("^the sum should be 2$")
    public void the_sum_should_be_2() throws Throwable {
        System.out.println("the sum should be 2");
    }

}
