package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactoryelements.Pageobject;
import utilities.Driverinitialization;

public class Stepdef {
	
	Pageobject obj = new Pageobject ( Driverinitialization.getDriver());
	
	
	
	@Given("User launch Pizzahut application with {string}")
	public void user_launch_pizzahut_application_with(String string) {
		
		
		
		System.out.println("Application Launched successfully");
	    
	}

	@When("User wait for auto location black pop up screen")
	public void user_wait_for_auto_location_black_pop_up_screen() {
	   
		obj.PopUpScreenLocation();
	}

	@Then("User close the pop up screen")
	public void user_close_the_pop_up_screen() {
		
	obj.CloseBlackPopupScreen();
	  
	}

	@Then("User see pop up for delivery asking for enter location")
	public void user_see_pop_up_for_delivery_asking_for_enter_location() {
		
	   obj.deleiverypopups();
	}

	@Then("User type address as {string}")
	public void user_type_address_as(String string) {
		
		obj.EnterDeliveryLocation("Latur St Stand");
	    
	}

	@Then("User select first auto populate drop down option")
	public void user_select_first_auto_populate_drop_down_option() {
           
		obj.SelectFirstDropdownOption();

	}

	@When("User navigate to deals page")
	public void user_navigate_to_deals_page() {
		
		
	    obj.navigateToDealPage();
	}

	@Then("User validate vegetarian radio button flag is off")
	public void user_validate_vegetarian_radio_button_flag_is_off() {
		
		obj.RadioBtnFlag();

	}

	@Then("User clicks on Pizzas menu bar option")
	public void user_clicks_on_pizzas_menu_bar_option() {
		
		obj.PizzaMenuBar();
	  
	}

	@When("User select add button of any pizza from Recommended")
	public void user_select_add_button_of_any_pizza_from_recommended() {
	
		obj.AddMazedarMakhaniPizza();
	}

	@Then("User see that the pizza is getting added under Your Basket")
	public void user_see_that_the_pizza_is_getting_added_under_your_basket() {
		
		obj.YourBasket();
	
	}

	@Then("User validate pizza price plus Tax is checkout price")
	public void user_validate_pizza_price_plus_tax_is_checkout_price() {
		
		obj.CheckoutPrice();
	    
	}

	@Then("User validate checkout button contains Item count")
	public void user_validate_checkout_button_contains_item_count() {
		
		obj.itemOptionUnderCheckoutBtn();
	    
	}

	@Then("User validate checkout button contains total price count")
	public void user_validate_checkout_button_contains_total_price_count() {
		
		obj.priceUnderCheckoutBtn();
	    
	}

	@Then("User clicks on Drinks option")
	public void user_clicks_on_drinks_option() {
		
		obj.ClickDrinkBtn();
	  
	}

	@Then("User select Pepsi option to add into the Basket")
	public void user_select_pepsi_option_to_add_into_the_basket() {
		
		obj.ClickAddPepsiBtn();
	 
	}

	@Then("User see {int} items are showing under checkout button")
	public void user_see_items_are_showing_under_checkout_button(Integer int1) {
		
		obj.NowTotalItemCheckoutBtn();
	   
	
	}
	@Then("User see total price is now more than before")
	public void user_see_total_price_is_now_more_than_before() {
		
		obj.NowPriceUnderCheckoutBtn();
	}
	   
	

	@Then("User remove the Pizza item from Basket")
	public void user_remove_the_pizza_item_from_basket() {
		
		obj.RemovePizzaItemFromYourBasket();
	   
	}

	@Then("see Price tag got removed from the checkout button")
	public void see_price_tag_got_removed_from_the_checkout_button() {
		
	     obj.NotDisplayingPriceInCheckoutBtn();
	  
	}

	@Then("User see {int} item showing in checkout button")
	public void user_see_item_showing_in_checkout_button(Integer int1) {
		
		obj.itemOptionUnderCheckoutBtn();

	}

	@Then("User Clicks on Checkout button")
	public void user_clicks_on_checkout_button() {
		
		obj.ClickOnCheckoutBtn();

	}

	@Then("User see minimum order required pop up is getting displayed")
	public void user_see_minimum_order_required_pop_up_is_getting_displayed() {
	    
		obj.MinOrderShowing();
	}
 
	 
}
