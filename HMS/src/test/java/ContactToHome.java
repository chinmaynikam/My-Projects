import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactToHome extends HMS
{
    @Test
    public void TC_WB_HB_backhome() throws InterruptedException
    {
        driver.manage().window().maximize();
        WebElement contact=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[2]/a"));
        contact.click();
        Thread.sleep(2000);
        WebElement home =driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[1]/a"));
        home.click();
        Thread.sleep(2000);
        String actualUrl="http://localhost/Hospital%20Management%20System/hospital/index.html";//Enter the link of the web page to which login page will direct us.
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        System.out.println("------------------------------------------------------------------");

    }
}
