package javaFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;


public class Elements {

	String[] s1 = new String[28];
	String[] s2 = new String[14];
	String[] s3 = new String[14];

	
	GetElementFromArray ElementFromArray = new GetElementFromArray();
	Paths path = new Paths();
	public WebDriver driver ;


	
	
	public WebDriver intializeDriver ( )  {
	System.setProperty("webdriver.chrome.driver", path.Driverpath );
	driver = new ChromeDriver();
	return driver;
	}
	
	
	public WebElement SPECIAL_OFFERS_label() throws IOException {
		s1 = ElementFromArray.Read_excel();
		for (int i=0; i<14; i++) {
	  	   s2[i] = s1[2*i] ;
	  	   s3[i] = s1[(2*i)+1] ;
	     }  

		String z = ElementFromArray.Get(s2, s3, "First_label") ;	    
	    WebElement First_label= driver.findElement(By.xpath(z));
		return First_label ;
	}

	public WebElement dropDown() {
   		String z = ElementFromArray.Get(s2, s3, "dropDown") ;	    
	    WebElement dropDown = driver.findElement(By.xpath(z));
		return dropDown ;
	}

	public WebElement Women_Fragrances_Selection() {
		
    	String z = ElementFromArray.Get(s2, s3, "Women_Fragrances_Selection") ;	    
	    WebElement Women_Fragrances_Selection = driver.findElement(By.xpath(z));
		return Women_Fragrances_Selection ;
	}

	public WebElement Women_Fragrances_label() {
		
	    String z = ElementFromArray.Get(s2, s3, "Women_Fragrances_label") ;	    
	    WebElement Women_Fragrances_label = driver.findElement(By.xpath(z));
		return Women_Fragrances_label ;
	}

	
	public WebElement Ready_to_checkout_label() {
		
  	    String z = ElementFromArray.Get(s2, s3, "Ready_to_checkout_label") ;	    
	    WebElement Ready_to_checkout_label = driver.findElement(By.xpath(z));
		return Ready_to_checkout_label ;
	}

	
	public List<WebElement> Percentage_items() {
		
     	String z = ElementFromArray.Get(s2, s3, "Percentage_items") ;	    
    	List<WebElement> Percentage_items = driver.findElements(By.className(z));
		return Percentage_items ;
	}

	
	public List<WebElement> Buttons_items() {
		
	   	String z = ElementFromArray.Get(s2, s3, "Buttons_items") ;	    
	    List<WebElement> Buttons_items = driver.findElements(By.xpath(z));
		return Buttons_items ;
	}

	
	public WebElement GoTo_Next_Page(int pageNumber) {
  	   	String z = ElementFromArray.Get(s2, s3, "GoTo_Next_Page") ;	
  	   	z = z + pageNumber + "]" ;
	    WebElement GoTo_Next_Page = driver.findElement(By.xpath(z));
		return GoTo_Next_Page ;
	}


	public List<WebElement> Open_Cart() {
	    String z = ElementFromArray.Get(s2, s3, "Open_Cart_items") ;	    
	    List<WebElement> Open_Cart_items = driver.findElements(By.xpath(z));	
		return Open_Cart_items ;
	}

	
	public List<WebElement> assert_total_items() {
		
   	    String z = ElementFromArray.Get(s2, s3, "items_total") ;	    
	    List<WebElement> items_total = driver.findElements(By.xpath(z));
		return items_total ;
	}
	
	public List<WebElement> sum_all_prices_after_discount() {

        String z = ElementFromArray.Get(s2, s3, "items") ;	    
	    List<WebElement> items = driver.findElements(By.xpath(z));
		return items ;
	}


	public WebElement actual_total_price() {
		
	    String z = ElementFromArray.Get(s2, s3, "actual_total_price") ;	    
	    WebElement actual_total_price = driver.findElement(By.id(z));
		return actual_total_price ;
	}

	public WebElement cart_count() {
	    String z = ElementFromArray.Get(s2, s3, "cart_count") ;	    
	    WebElement cart_count_element = driver.findElement(By.xpath(z));
		return cart_count_element ;
	}


	


}


