package pagefactoryelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageobjectTestNg {
	
	
	   
	WebDriver driver;
		
		// Constructor
		public PageobjectTestNg(WebDriver driver) {

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

		@FindBy(xpath = "//a[@data-synth='link--sides--side']//span")
		WebElement sidesOptions;
		
		@FindBy(xpath = "//body/div[contains(@data-test,'app-container')]/div/div/div/div/div/div/span[contains(@data-testid,'sides')]/div/a[contains(@role,'button')]/div/div/button[contains(@data-synth,'button--exotica-veggie-garlic-bread-single--one-tap')]/span[1]")
		WebElement addBtns;

		@FindBy(xpath = "//div[@id='basket']")
		WebElement baskets;
		
		@FindBy(xpath = "//button[contains(@class,'justify-between')]//span[contains(@class,'absolute inset-0 flex-center')]")
		WebElement checkoutButtons;
		
		@FindBy(xpath = "(//span[@class='absolute inset-0 flex-center'])[3]")
		WebElement remove;
		
		@FindBy(xpath = "//a[@data-synth='link--drinks--side']//span")
		WebElement drinks;
		
		@FindBy(css = "button[data-synth='button--pepsi-600ml--one-tap']")
		WebElement pepsi1;

		@FindBy(xpath = "(//button)[4]")
		WebElement pepsi2;
		
		@FindBy(xpath = "//span[contains(text(),'Checkout')]")
		WebElement checkoutbuotton;
		

		@FindBy(xpath = "(//i[contains(@class,'mt-4')])[1]")
		WebElement online;
		
		@FindBy(css = "body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(4) > div:nth-child(2) > label:nth-child(3) > i:nth-child(2)")
		WebElement cash;
		

		@FindBy(xpath = "//span[normalize-space()='I agree to receive promotional communication.']")
		WebElement checkbox;
		
		@FindBy(xpath= "//input[@id='checkout__name']")
		WebElement name;
		
		@FindBy(xpath= "//input[@id='checkout__phone']")
		WebElement mobile;
		
		@FindBy(xpath= "//input[@id='checkout__email']")
		WebElement email;
		
		@FindBy(xpath= "//span[normalize-space()='Apply Gift Card']")
		WebElement gift;
		
		@FindBy(xpath= "//div[@class='sc-fznMnq gdZumo']")
		WebElement voucher;
		
		@FindBy(xpath= "//input[@placeholder='e.g. ABC1234']")
		WebElement vouchercode;
		
		@FindBy(xpath= "//button[@type='submit']")
		WebElement redeem;
		
		@FindBy(xpath= "(//button[@class='icon-remove-3 absolute top-0 right-0 mr-20 mt-20'])[1]")
		WebElement voucherpopup;
		
		
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
	            try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
		public void sidesbaroption()
		{
		
			sidesOptions.click();
		}
		
		public void exoticveggiepizza()
		{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			addBtns.click();
		}
		
		public void addbasket()
		
		{
			baskets.isDisplayed();
			String Basket = baskets.getText();
			System.out.println("pizza added in Basket :" + Basket);
		}
		
		public void checkoutButtonpriceitem()
		
		{
			checkoutButtons.click();
			
		}
		
		

		public void removepopup()
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			remove.click();
		}
		
		
		public void drniksmenuoption() 
		{
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			drinks.click();
		}
		
		
		
		public void pepsi()
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pepsi1.click();
		}
		
		public void sevenup()
		{
			pepsi2.click();
		}
		
		public void clickoncheckout()
		{
			checkoutbuotton.click();
		}
		
		
		public void onlinepayment()
		{
	         try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			boolean actualValue = online.isSelected();
			
			if (actualValue)
				System.out.println("Radio button is not selected");
			else
				System.out.println("Radio button is  selected");
		}	
			
		public void cashoption()
		{
			
			cash.click();
		}
	             
		public void checkboxcheked()
		{
			checkbox.isSelected();
		boolean actualValue = checkbox.isSelected();
			
			if (actualValue)
				System.out.println(" checkbox is not checked");
			else
				System.out.println(" checkbox is  checked");
		}
		
		public void addname() 
		{
			name.sendKeys("Shubham Panchal");
		}
		
		public void addmobile()
		{
			mobile.sendKeys("8830146502");
		}

		public void addemail()
		{
			email.sendKeys("shubhampanchal760@gmail.com");
		}
		
		public void giftcard()
		{
			gift.click();
		}
		
		public void clickvoucher()
		{
			voucher.click();
		}
		
		public void addvouchercode()
		{
			
			vouchercode.sendKeys("12345");
		}
		
		public void clicksubmitt()
		{
			redeem.click();
			
		}
		
		public void closevoucherpopup()
		{
			
			voucherpopup.click();
		}
		
	

}
