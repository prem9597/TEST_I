package CucumberTest1.org.FinalPracticeCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddToCart extends BaseClass {
	@Given("get the cart count")
	public void NumverItemsAddedinCart() {
		String text = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-badge-content-0\"]")))
				.getText();
		System.out.println(text);
	}
	@Given("User click the contibue button")
	public void userClickContinueButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body.mat-typography:nth-child(2) div.container app-shoppingcart.ng-star-inserted:nth-child(2) mat-card.mat-mdc-card.mdc-card.my-4 mat-card.mat-mdc-card.mdc-card.ng-star-inserted mat-card-content.mat-mdc-card-content button.mt-2.mdc-button.mdc-button--raised.mat-mdc-raised-button.mat-primary.mat-mdc-button-base > span.mdc-button__label")))
		.click();	
	}

	@Then("Click the add to cart button")
	public void AddtheItemsTocart() {
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body.mat-typography:nth-child(2) div.container app-book-details.ng-star-inserted:nth-child(2) mat-card.mat-mdc-card.mdc-card.mt-4.ng-star-inserted:nth-child(1) mat-card-content.mat-mdc-card-content.row.g-0.d-flex.p-3 div.col-md-5.col-sm-12.d-flex.flex-column.justify-content-between div:nth-child(2) app-addtocart:nth-child(1) button.mdc-button.mdc-button--raised.mat-mdc-raised-button.mat-primary.mat-mdc-button-base > span.mat-mdc-button-touch-target")))
				.click();

	}

}
