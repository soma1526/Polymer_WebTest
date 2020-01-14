package Testcode;

//import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Polymer {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//open browser with desired URL
		driver.get("http://todomvc.com");
		driver.findElement(By.linkText("Polymer")).click();
	    //driver.findElement(By.id("new-todo")).sendKeys("Item 1");
	    //driver.findElement(By.id("new-todo")).sendKeys(Keys.RETURN);
		//System.out.println("Item 1 Added");
		 
		 
	
		WebElement element_enter = driver.findElement(By.id("new-todo"));
	 element_enter.sendKeys("Item 1");
	
	 // driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 element_enter.sendKeys(Keys.ENTER);
	
	 WebElement ItemList = driver.findElement(By.xpath("/html/body/div/td-todos/section/section/ul/li/div/label"));
	 
	 ItemList.sendKeys("Item 1");
	 
	 
	 
	 
	 
	//Actions actions = new Actions(driver);
	
	//actions.moveToElement(driver.findElement(By.xpath("/html/body/div/td-todos/section/section/ul/li/div/label"))).build().perform();
	
	
	 
	 
	 
	 
	// WebElement element_enter2 = driver.findElement(By.xpath("//*[@id=\"new-todo\"]"));
	 //element_enter2.sendKeys("Item 2");
	 
	 //element_enter2.sendKeys(Keys.ENTER);
	 
	// WebElement ItemList2 = driver.findElement(By.xpath("/html/body/div/td-todos/section/section/ul/li[2]/div/label"));
	 
	// ItemList2.sendKeys("Item 2");
	 
	 
	 
	 
	 
	 
	
	 
	 
	 
	 
	 
	 //WebElement element_edit = driver.findElement(By.xpath("/html/body/div/td-todos/section/section/ul/li/div/label"));
	 
	
	
	 //WebElement Doubleclickelement  = driver.findElement(By.xpath("/html/body/div/td-todos/section/section/ul/li/div/label"));
	  
	 //actions.doubleClick(element_edit).build().perform();
	 
	// System.out.println("Doubleclicked");
	 
	 
	
	 
	//Action Myaction = new Actions(driver).doubleClick(ItemList).build();
	//Myaction.perform();
	
	 
	 
	// WebElement element_enter2 = driver.findElement(By.id("new-todo"));
	// element_enter2.sendKeys("Item 2");
	 //element_enter.sendKeys(Keys.ENTER);

	 
	 //WebElement ItemList2 = driver.findElement(By.xpath("/html/body/div/td-todos/section/section/ul/li[2]/div/label"));
	 
	  // ItemList2.sendKeys("Item 2");
	 
	 
	
	 
		// driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 
	 
      
	 
	 
	 //driver.findElement(By.className("style-scope td-item")).sendKeys("Item 1");
	 
	// element_enter.getAttribute("id");
	 
	 
	
		
		//closing the browser
		
		//driver.close();
		
		
		
		
	}

}
