package com.pageFactoryClasses;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.openqa.selenium.WebElement;

public class ElementProxy implements InvocationHandler {

    private final WebElement element;

    public ElementProxy(WebElement element) {
        this.element = element;
    }

    //This invoke method is called before handling the popup
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.checkForPopupAndKill();
        //At this moment the popup appeared would have been closed
        Object result = method.invoke(element, args);
        return result;
    }

    private void checkForPopupAndKill() {
       /* Will write the code here to disable the popup
        * if (popup.isDisplayed()) {
            If its a window based popup, then I use concept of 
            getWindowHandles and traverse to the popup window
             and disable the popup by taking necessary actions
        }*/
    }
    
}