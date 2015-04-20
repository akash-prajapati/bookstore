package com.redhat.training.ui.pages;

import org.jboss.arquillian.graphene.page.Location;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Location("faces/buy.xhtml")
public class BuyPage {

	@FindBy(id="placeOrderLink")
	private WebElement loginPlaceOrder;
	
	
	public void placeOrder(){
		loginPlaceOrder.click();
	}
	
}
