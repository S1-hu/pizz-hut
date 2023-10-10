package pagefactoryelements;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;

public class Pageobject {

	
	
	WebDriver driver;

	// Constructor
	public Pageobject(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath = "//div[@class='notification-container notification-container__basket']//div")
	WebElement blackPopups;

	@FindBy(xpath = "(//div[@class='home-localise-product-box-overlap flex justify-start items-center flex-col'])[1]")
	WebElement popupslocation;
	
	@FindBy(xpath = "//div[@class=\"localisation bg-white p-20 rounded-b\"]")
	WebElement delieverypopup;

	@FindBy(xpath = "//input[@placeholder='Enter your location for delivery']")
	WebElement enterLocations;


	@FindBy(xpath = "//button[2]")
	WebElement selectLocation;

	@FindBy(xpath = "//a[@data-synth='link--deals--side']//span")
	WebElement dealstxts;

	@FindBy(xpath = "//div[@class='md:flex md:flex-col lg:flex-row container lg:justify-start lg:pl-15']//span[@class='rounded-full bg-white']")
	WebElement radioBtns;

	@FindBy(xpath = "//a[contains(@data-synth,'link--pizzas--side')]")
	WebElement pizzaOptions;
                      
	@FindBy(xpath = "//body/div[contains(@data-test,'app-container')]/div/div/div/div/div/div/span[contains(@data-testid,'pizzas')]/div/a[contains(@role,'button')]/div/div/button[contains(@data-synth,'button--mazedar-makhni-paneer-recommended-pan-medium--one-tap')]/span[1]")
	WebElement addBtns;

	@FindBy(xpath = "//div[@id='basket']")
	WebElement baskets;

	@FindBy(xpath = "//span[@class='subtotal']")
	WebElement subtotals;

	@FindBy(xpath = "//div[@class='display-supplement-value']")
	WebElement restaurantCharges;

	@FindBy(xpath = "//span[contains(text(),'₹32.20')]")
	WebElement taxCharges;

	@FindBy(xpath = "//span[@class='amountdue']")
	WebElement payableAmounts;
	
	@FindBy(xpath = "//span[contains(@class,'mr-auto text-left')]")
	WebElement itemUndercheckoutBtns;

	@FindBy(xpath = "//span[@data-synth='basket-value'][contains(text(),'₹676.20')]")
	WebElement priceUndercheckouts;
	
	@FindBy(xpath = "//span[contains(@class,'bg-green-dark pl-5 pr-5 rounded')]")
	WebElement item2UndercheckoutBtns;

	@FindBy(xpath = "//span[@data-synth='basket-value'][contains(text(),'₹736.06')]")
	WebElement price2Undercheckouts;


	@FindBy(xpath = "//a[contains(@data-synth,'link--drinks--side')]")
	WebElement drinkbtns;

	@FindBy(css = "button[data-synth='button--pepsi-600ml--one-tap']")
	WebElement addPespiBtns;

	@FindBy(xpath = "//button[@data-synth='basket-item-remove--mazedar-makhni-paneer-recommended-pan-medium']")
	WebElement removePizzaItems;

	@FindBy(xpath = "//button[@data-synth='link--checkout']//span[@class='absolute inset-0 flex-center']")
	WebElement checkoutButtons;
	
	@FindBy(xpath = "//span[contains(text(),'Checkout')]")
	WebElement checkoutBtns;

	@FindBy(xpath = "//h3[contains(@class,'typography-2 mt-30')]//span[contains(text(),'You')]")
	WebElement minOrders;
      
	
	
	
	public void CloseBlackPopupScreen() {

		blackPopups.click();
	}

	public void PopUpScreenLocation() {

		popupslocation.isDisplayed();
	}
	
	public void deleiverypopups() {
		
		delieverypopup.click();
	}

	public void EnterDeliveryLocation(String Location) {

		enterLocations.sendKeys(Location);

	}

	public void SelectFirstDropdownOption() {
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectLocation.click();
	}

