package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TechProPage {
    public TechProPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@id='searchHeaderInput']")
    public WebElement aramaKutusu;

@FindBy(xpath = "(//*[text()='Mobile Developer'])[2]")
public WebElement mobilDevLink;
@FindBy(xpath = "(//*[text()='Free Java'])[4]")
    public WebElement FreeJavaLink;












}