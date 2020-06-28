package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Basepage
{
 public void selectbyvisibleText(WebElement element,String text)
 {
	 Select s=new Select(element);
	 s.selectByVisibleText(text);
 }
 
 public void selectbyvalue(WebElement element,String value)
 {
	 Select s=new Select(element);
	 s.selectByValue(value);
 }
 
 public void selectbyindex(WebElement element,int index)
 {
	 Select s=new Select(element);
	 s.selectByIndex(index);
 }
 
 public void movetoelement(WebDriver driver,WebElement toelement)
 {
	 Actions act=new Actions(driver);
	 act.moveToElement(toelement).perform();
 }
}
