package CucumberTest1.org.FinalPracticeCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomPage extends BaseClass {
	@Given("User should login to the application")
	public void UserEnterTheLoginPage() {
		driver.get("https://bookcart.azurewebsites.net/");
	}

	@Given("User click the login button")
	public void loginPageButtonclick() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[mattooltip='Login']"))).click();
	}

	@Given("Click the Cart button")
	public void addToCartclick() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body.mat-typography:nth-child(2) app-nav-bar.mat-elevation-z6 mat-toolbar.mat-toolbar.mat-elevation-z4.mat-primary.mat-toolbar-multiple-rows mat-toolbar-row.mat-toolbar-row.justify-content-between div.d-flex.align-items-center:nth-child(3) button.mdc-icon-button.mat-mdc-icon-button.mat-unthemed.mat-mdc-button-base.ng-star-inserted:nth-child(1) > span.mat-mdc-button-touch-target")))
				.click();
	}

	@When("Enter the search value {string}")
	public void searchBar(String Search) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body.mat-typography:nth-child(2) app-nav-bar.mat-elevation-z6 mat-toolbar.mat-toolbar.mat-elevation-z4.mat-primary.mat-toolbar-multiple-rows mat-toolbar-row.mat-toolbar-row.justify-content-between div:nth-child(2) app-search:nth-child(1) form.ng-untouched.ng-pristine.ng-valid > input.mat-mdc-autocomplete-trigger.searchbox.ng-valid.ng-touched.ng-dirty")))
		.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body.mat-typography:nth-child(2) app-nav-bar.mat-elevation-z6 mat-toolbar.mat-toolbar.mat-elevation-z4.mat-primary.mat-toolbar-multiple-rows mat-toolbar-row.mat-toolbar-row.justify-content-between div:nth-child(2) app-search:nth-child(1) form.ng-untouched.ng-pristine.ng-valid > input.mat-mdc-autocomplete-trigger.searchbox.ng-valid.ng-touched.ng-dirty")))
				.sendKeys(Search);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body.mat-typography:nth-child(2) div.cdk-overlay-container:nth-child(7) div.cdk-overlay-connected-position-bounding-box div.cdk-overlay-pane div.mat-mdc-autocomplete-panel.mdc-menu-surface.mdc-menu-surface--open.ng-trigger.ng-trigger-panelAnimation.ng-tns-c3964489799-0.ng-star-inserted.mat-mdc-autocomplete-visible mat-option.mat-mdc-option.mdc-list-item.ng-star-inserted > span.mdc-list-item__primary-text"))).click();
	}
}
