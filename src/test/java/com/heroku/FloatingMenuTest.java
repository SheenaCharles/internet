package com.heroku;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FloatingMenuTest extends CrossBrowserTest {
    @Test
    protected void floatingMenuTest () {
        driver.get("http://localhost:7080");
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(19) > a")).click();
        FloatingMenuPage floatingMenuPage = PageFactory.initElements(driver, FloatingMenuPage.class);
        Assert.assertTrue(floatingMenuPage.isMenuFloating());
    }
}