	public void navigateToDealPage() {
          
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dealstxts.click();
		String url = driver.getCurrentUrl();
		if (url.contains("deals")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	public void RadioBtnFlag() {
		boolean RadioBtn = radioBtns.isSelected();
		if (RadioBtn) {

			System.out.println("radio button flag is on");

		} else {
			System.out.println("radio button flag is off");
		}

	}

	public void PizzaMenuBar() {
		pizzaOptions.click();
	}

	public void AddMazedarMakhaniPizza() {
		

	   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		addBtns.click();
		
	}

	public void YourBasket() {
		baskets.isDisplayed();
		String Basket = baskets.getText();
		System.out.println("Price added in Basket :" + Basket);
	}

	public void CheckoutPrice() {

		Float onlyPizzaPrice = Float.valueOf(subtotals.getText().replaceAll("₹", ""));
		System.out.println(onlyPizzaPrice);

		Float RetaurantCharge = Float.valueOf(restaurantCharges.getText().replaceAll("₹", ""));
		System.out.println(RetaurantCharge);

		Float TaxCharge = Float.valueOf(taxCharges.getText().replaceAll("₹", ""));
		System.out.println(TaxCharge);

		Float PayableAmount = Float.valueOf(payableAmounts.getText().replaceAll("₹", ""));
		System.out.println(PayableAmount);
		
		if(onlyPizzaPrice+RetaurantCharge+TaxCharge==PayableAmount) {
			System.out.println("Pizza Price + Restaurant Charge + Tax Charge = Total Payable Amount as Expected");
		}else {
			System.out.println("Pizza Price + Restaurant Charge + Tax Charge != Total Payable Amount.....Failed");
		}
			

	}

	public void itemOptionUnderCheckoutBtn() {
		String ItemUndercheckoutBtn = itemUndercheckoutBtns.getText();
		System.out.println(ItemUndercheckoutBtn);
		boolean IemUndercheckoutBtn2 = itemUndercheckoutBtns.isDisplayed();
		Assert.assertTrue(IemUndercheckoutBtn2);

	}

	public void priceUnderCheckoutBtn() {
		
		String PriceUndercheckout = priceUndercheckouts.getText();
		System.out.println(PriceUndercheckout);
		boolean PriceUndercheckout2 = priceUndercheckouts.isDisplayed();
		Assert.assertTrue(PriceUndercheckout2);
	}

	public void ClickDrinkBtn() {
		drinkbtns.click();
	}

	public void ClickAddPepsiBtn() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addPespiBtns.click();
	}

	public void NowTotalItemCheckoutBtn() {
//		boolean Totalitem = checkoutBtn.isDisplayed();
//		Assert.assertTrue(Totalitem);
//		String totalItem2 = checkoutBtn.getText();
//		System.out.println(totalItem2);
		Assert.assertTrue(item2UndercheckoutBtns.getText().contains(String.valueOf(2)));
	}

	public void NowPriceUnderCheckoutBtn() {
		boolean TotaPrice = price2Undercheckouts.isDisplayed();
		Assert.assertTrue(TotaPrice);
		String TotaPrice2 = price2Undercheckouts.getText();
		System.out.println(TotaPrice2);
		
	
	}

	public void RemovePizzaItemFromYourBasket() {
		removePizzaItems.click();
	}

	public void NotDisplayingPriceInCheckoutBtn() {
		String CheckOutbtn = checkoutButtons.getText();
		System.out.println(CheckOutbtn);

		boolean CheckOutbtn2 = checkoutButtons.isDisplayed();
		Assert.assertTrue(CheckOutbtn2);

	}

	public void ClickOnCheckoutBtn() {
		checkoutBtns.click();
	}

	public void MinOrderShowing() {
		boolean MinOrder = minOrders.isDisplayed();
		Assert.assertTrue(MinOrder);

		String minOrder2 = minOrders.getText();
		System.out.println(minOrder2);

	}
	
	@After
	public void BrowserClose() {
		driver.quit();
	}
	

	


	

}
