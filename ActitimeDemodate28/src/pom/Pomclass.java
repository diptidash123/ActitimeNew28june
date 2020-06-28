package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Autoconstant;
import generics.Excellibrary;


public class Pomclass implements Autoconstant
{
  @FindBy(xpath="//input[@id='username']")
  private WebElement usernametextfield;
  
  @FindBy(xpath="//input[@name='pwd']")
  private WebElement passwordtextfield;
  
  @FindBy(xpath="//input[@id='keepLoggedInCheckBox']")
  private WebElement keepmeloggedincheckbox;
  
  @FindBy(xpath="//div[.='Login ']")
  private WebElement loginbutton;

  
  public Pomclass(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void logindetails() throws IOException
  {
	  usernametextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 0));
	  passwordtextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 1));
	  keepmeloggedincheckbox.click();
	  loginbutton.click();
  }
}