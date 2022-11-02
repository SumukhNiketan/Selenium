package com.pageFactoryClasses;

import java.lang.reflect.Proxy;

import org.openqa.selenium.WebElement;


/*This is the wrapper class for our WebElement with this proxy object. 
 * This accepts a WebElement and returns the proxy wrapped WebElement .*/
public class ElementGuard {

    public static WebElement guard(WebElement element) {
        ElementProxy proxy = new ElementProxy(element);
        WebElement wrappedElement = (WebElement) Proxy.newProxyInstance(ElementProxy.class.getClassLoader(),
                                                                       new Class[] { WebElement.class },
                                                                       proxy);
        return wrappedElement;
    }

}