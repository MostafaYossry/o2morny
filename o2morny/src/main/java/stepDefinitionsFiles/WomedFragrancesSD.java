package stepDefinitionsFiles;


import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javaFiles.WomedFragrances;
import javaFiles.Elements;



public class WomedFragrancesSD {

	public WomedFragrances WomedFragrance = new WomedFragrances();
	public Elements Elements = new Elements();
	int count_selected_item=0, count_selected_item_total=0 ;

	@Given("I successfully connected to o2morny Landing page using label {string}")
	public void i_successfully_connected_to_o2morny_landing_page_using_label(String First_label_text)  throws IOException {
		
		WomedFragrance.startDriver ();
		WomedFragrance.open_O2merny ();
		WomedFragrance.assert_label (First_label_text);
	}

	@When("I select Women Fragrances from Fragrances tab")
	public void i_select_women_fragrances_from_fragrances_tab() {
		WomedFragrance.select_Women_Fragrances();

	}

	
	@Then("I successfully connected to Women Fragrances First page using label {string}")
	public void i_successfully_connected_to_women_fragrances_first_page_using_label(String  label_text)  {
		WomedFragrance.Womed_Fragrance_label(label_text);
	}
	

	@When("I select all the items that have discount only in percentages in this page")
	public void i_select_all_the_items_that_have_discount_only_in_percentages_in_this_page() {
	 count_selected_item = WomedFragrance.select_items();
	}

	@When("I want to Count the selected elements")
	public void i_want_to_count_the_selected_elements() {
		count_selected_item_total = WomedFragrance.count_the_selected_elements(count_selected_item);
	}


	@Then("I want to Go to next page")
	public void i_want_to_go_to_next_page(int number) {
		number=number+1;
		WomedFragrance.GoToPage(number);
	}


	@Then("I successfully connected to Women Fragrances Second page using label {string}")
	public void i_successfully_connected_to_women_fragrances_second_page_using_label(String label_text) {
		WomedFragrance.Womed_Fragrance_label(label_text);

	}

	@Then("I successfully connected to Women Fragrances Third page using label {string}")
	public void i_successfully_connected_to_women_fragrances_third_page_using_label(String label_text) {
		WomedFragrance.Womed_Fragrance_label(label_text);

	}

	@Then("I successfully connected to Women Fragrances Fourth page using label {string}")
	public void i_successfully_connected_to_women_fragrances_fourth_page_using_label(String label_text) {
		WomedFragrance.Womed_Fragrance_label(label_text);

	}

	@Then("I successfully connected to Women Fragrances Fifth page using label {string}")
	public void i_successfully_connected_to_women_fragrances_fifth_page_using_label(String label_text) {
		WomedFragrance.Womed_Fragrance_label(label_text);

	}

	@Then("I want to assert the total number of elements in the cart")
	public void i_want_to_assert_the_total_number_of_elements_in_the_cart() {
		WomedFragrance.assert_total_items(count_selected_item_total);
	}

	@When("I successfully connected to Ready to checkout Page using label {string}")
	public void i_successfully_connected_to_ready_to_checkout_page_using_label(String label_text) {
		WomedFragrance.Open_Cart();
		WomedFragrance.Ready_to_checkout_label(label_text);
	}


	@Then("I want to assert the total cost is calculated properly")
	public void i_want_to_assert_the_total_cost_is_calculated_properly() {
		WomedFragrance.sum_all_prices_after_discount();
		WomedFragrance.CloseDriver();
		
	}	
	
	@Then("I want to Go to page {int}")
	public void i_want_to_go_to_page(Integer int1) {
		WomedFragrance.GoToPage(int1);
		}

	
}


