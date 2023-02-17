package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());


    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]")
    WebElement computersTab;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]")
    WebElement computerText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='item-grid']/div[1]")
    WebElement desktopsLink;
    @CacheLookup
    @FindBy(xpath = "//div[@class='page category-page']/div/h1")
    WebElement desksTopsText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='item-grid']/div[1]/div/div[2]/h2/a")
    WebElement buildYourOwnComputerLink;
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropDown;
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramDropDown;
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement radioButtonHDD;
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement radioButtonOS;
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement softwareCheckBox;
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;
    @FindBy(xpath = "//div[@class='bar-notification success']/p")
    WebElement productAddedMessage;


    public void clickOnComputerTab() {
        clickOnElement(computersTab);
    }

    public String verifyComputerText(String comp) {
        return getTextFromElement(computerText);
    }

    public void clickOnDesktopsLink() {
        clickOnElement(desktopsLink);
    }

    public String verifyDesktopsText(String desk) {
        return getTextFromElement(desksTopsText);
    }

    public void clickOnBuildYourOwnComputerLink() {
        clickOnElement(buildYourOwnComputerLink);
    }

    public void clickonAddtoCartButton() {
        clickOnElement(addToCartButton);
    }

    public String verifyProductAddedMessage() {
        return getTextFromElement(productAddedMessage);
    }

    public void makeyourowncomp(String processor, String ram, String hdd, String os, String software) throws InterruptedException {
        sendTextToElement(processorDropDown, processor);
        Thread.sleep(2000);
        sendTextToElement(ramDropDown, ram);
        Thread.sleep(2000);
        sendTextToElement(radioButtonHDD, hdd);
        Thread.sleep(2000);
        sendTextToElement(radioButtonOS, os);
        Thread.sleep(2000);
        sendTextToElement(softwareCheckBox, software);
        Thread.sleep(2000);
        clickOnElement(addToCartButton);
    }
}