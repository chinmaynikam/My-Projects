import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminSidebarMenu extends HMS {
    @Test
    public void TC_WB_AS1_sidebar1() throws InterruptedException {
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
        WebElement patients = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/nav/ul/li[3]/a"));
        patients.click();
        Thread.sleep(2000);
        WebElement Mpatients = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/nav/ul/li[3]/ul/li/a"));
        Mpatients.click();
        Thread.sleep(2000);
        WebElement profile=driver.findElement(By.xpath("/html/body/div/div[2]/header/div[2]/ul/li[2]/a"));
        profile.click();
        Thread.sleep(1000);
        WebElement logout= driver.findElement(By.xpath("/html/body/div/div[2]/header/div[2]/ul/li[2]/ul/li[2]/a"));
        logout.click();
        Thread.sleep(2000);
        String actualUrl = "http://localhost/Hospital%20Management%20System/hospital/index.html";//Enter the link of the web page to which login page will direct us.
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        System.out.println("------------------------------------------------------------------");

    }

    @Test
    public void TC_WB_AS2_sidebar2() throws InterruptedException {
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
        WebElement appHistory = driver.findElement(By.xpath("/html/body/div/div[1]/div/nav/ul/li[4]/a"));
        appHistory.click();
        Thread.sleep(2000);
        WebElement profile=driver.findElement(By.xpath("/html/body/div/div[2]/header/div[2]/ul/li[2]/a"));
        profile.click();
        Thread.sleep(1000);
        WebElement logout= driver.findElement(By.xpath("/html/body/div/div[2]/header/div[2]/ul/li[2]/ul/li[2]/a"));
        logout.click();
        Thread.sleep(2000);
        String actualUrl = "http://localhost/Hospital%20Management%20System/hospital/index.html";//Enter the link of the web page to which login page will direct us.
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        System.out.println("------------------------------------------------------------------");

    }

    @Test
    public void TC_WB_AS3_sidebar3() throws InterruptedException
    {
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
        WebElement dsl = driver.findElement(By.xpath("/html/body/div/div[1]/div/nav/ul/li[6]/a"));
        dsl.click();
        Thread.sleep(2000);
        WebElement profile=driver.findElement(By.xpath("/html/body/div/div[2]/header/div[2]/ul/li[2]/a"));
        profile.click();
        Thread.sleep(1000);
        WebElement logout= driver.findElement(By.xpath("/html/body/div/div[2]/header/div[2]/ul/li[2]/ul/li[2]/a"));
        logout.click();
        Thread.sleep(2000);
        String actualUrl = "http://localhost/Hospital%20Management%20System/hospital/index.html";//Enter the link of the web page to which login page will direct us.
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        System.out.println("------------------------------------------------------------------");
    }

    @Test
    public void TC_WB_AS4_sidebar4() throws InterruptedException
    {
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
        WebElement usl = driver.findElement(By.xpath("/html/body/div/div[1]/div/nav/ul/li[7]/a"));
        usl.click();
        Thread.sleep(2000);
        WebElement profile=driver.findElement(By.xpath("/html/body/div/div[2]/header/div[2]/ul/li[2]/a"));
        profile.click();
        Thread.sleep(1000);
        WebElement logout= driver.findElement(By.xpath("/html/body/div/div[2]/header/div[2]/ul/li[2]/ul/li[2]/a"));
        logout.click();
        Thread.sleep(2000);
        String actualUrl = "http://localhost/Hospital%20Management%20System/hospital/index.html";//Enter the link of the web page to which login page will direct us.
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        System.out.println("------------------------------------------------------------------");
    }
}


