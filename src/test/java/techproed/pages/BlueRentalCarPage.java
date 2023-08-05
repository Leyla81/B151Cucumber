package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalCarPage {
  public BlueRentalCarPage(){

      PageFactory.initElements(Driver.getDriver(),this);
  }
  @FindBy(xpath = "(//a)[1]")
    public WebElement loginButtonu;
  @FindBy(xpath = "//*[@type='email']")
    public WebElement emailBox;
  @FindBy(xpath = "//*[@id='dropdown-basic-button']")
  public WebElement activeLogin;
  @FindBy(xpath = "//*[.='Profile']")
  public WebElement profileButton;
  @FindBy(xpath = "//em")
  public WebElement currentEmail;
  @FindBy(xpath = "//a[.='Logout']")
  public WebElement logoutButton;
  @FindBy(xpath = "//*[.='OK']")
  public WebElement OKButton;


}
