import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddDoctor extends HMS
{
    @Test
    public void TC_WB_SC_adddoctor() throws InterruptedException {
        driver.manage().window().maximize();
        WebElement ALogin = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/div[2]/div/span/a"));
        ALogin.click();
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[1]/span/input"));
        username.sendKeys("Shantanu");//Enter username from your database as in my this one is working.
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[2]/span/input"));
        password.sendKeys("password");//Enter password of the username entered above.
        Thread.sleep(2000);
        WebElement login = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[3]/button"));
        login.click();
        Thread.sleep(2000);
        WebElement doctors = driver.findElement(By.xpath("/html/body/div/div[1]/div/nav/ul/li[2]/a"));
        doctors.click();
        Thread.sleep(2000);
        WebElement adddoc = driver.findElement(By.xpath("/html/body/div/div[1]/div/nav/ul/li[2]/ul/li[2]/a"));
        adddoc.click();
        Thread.sleep(2000);
        WebElement docspecial = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div/div/div[2]/form/div[1]/select"));
        docspecial.click();
        Thread.sleep(2000);
        WebElement genphy = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div/div/div[2]/form/div[1]/select/option[3]"));
        genphy.click();
        Thread.sleep(2000);
        WebElement doctorname = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div/div/div[2]/form/div[2]/input"));
        doctorname.sendKeys("Pratik Patil");//Enter username from your database as in my this one is working.
        Thread.sleep(2000);
        WebElement doccliadd = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div/div/div[2]/form/div[3]/textarea"));
        doccliadd.sendKeys("Katraj Pune");//Enter username from your database as in my this one is working.
        Thread.sleep(2000);
        WebElement docconfee = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div/div/div[2]/form/div[4]/input"));
        docconfee.sendKeys("500");//Enter username from your database as in my this one is working.
        Thread.sleep(2000);
        WebElement docconnum = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div/div/div[2]/form/div[5]/input"));
        docconnum.sendKeys("123456789");//Enter username from your database as in my this one is working.
        Thread.sleep(2000);
        WebElement docemail = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div/div/div[2]/form/div[6]/input"));
        docemail.sendKeys("pratikp@xyz.com");//Enter username from your database as in my this one is working.
        Thread.sleep(2000);
        WebElement pass = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div/div/div[2]/form/div[7]/input"));
        pass.sendKeys("123456");//Enter username from your database as in my this one is working.
        Thread.sleep(2000);
        WebElement compassword = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div/div/div[2]/form/div[8]/input"));
        compassword.sendKeys("123456");//Enter username from your database as in my this one is working.
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div/div/div[2]/form/button"));
        submit.click();
        Thread.sleep(2000);

        String actualUrl = "http://localhost/Hospital%20Management%20System/hospital/hms/admin/manage-doctors.php";//Enter the link of the web page to which login page will direct us.
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        System.out.println("------------------------------------------------------------------");

    }
}
