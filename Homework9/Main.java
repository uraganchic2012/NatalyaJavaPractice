package Homework9;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
    String locator =  "//*[id='some-id']";
    LinkElement myLink = new LinkElement();
    myLink.getElement(locator);
    myLink.click(locator);

    TextElement  myText = new TextElement();
    myText.getElement(locator);
    myText.click(locator);

    BaseElement myElement = new BaseElement();
    myElement.getElement(locator);
    myElement.click(locator);


    }
}
//    Create a new file Homework9.java file in IntelliJ IDEA
//        Create a base class for a web elements - BaseElement
//        Create two classes that inherit from the class above: LinkElement and TextElement
//        Declare a string variable locator with a value "//*[id='some-id']", so it is in both classes (without duplicating the code)
//        Implement one simple method click(), so it is in both classes (without duplicating the code)
//        On a click there should be a message printed to the Console: "clicked on an element"
//        The statement above is true for a text type of element - you can click on it but nothing will happen really
//        At the same time when you click on a link - you usually get redirected to some other page, so in this case please print out: "clicked and redirected"
//        It is a simplified version of a framework structure that we will cover in details when we start Selenium