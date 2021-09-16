package javaFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.gherkin.model.Scenario;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;


public class WomedFragrances {

	Paths path = new Paths();
	Elements element = new Elements();
	
	public WebDriver driver = element.intializeDriver();
	WebDriverWait wait = new WebDriverWait(driver,30);
	int count_selected_item_total=0 ;
	int Sum =0;

	Elements elements = new Elements();
	

	public void startDriver () throws IOException  {
		driver.manage().window().maximize();	

		}

public void open_O2merny ( ) {
	driver.get(path.O2mornyURL);
}

public void assert_label (String First_label_text) throws IOException {
	
	WebElement First_label = element.SPECIAL_OFFERS_label();
	Assert.assertEquals(First_label.getText(), First_label_text);
}

public void select_Women_Fragrances () {

	Actions action = new Actions(driver);
	WebElement drop = element.dropDown();
	action.moveToElement(drop).perform();
	
	WebElement Women_Fragrances_Selection = element.Women_Fragrances_Selection();
	Women_Fragrances_Selection.click();

}

public void Womed_Fragrance_label(String label_text)  {
	WebElement Women_Fragrances_label = element.Women_Fragrances_label();
	Assert.assertEquals(Women_Fragrances_label.getText(), label_text);
	}


public void Ready_to_checkout_label(String label_text)  {
	WebElement Ready_to_checkout_label = element.Ready_to_checkout_label();
	Assert.assertEquals(Ready_to_checkout_label.getText(), label_text);
	}


public int select_items () {
	
	List<WebElement> Percentage_items = element.Percentage_items();
	List<WebElement> Buttons_items = element.Buttons_items();

	int count_selected_item =0 ;
	for (int i=0; i<Percentage_items.size(); i++ ) {
		if (Percentage_items.get(i).getText().contains("%")) {
			count_selected_item ++ ;
	
			WebElement cart_count = element.cart_count();
			int count_cart =Integer.parseInt(cart_count.getText());
			
			Actions action = new Actions(driver);
			action.moveToElement(Percentage_items.get(i)).perform() ;


			if (Buttons_items.get(i).isDisplayed()) {
				Buttons_items.get(i).click();
			
				count_cart = count_cart +1 ;
				WebDriverWait wait = new WebDriverWait(driver,3);
				wait.until(ExpectedConditions.textToBePresentInElement(cart_count, Integer.toString(count_cart)));
	}
		
			}
	}
return count_selected_item ;
}


public int count_the_selected_elements (int count_selected_item) {

	count_selected_item_total = count_selected_item_total + count_selected_item ;
	return count_selected_item_total;
	}




public void GoToPage (int PageNumber) {
	PageNumber = PageNumber+1;
	WebElement GoTo_Next_Page = element.GoTo_Next_Page(PageNumber);
    GoTo_Next_Page.click();
    
    if (PageNumber > 2) {
    	String Current_ULR = driver.getCurrentUrl();
    	Current_ULR = Current_ULR.substring(0,Current_ULR.length() - 1);
    	Current_ULR = Current_ULR + (PageNumber-1);
    	WebDriverWait wait = new WebDriverWait(driver,3);
    	wait.until(ExpectedConditions.urlToBe(Current_ULR));

    

}

}



public void Open_Cart () {
	List<WebElement> Open_Cart_items = element.Open_Cart();
	Open_Cart_items.get(0).click();
}


public void assert_total_items(int total_items) {
	List<WebElement> assert_total_items = element.assert_total_items();
	Assert.assertTrue(total_items == assert_total_items.size());
}


public void sum_all_prices_after_discount( ) {

	List<WebElement> items = element.sum_all_prices_after_discount();


	int temp ;
	for (int i=0; i<items.size(); i++) {
		
		String intValue = items.get(i).getText().substring(0, 14);
		intValue= intValue.replaceAll("[^0-9]", "");
		temp = Integer.parseInt(intValue);  	
		Sum = Sum + temp;
	}
	
	WebElement actual_total_price = element.actual_total_price();

String intValue= actual_total_price.getText().replaceAll("[^0-9]", "");
temp = Integer.parseInt(intValue);  
Assert.assertTrue(Sum == temp);

}

public void CloseDriver() {
	driver.quit();
		
}




	






}

