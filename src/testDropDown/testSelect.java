package testDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testSelect {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MY LAPTOP\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5500/index.html");
		String myTitle =driver.getTitle();
		System.out.println(myTitle);
		//return option --> only 1 option facebook
		//String myOptionTag = driver.findElement(By.tagName("option")).getText();
        //System.out.println(myOptionTag);
		
		//return one element by index 
		//String myOptions = driver.findElements(By.tagName("option")).get(2).getText();
		
		
		//return the list of options
		List<WebElement> myListOfOptions = driver.findElements(By.tagName("option"));
		for(int i=0; i<myListOfOptions.size();i++ ) {
			System.out.println(myListOfOptions.get(i).getText());
		}
		
		
	}

}
