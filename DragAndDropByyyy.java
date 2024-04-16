package ActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByyyy
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		
	// Transfer control from one frame to another frame	
		WebElement f = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(f);
// Go to the targated element		
		WebElement box = driver.findElement(By.id("draggable"));
// Create the object of action class- to access the method called DragAndDropBy		
		Actions a=new Actions(driver);
		a.dragAndDropBy(box, 200, 0);
		a.perform();                    // It is mandatory to call this without this nothing will be happen
		

	}

}
