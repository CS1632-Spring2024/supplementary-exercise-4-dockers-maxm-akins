package edu.pitt.cs;
// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;



public class AppSpotTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    driver = new ChromeDriver(options);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tEST1LINKS() {
    // Test name: TEST-1-LINKS
    // Step # | name | target | value
    // 1 | open | http://localhost:8080 | 
    driver.get("http://localhost:8080");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | assertElementPresent | xpath=//a[contains(@href, '/reset')] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href, \'/reset\')]"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void tEST2RESET() {
    // Test name: TEST-2-RESET
    // Step # | name | target | value
    // 1 | open | http://localhost:8080 | 
    driver.get("http://localhost:8080");
    // 2 | runScript | document.cookie = "1=true";document.cookie = "2=true";document.cookie = "3=true"; | 
    js.executeScript("document.cookie = \"1=true\";document.cookie = \"2=true\";document.cookie = \"3=true\";");
    // 3 | click | xpath=//a[contains(@href, '/reset')] | 
    driver.findElement(By.xpath("//a[contains(@href, \'/reset\')]")).click();
    // 4 | assertText | css=.list-group-item:nth-child(1) | ID 1. Jennyanydots
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(1)")).getText(), is("ID 1. Jennyanydots"));
    // 5 | assertText | css=.list-group-item:nth-child(2) | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(2)")).getText(), is("ID 2. Old Deuteronomy"));
    // 6 | assertText | css=.list-group-item:nth-child(3) | ID 3. Mistoffelees
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(3)")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST3CATALOG() {
    // Test name: TEST-3-CATALOG
    // Step # | name | target | value
    // 1 | open | http://localhost:8080 | 
    driver.get("http://localhost:8080");
    // 2 | storeAttribute | xpath=//li[2]/img@src | img
    {
      WebElement element = driver.findElement(By.xpath("//li[2]/img"));
      String attribute = element.getAttribute("src");
      vars.put("img", attribute);
    }
    // 3 | assert | img | /images/cat2.jpg
    assertEquals(vars.get("img").toString(), "http://localhost:8080/images/cat2.jpg");
  }
  @Test
  public void tEST4LISTING() {
    // Test name: TEST-4-LISTING
    // Step # | name | target | value
    // 1 | open | http://localhost:8080 | 
    driver.get("http://localhost:8080");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | xpath=//a[contains(@href, '/')] | 
    driver.findElement(By.xpath("//a[contains(@href, \'/\')]")).click();
    // 4 | assertElementPresent | xpath=//div/ul/li[3] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div/ul/li[3]"));
      assert(elements.size() > 0);
    }
    // 5 | assertElementNotPresent | xpath=//div/ul/li[4] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div/ul/li[4]"));
      assert(elements.size() == 0);
    }
    // 6 | assertText | xpath=//div/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//div/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST5RENTACAT() {
    // Test name: TEST-5-RENT-A-CAT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080 | 
    driver.get("http://localhost:8080");
    // 2 | click | linkText=Rent-A-Cat | 
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 3 | assertText | xpath=//button | Rent
    assertThat(driver.findElement(By.xpath("//button")).getText(), is("Rent"));
    // 4 | assertText | xpath=//div[3]/div[3]/button | Return
    assertThat(driver.findElement(By.xpath("//div[3]/div[3]/button")).getText(), is("Return"));
  }
  @Test
  public void tEST6RENT() {
    // Test name: TEST-6-RENT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080 | 
    driver.get("http://localhost:8080");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | xpath=//a[contains(@href, '/rent-a-cat')] | 
    driver.findElement(By.xpath("//a[contains(@href, \'/rent-a-cat\')]")).click();
    // 4 | click | xpath=//input[@id='rentID'] | 
    driver.findElement(By.xpath("//input[@id=\'rentID\']")).click();
    // 5 | type | xpath=//input[@id='rentID'] | 1
    driver.findElement(By.xpath("//input[@id=\'rentID\']")).sendKeys("1");
    // 6 | click | xpath=//button | 
    driver.findElement(By.xpath("//button")).click();
    // 7 | assertText | xpath=//div[@id='rentResult'] | Success!
    assertThat(driver.findElement(By.xpath("//div[@id=\'rentResult\']")).getText(), is("Success!"));
    // 8 | assertText | xpath=//div/ul/li | Rented out
    assertThat(driver.findElement(By.xpath("//div/ul/li")).getText(), is("Rented out"));
    // 9 | assertText | xpath=//div/ul/li[2] | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.xpath("//div/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    // 10 | assertText | xpath=//div/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//div/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST7RETURN() {
    // Test name: TEST-7-RETURN
    // Step # | name | target | value
    // 1 | open | http://localhost:8080 | 
    driver.get("http://localhost:8080");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=true";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=true\";document.cookie = \"3=false\";");
    // 3 | click | xpath=//a[contains(@href, '/rent-a-cat')] | 
    driver.findElement(By.xpath("//a[contains(@href, \'/rent-a-cat\')]")).click();
    // 4 | click | xpath=//div[3]/div[2]/input | 
    driver.findElement(By.xpath("//div[3]/div[2]/input")).click();
    // 5 | type | xpath=//div[3]/div[2]/input | 2
    driver.findElement(By.xpath("//div[3]/div[2]/input")).sendKeys("2");
    // 6 | click | xpath=//div[3]/div[3]/button | 
    driver.findElement(By.xpath("//div[3]/div[3]/button")).click();
    // 7 | assertText | xpath=//div/ul/li | ID 1. Jennyanydots
    assertThat(driver.findElement(By.xpath("//div/ul/li")).getText(), is("ID 1. Jennyanydots"));
    // 8 | assertText | xpath=//div/ul/li[2] | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.xpath("//div/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    // 9 | assertText | xpath=//div/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//div/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
    // 10 | assertText | xpath=//div[@id='returnResult'] | Success!
    assertThat(driver.findElement(By.xpath("//div[@id=\'returnResult\']")).getText(), is("Success!"));
  }
  @Test
  public void tEST8FEEDACAT() {
    // Test name: TEST-8-FEED-A-CAT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080 | 
    driver.get("http://localhost:8080");
    // 2 | click | xpath=//a[contains(@href, '/feed-a-cat')] | 
    driver.findElement(By.xpath("//a[contains(@href, \'/feed-a-cat\')]")).click();
    // 3 | assertText | xpath=//button | Feed
    assertThat(driver.findElement(By.xpath("//button")).getText(), is("Feed"));
  }
  @Test
  public void tEST9FEED() {
    // Test name: TEST-9-FEED
    // Step # | name | target | value
    // 1 | open | http://localhost:8080 | 
    driver.get("http://localhost:8080");
    // 2 | click | xpath=//a[contains(@href, '/feed-a-cat')] | 
    driver.findElement(By.xpath("//a[contains(@href, \'/feed-a-cat\')]")).click();
    // 3 | click | xpath=//input[@id='catnips'] | 
    driver.findElement(By.xpath("//input[@id=\'catnips\']")).click();
    // 4 | type | xpath=//input[@id='catnips'] | 6
    driver.findElement(By.xpath("//input[@id=\'catnips\']")).sendKeys("6");
    // 5 | click | xpath=//button | 
    driver.findElement(By.xpath("//button")).click();
    // 6 | assertText | xpath=//div[4] | Nom, nom, nom.
    assertThat(driver.findElement(By.xpath("//div[4]")).getText(), is("Nom, nom, nom."));
  }
  @Test
  public void tEST10GREETACAT() {
    // Test name: TEST-10-GREET-A-CAT
    // Step # | name | target | value
    // 1 | open | http://localhost:8080 | 
    driver.get("http://localhost:8080");
    // 2 | click | xpath=//a[contains(@href, '/greet-a-cat')] | 
    driver.findElement(By.xpath("//a[contains(@href, \'/greet-a-cat\')]")).click();
    // 3 | assertText | xpath=//div[2]/h4 | Meow!Meow!Meow!
    assertThat(driver.findElement(By.xpath("//div[2]/h4")).getText(), is("Meow!Meow!Meow!"));
  }
  @Test
  public void tEST11GREETACATWITHNAME() {
    // Test name: TEST-11-GREET-A-CAT-WITH-NAME
    // Step # | name | target | value
    // 1 | open | http://localhost:8080greet-a-cat/Jennyanydots | 
    driver.get("http://localhost:8080/greet-a-cat/Jennyanydots");
    // 2 | assertText | xpath=//div[2]/h4 | Meow! from Jennyanydots.
    assertThat(driver.findElement(By.xpath("//div[2]/h4")).getText(), is("Meow! from Jennyanydots."));
  }
}
