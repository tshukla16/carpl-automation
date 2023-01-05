package com.katalon
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Stepfile {
	/**
	 class MyStepDefinition {
	 /**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("I navigate to Carplai application")
	public void I_navigate_to_Cura_System_homepage() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')
	}



	@And("I enter username (.*) and password (.*)")
	public void I_enter_valid_username_password(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/input_Login in to_email'),
				'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/input_Login in to_password'),
				'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/button_LOG IN'))
	}

	@And("I click Log in button")
	def I_click_login_btn() {

		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))
	}

	@Then("I should be able to login successfully")
	def I_login_successfully() {
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_WorkFlow'))
		//WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))
		//WebUI.verifyTextPresent('Make Appointment', false)
		WebUI.back()

		//WebUI.closeBrowser()
	}

	@And("I enter the invalid username and Click in submit button")
	public void I_enter_invalid_username_password() {

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))
	}

	@And("I enter the invalid username and invalid password")
	public void I_enter_invalid_data() {

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'tanayshukla16@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'Airpush@1601')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))
	}

	@And("I enter the invalid password")
	public void I_enter_invalid_Password() {


		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'Airpush@1601')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))
	}

	@Then("User Should not enter characters more than specified range")
	public void User_Should_not_enter_characters_more_than_specified_range() {
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'tanayshukla16@gmail.comtshukla@gmail.comtshukla@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'Airpush@1601')
	}

	@When("I click in forgot link")
	public void I_click_in_Forgot_Link(){
		WebUI.waitForPageLoad(30)
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Click here to reset it'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/input_RESET PASSWORD_email'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_RESET PASSWORD'))
		//WebUI.sendKeys(findTestObject('Object Repository/Page_CARPL.ai/input_RESET PASSWORD_email'),Keys.chord(Keys.ENTER))





	}

	@Then("Reset password page will appear")
	public void Reset_password_page_will_appear() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/div_RESET PASSWORD'), 20)
	}

	@When("I enter the invalid username")
	public  void I_enter_the_invalid_username() {
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'tanayshukla16@gmail.comtshukla@gmail.comtshukla@gmail.com')
	}


	@When ("I enter the valid username")

	public void I_enter_the_valid_username() {
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')
	}

	@Then ("user is getting a error a message Enter Password")

	public  void user_is_getting_a_error_a_message_Enter_Password() {
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), '@@@')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Enter Password'))
		//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/span_Enter Password'), 20)
		WebUI.closeBrowser()
	}

	@Given("I navigate gmail application")

	def I_navigate_gmail_application() {


		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://accounts.google.com/v3/signin/identifier?dsh=S2080782870%3A1668433658114427&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=ARgdvAu1ae0YuUduDzRIgCtv4WbYOUPFvhfVkHrxUQNUp7vHEeaWMn5xIbXkz69eVwboZ7OWhcx4')
	}

	@When("I enter username and password in gmail")

	def I_enter_username_and_password_in_gmail () {

		WebUI.setText(findTestObject('Object Repository/Page_Gmail/input_to continue to Gmail_identifier'), '34shukla@gmail.com')

		WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Next'))

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Gmail/input_Too many failed attempts_Passwd'), 'd4oEhXEFz5hSrM9Tll3dHg==')
		WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Next'))
	}

	@Then ("Verify the user will get the register email info@carpl.ai")

	def Verify_the_user_will_get_the_register_email () {



		WebUI.click(findTestObject('Object Repository/Page_Inbox (1) - 34shuklagmail.com - Gmail/div_info 2'))

		WebUI.doubleClick(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/h2_Activate your account'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/h2_Activate your account'), 20)
		WebUI.closeBrowser()
	}


	@Given ("I navigate to Carplai register page")
	def I_navigate_to_Carplai_register_page () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/register')
	}

	@When("Fill the invalid password and click register button")


	def Fill_the_invalid_password_and_click_register_button () {

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Register_password'), 'd4oEhXEFz5hSrM9Tll3dHg==')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Register'))
		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Register'))
		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Register'))
	}


	@Then ("It should show error message Password did not Match")

	def Then_It_should_show_error_message_Password_did_not_Match () {
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Password didnt Match'))

		WebUI.doubleClick(findTestObject('Object Repository/Page_CARPL.ai/span_Password didnt Match'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Password didnt Match'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/span_Password didnt Match'),20)
	}


	@When("click in masked icon under password textboxes in new register page")

	def When_click_in_masked_password_in_new_register_page () {

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Register_togglePassword'))
	}

	@Then("user click successfully toggle icon password textbox")

	def user_click_successfully_toggle_icon_password_textbox () {


		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/i_Register_togglePassword'),20)
	}



	@When("user enter the different (.*) and passwords (.*)")
	def I_enter_valid_usernames_passwords(String username, String password) {
		WebUI.navigateToUrl('https://dev.carpl.ai/register')
		WebUI.waitForPageLoad(30)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Register_password'), 'PLGTm/4mhzCFv1nCPynrvg==')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Register_confirmpassword'), 'PLGTm/4mhzCFv1nCPynrvg==')
	}

	@When("Enter the space with password in password textboxes")

	def Enter_the_space_with_password_in_password_textboxes  () {
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Register_password'), 'fasWvQRwkC+m3/xpepZ8Fw==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/form_Register Password should have 8-20 cha_a3cfa4'))

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Register_confirmpassword'), 'fasWvQRwkC+m3/xpepZ8Fw==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Register'))
	}


	@Then("It should not reach to dashborad")
	def It_should_not_reach_to_dashborad () {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/span_Password should have 8-20 characters c_74dd8a'),20)
	}


	@When("Enter the password with number")
	def Enter_the_password_with_number () {

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Register_password'), 'iGDxf8hSRT4=')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Register_confirmpassword'), 'iGDxf8hSRT4=')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Register'))
	}

	@Then("It should gives a error massage")
	def It_should_gives_a_error_massage() {
	}

	@When("Enter the password with minimum number")
	def Enter_the_password_with_minimum_number() {
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Register_password'), 'PLGTm/4mhzCFv1nCPynrvg==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/form_Register Password should have 8-20 cha_a3cfa4'))

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Register_confirmpassword'), 'PLGTm/4mhzCFv1nCPynrvg==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Register'))
	}

	@Then("It should show the error message fill the 8 to 20 character")
	def It_should_show_the_error_message_fill_the_8_to_20_character () {
		//WebUI.doubleClick(findTestObject('Object Repository/Page_CARPL.ai/span_Password should have 8-20 characters c_74dd8a'))

		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Password should have 8-20 characters c_74dd8a'))
	}

	@When("Fill the Email Text field that has an Email address without @ symbol")

	def Fill_the_Email_Text_field_that_has_an_Email_address_without_symbol(){
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Register_username'), 'tshukla1790.com')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Register'))
	}
	@Then("It should show the message Invalid mail id")
	def It_should_show_the_message_Invalid_mail_id () {
		//	WebUI.doubleClick(findTestObject('Object Repository/Page_CARPL.ai/span_Enter Valid Email Address'))

		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Enter Valid Email Address'))
		//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/span_Enter Valid Email Address'),20)
	}

	@When("Enter the email with random string")
	def Enter_the_email_with_random_string () {
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Register_username'), 'tshukla1790.com')
	}

	@When("Enter the email without dot in email address")
	def Enter_the_email_without_dot_in_email_address () {
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Register_username'), 'tshukla1790com')
	}

	@Then("I click in register button")
	def I_click_in_register_button () {
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Register'))
	}

	@When("user Fill the detail which already register")

	def user_Fill_the_detail_which_already_register () {
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/input_Register_name'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Register_name'), 'Tanay Shukla')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/input_Register_username'))

		WebUI.doubleClick(findTestObject('Object Repository/Page_CARPL.ai/input_Register_username'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Register_username'), 'tshukla375@gmail.com')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Register_password'), 'd4oEhXEFz5hSrM9Tll3dHg==')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Register_confirmpassword'), 'd4oEhXEFz5hSrM9Tll3dHg==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Register'))
	}

	@Then("It should show the message Email is already registered")

	def It_should_show_the_message_Email_is_already_registered() {
		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/p_Email is already registered'))

		//WebUI.doubleClick(findTestObject('Object Repository/Page_CARPL.ai/p_Email is already registered'))

		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/p_Email is already registered'))

		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/p_Email is already registered'))
		//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/p_Email is already registered'),20)
	}

	@When ("user do not fill in register page")

	def When_user_do_not_fill_in_register_page () {

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/input_Register_name'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/form_Register Enter NameRegisterAlready Reg_ef0c89'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/form_Register Enter Name Enter Email IDRegi_ba56d3'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/form_Register Enter Name Enter Email ID Ent_e30a4c'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Register'))
	}

	@Then ("it should not show the dasborad page")

	def it_not_show_the_dasborad_page() {
	}

	@Given("I navigate reset page of Carplai application")

	def I_navigate_reset_page_of_Carplai_application () {
		WebUI.navigateToUrl('https://dev.carpl.ai/reset')
	}

	@Then ("cursor is not in the username textbox")
	def cursor_is_not_in_the_username_textbox () {
	}

	@And ("click in forgot password link")
	def click_in_forgot_password_link () {

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Click here to reset it'))
	}

	@When("Verify the email field is present on the forget password page")
	def Verify_the_email_field_is_present_on_the_forget_password_page() {
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Click here to reset it'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/input_RESET PASSWORD_email'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/input_RESET PASSWORD_email'),20)
	}


	@When("Enter the invalid email id in email textboxes")
	def Enter_the_invalid_email_id_in_email_textboxes () {

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_RESET PASSWORD_email'), 't@gmail.com')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_RESET PASSWORD'))
	}

	@Then("user is getting a error a massage Email doesn't exist")

	def user_is_getting_a_error_a_massage_Email_doesnot_exist () {


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_RESET PASSWORDEnter your registered ema_142057'))
		//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/div_RESET PASSWORDEnter your registered ema_142057'),20)
	}

	@When("Enter the invalid email id in rest password page")

	def Enter_the_email_id_in_rest_password_page () {
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/input_RESET PASSWORD_email'))

		WebUI.doubleClick(findTestObject('Object Repository/Page_CARPL.ai/input_RESET PASSWORD_email'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_RESET PASSWORD_email'), 'tshukla16@gmail.com')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_RESET PASSWORD'))
	}

	@Then("verfiy the error message Something went wrong")

	def verfiy_the_error_message_Something_went_wrong() {
		//WebUI.doubleClick(findTestObject('Object Repository/Page_CARPL.ai/p_Something went wrong'))

		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/p_Something went wrong'))
		//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/p_Something went wrong'),20)


	}

	@When("Enter the valid email id in rest password page")

	def Enter_the_valid_email_id_in_rest_password_page () {
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/input_RESET PASSWORD_email'))

		WebUI.doubleClick(findTestObject('Object Repository/Page_CARPL.ai/input_RESET PASSWORD_email'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_RESET PASSWORD_email'), 'tanay.shukla@carpl.ai')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_RESET PASSWORD'))
	}

	@Then ("it should show the message A password reset link has been sent to your email")

	def  it_should_show_the_message_A_password_reset_link_has_been_sent_to_your_email () {
		WebUI.doubleClick(findTestObject('Object Repository/Page_CARPL.ai/p_A password reset link has been sent to yo_6fe7d8'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/p_A password reset link has been sent to yo_6fe7d8'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/p_A password reset link has been sent to yo_6fe7d8'),20)
		WebUI.closeBrowser()
	}



	@When("Enter the new password textboxes and confrim new password textboxes")

	def Enter_the_new_password_textboxes_and_confrim_new_password_textboxes () {
		WebUI.navigateToUrl('https://dev.carpl.ai/reset/25/65x-652c33b11dd7fad7de23')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/form_RESET PASSWORDEnter New Password Enter_177522'))


		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_RESET PASSWORD'))
	}

	@Then("verfiy all textboxes and confrim button in reset password")

	def verfiy_all_textboxes_and_confrim_button_in_reset_password () {


		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/button_RESET PASSWORD'),20)
	}

	@When("I verfiy icon in Dashboard page")
	def I_verfiy_icon_in_Dashboard_page () {
		WebUI.maximizeWindow()

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Data Studies_noun ctScan'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Data Studies_noun mammo'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_2'))
	}

	@Then("It should not overlap each other")
	def It_should_not_overlap_each_other () {

		WebUI.waitForPageLoad(30)
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dashboard'))
		WebUI.waitForPageLoad(30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/div_Data Studies_noun mammo'),20)
	}

	@When("Verify the hyperlink under dashboard page")
	def Verify_the_hyperlink_under_dashboard_page () {
		WebUI.maximizeWindow()
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_2'))
		WebUI.waitForPageLoad(30)
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dashboard'))
		WebUI.waitForPageLoad(30)
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_0'))
		WebUI.waitForPageLoad(30)
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dashboard'))
		WebUI.waitForPageLoad(30)
	}



	@Then ("Link are working fine my projects and my Templates")

	def Link_are_working_fine_my_projects_and_my_Templates () {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/a_Dashboard'),20)
	}

	@Then ("Link are working fine in annotation")

	def Then_Link_are_working_fine_in_annotation_page () {

		WebUI.navigateToUrl('https://dev.carpl.ai/annotation_template')
		WebUI.closeBrowser()
	}

	@When ("Verify Records Are Only Increasing In the Dashboard When We Addupload Studies And Collections")

	def Verify_the_Records_Are_Only_Increasing_In_the_Dashboard_When_We_Add_upload_Studies_And_Collections() {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.waitForPageLoad(30)

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset'))


		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Dataset Name_dataset'), 'test1302111110000')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Dataset Description_datasetInfo'), 'test1300211111000')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/svg_Select Modality_css-19bqh2r'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_CT'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset_1'))

		WebUI.closeBrowser()

		WebUI.openBrowser('')

		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Datasets40'))
		WebUI.closeBrowser()
	}


	@Then ("records count are increase on dashboard")

	def Then_records_count_are_increase_on_dashboard () {

		//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/p_Workflows'),20)
		//WebUI.closeBrowser()
	}


	@Given ("create workflow in workflow option")

	def Given_create_workflow_in_workflow_option() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_WorkFlow'))




		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Workflow'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Project Name_Name'), 'demo')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Create_WorkflowButton'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Draft'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Publish'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Yes'))

		WebUI.closeBrowser()



		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/p_Workflows'))

		WebUI.closeBrowser();

		//		WebUI.openBrowser('')

		//		WebUI.navigateToUrl('https://dev.carpl.ai/')
		//
		//		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')
		//
		//		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')
		//
		//		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))
		//
		//		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))
		//
		//		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Search'))
		//		WebUI.waitForPageLoad(30)
		//		WebUI.doubleClick(findTestObject('Object Repository/Page_CARPL.ai/input_Collection Name_dataSourceName'))
		//
		//		WebUI.setText(findTestObject('Page_CARPL.ai/input_Collection Name_dataSourceName'), 'demo')

	}


	@When("Verify the carpl ai application")

	def Verify_the_carpl_ai_application () {
		if (WebUI.verifyElementClickable(findTestObject('Test Objects/Pages/Login Page/elContinue - Wrong'), FailureHandling.OPTIONAL)) {
			WebUI.click(findTestObject('Test Objects/Pages/Login Page/elContinue - Wrong'))
		} else {
			WebUI.click(findTestObject('Test Objects/Pages/Login Page/elContinue'))
		}
	}

	@Then ("Verify the workflow created")
	def Verify_the_workflow_create () {
	}


	@Given("enter the username and password")

	def enter_the_username_and_password () {

		WebUI.openBrowser('')
		WebUI.openBrowser('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))
	}

	@When("Search is functional and generating the correct result for correct keywords")

	def Search_is_functional_and_generating_the_correct_result_for_correct_keywords () {

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), 'dataset_1')

		//WebUI.sendKeys(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), Keys.chord(Keys.ENTER))
	}


	@Then("successfully get result in dataset page")
	def successfully_get_result_in_dataset_page () {

		//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'),20)
	}

	@When("search invalid data in dataset page")
	def search_invalid_data_in_dataset_page () {
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), '~')
	}

	@Then ("An error message should be display when a user enters the invalid keywords")

	def An_error_message_should_be_display_when_a_user_enters_the_invalid_keywords () {
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/p_No records found'))

		WebUI.doubleClick(findTestObject('Object Repository/Page_CARPL.ai/p_No records found'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/p_No records found'))
	}

	@When ("Verify pagination added in case if the search result goes on the number of pages")
	def search_result_goes_on_the_number_of_pages () {

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_2'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_3'))
	}

	@Then ("Page should selected according number of page")
	def Page_should_selected_according_number_of_page () {
	}


	@When ("Verify if new items added on the dataset, search would show the result")

	def When_Verify_if_new_items_added_on_the_dataset_search_would_show_the_result () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.waitForPageLoad(30)

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset'))


		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Dataset Name_dataset'), 'test1310000')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Dataset Description_datasetInfo'), 'test1310000')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/svg_Select Modality_css-19bqh2r'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_CT'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset_1'))

		WebUI.closeBrowser()
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.waitForPageLoad(30)

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), 'test123')
	}

	@When("Validate search rules defined for Exact Match with the search key word")

	def Validate_search_rules_defined_for_Exact_Match_with_the_search_key_word () {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/input_Login in to_email'),
				'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/input_Login in to_password'),
				'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/div_Select'))

		WebUI.setText(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/input_Search_form-control'),
				'DX')

		WebUI.click(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/button_View Dataset'))
	}


	@Then("These rules should work with exact match")
	def  work_with_exact_match () {
	}

	@When("Validate search rules defined for Similar Match with the search key word")

	def Validate_search_rules_defined_for () {


		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://uatv2.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), 'MR')
	}


	@When("Enter only special characters in the search field and click on the Search button")
	def  the_search_field_and_click_on_the_Search_button () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_WorkFlow_Icon-datasetManager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), '@')
	}


	@Then("dataset with special characters should show on result")

	def  dataset_with_special_characters_should_show_on_result () {

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_testshared'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/span_testshared'),20)
	}

	@When("Enter only numbers in the search field and click on the Search button")

	def Enter_only_numbers_in_the_search_field () {


		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), '12')
	}

	@Then("dataset with a number should show on result")

	def dataset_with_a_number_should_show_on_result () {

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Dataset ID61'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/div_Dataset ID61'),20)
	}


	@When("Enter alphanumeric characters in the search box and click on the Search button")

	def Enter_alphanumeric_characters_in_the_search_box_and_click_on_the_Search_button () {


		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), 'abc@12')
	}


	@Then("dataset with alphanumeric should show on result")
	def dataset_with_alphanumeric_should_show_on_result () {
	}


	@When ("Verify this on all pages where the Search box is available")
	def Verify_this_on_all_pages_where_the_Search_box_is_available () {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), 'abd')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), 'demo')



		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Training'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), 'test')



		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Testing  Monitoring'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), 'KZYNM')


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Deployment'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), 'Test_Inf_4')
	}



	@Then ("search box should be available in page or as per requirement")

	def search_box_should_be_available_in_page_or_as_per_requirement () {

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/p_check_ensemble_deployment.  .te83b7865-d5_ee3a88'))
	}



	@When("Verify the result when the user enters a partial searched keyword and click on search.")
	def Verify_the_result_when_the_user_enters_click_on_search () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), 'da')
	}

	@Then("It should search the similar result")
	def It_should_search_the_similar_result () {
	}

	@When("Verify place holder text added on search or not.")
	def Verify_place_holder_text_added_on_search_or_not () {


		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), 'dataset')


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'))

		WebUI.doubleClick(findTestObject('Object Repository/Page_CARPL.ai/div_Search'))
	}

	@Then("placeholder text is seen in Search box")
	def placeholder_text_is_seen_in_Search_box () {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/div_Search'),20)
	}


	@When("Verify no results are returned when the user enters no value and clicks on the Enter button")
	def Verify_no_results_are_returned_when_the_user_enters_no_value_and_click_on_the_Enter_button () {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'))
	}

	@Then("no result should be result when user search with null")
	def no_result_should_be_result_when_user_search_with_null () {
	}


	@When("User Click On The Create Dataset User Should Be Redirected To Create Dataset Pannel")
	def User_Click_On_The_Create_Dataset_User_Should_Be_Redirected_To_Create_Dataset_Pannel () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://uatv2.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.waitForPageLoad(30)

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Create Dataset'))
	}
	@Then("User should be redirected to create dataset pannel")
	def User_should_be_redirected_to_create_dataset_pannel () {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset'),20)
	}

	@When("check whether User can Create Dataset Without Filling Required Input")

	def check_whether_User_can_Create_Dataset_Without_Filling_Required_Input () {

		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/input_Login in to_email'),
				'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/input_Login in to_password'),
				'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.waitForPageLoad(30)

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Create Dataset'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset_1'))
	}


	@Then("user should not create dataset without filling required info")
	def Then_user_should_not_create_dataset_without_filling_required_info () {
	}

	@When("Check whether User can create Two Dataset With Same Name")
	def Check_whether_User_can_create_Two_Dataset_With_Same_Name () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://uatv2.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Create Dataset'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Dataset Name_dataset'), 'demo13')
		WebUI.waitForPageLoad(30)
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset_1'))
		WebUI.waitForPageLoad(30)
		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/p_Dataset already exists'))


	}

	@Then("user should not be create two dataset with same name")
	def user_should_not_be_create_two_dataset_with_same_name () {
		//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/p_Dataset already exists'),20)
	}

	@When("Check Dataset Description Accept Special Character")
	def Check_Dataset_Description_Accept_Special_Character () {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Create Dataset'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Dataset Name_dataset'), '((@((@((#/((?((((@(((!Test@*(&))))#))')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Dataset Description_datasetInfo'), '((@?@@(((((?(((((#(((((((^Test#)*&)))#)))')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset_1'))
	}


	@Then("Description should aceept special characters")
	def Description_should_aceept_special_characters() {
	}

	@When("Check User Can Select Modality From The Dropdown In Dataset Upload Panel")
	def Check_User_Can_Select_Modality_From_The_Dropdown_In_Dataset_Upload_Panel () {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Create Dataset'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Dataset Name_dataset'), 'fanfeb1011')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select Modality'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_CT'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset_1'))

		WebUI.doubleClick(findTestObject('Object Repository/Page_CARPL.ai/span_Modality CT'))
	}

	@Then("user can select modality from dropdown")
	def user_can_select_modality_from_dropdown () {

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Modality CT'))
	}

	@When("Check If User Can Select More Than One Modality At One Time")
	def Check_If_User_Can_Select_More_Than_One_Modality_At_One_Time () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Create Dataset'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select Modality'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_CT'))
	}

	@Then("user should not select multiple modalitys in one")
	def user_should_not_select_multiple_modalitys_in_one () {
	}

	@When("Check If User Choose Ct Modality Only Ct Data Can Be Uploded")
	def Check_If_User_Choose_Ct_Modality_Only_Ct_Data_Can_Be_Uploded () {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'anupam.sachan@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'PLGTm/4mhzCFv1nCPynrvg==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Create Dataset'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Dataset Name_dataset'), 'qwq1qqqqqqqqqfaaatataaqrtwqeprqiqaqwerr1tyt23765')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select Modality'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_CT'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset_1'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Upload Dataset'))
	}

	@Then("If user selected ct modalities only ct data can be upload else it should give a error massage")
	def  If_user_selected_ct_modalities_only_ct_data_can_be_upload_else_it_should_give_a_error_message () {
	}

	@When("Check If User Choose Mr Modality Only Mr Data Can Be Uploded")
	def Check_If_User_Choose_Mr_Modality_Only_Mr_Data_Can_Be_Uploded () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Create Dataset'))


		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Dataset Name_dataset'), 'wqweeptssqweriqrra298')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select Modality'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_MR'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset_1'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Upload Dataset'))
	}

	@Then("If user selected Mr modalities only mr data can be upload else it should give a error massage")
	def  If_user_selected_Mr_modalities_only_mr_data_can_be_upload_else_it_should_give_a_error_massage () {
	}

	@When("Check If User Choose MG Modality Only MG Data Can Be Uploded")
	def Check_If_User_Choose_Dr_Modality_Only_Dr_Data_Can_Be_Uploded () {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Create Dataset'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Dataset Name_dataset'), 'qweererhetrerrqw3qwe334564')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select Modality'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_MG'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset_1'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Upload Dataset'))
	}

	@Then("If user selected Mg modalities only mg data can be upload else it should give a error massage")
	def If_user_selected_Mg_modalities_only_mg_data_can_be_upload_else_it_should_give_a_error_massage () {
	}

	@When("Check If User Choose Dx|Cr|Xc Modality Only Dx|Cr|Xc Data Can Be Uploded")

	def Check_If_User_Choose_Modality_Only_Data_Can_Be_Uploded () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Create Dataset'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Dataset Name_dataset'), 'tererwardrrwqaiww58209101212')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select Modality'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_DX  CR  XC'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset_1'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Upload Dataset'))
	}


	@Then("If user selected Dx|Cr|Xc modalities only ct data can be upload else it should give a error massage")
	def If_user_selected_modalities_only_ct_ata_can_be_upload_else_it_should_give_a_error_massage () {
	}


	@When("Check If User Choose Us Modality Only Us Data Can Be Uploded")
	def Check_If_User_Choose_Us_Modality_Only_Us_Data_Can_Be_Uploded () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Dataset Name_dataset'), 'demo80')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select Modality'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_US'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset_1'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Upload Dataset'))
	}

	@Then("If user selected Us modalities only us data can be upload else it should give a error massage")

	def If_user_selected_Us_modalities_only_us_data_can_be_upload_else_it_should_give_a_error_massage () {
	}

	@When("Check Dataset Name Is Same As The User Input")
	def Check_Dataset_Name_Is_Same_As_The_User_Input () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Create Dataset'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Dataset Name_dataset'), 'qqqqq5522qqreeeew22rqewqq244444yuyttye')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select Modality'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_CT'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset_1'))

		WebUI.doubleClick(findTestObject('Object Repository/Page_CARPL.ai/h2_q244444Total Studies 0Modality CT'))
	}

	@Then("dataset name should be same")
	def dataset_name_should_be_same () {
	}


	@When("Check Total Study Is Showing In Top Of The Dataset Page")
	def Check_Total_Study_Is_Showing_In_Top_Of_The_Dataset_Page () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))



		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_View Dataset'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Total Studies 1'))
	}

	@Then("it should be show on dataset page")
	def it_should_be_show_on_dataset_page () {
	}

	@When("Check Modality Is Showing In Top Of The Dataset Page")
	def Check_Modality_Is_Showing_In_Top_Of_The_Dataset_Page () {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Dataset Name_dataset'), 'ewqqqqqwqeeaar122twrqrew')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select Modality'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_CT'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset_1'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Modality CT'))
	}


	@Then("Modality should be same as enters")
	def Modality_should_be_same_as_enters () {
	}

	@When("Check The Search In Dataset Is Working Or Not")
	def Check_The_Search_In_Dataset_Is_Working_Or_Not () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), 'data')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_View Dataset'))
	}

	@Then("search button should work as per the specificaion")
	def search_button_should_work_as_per_the_specificaion () {
	}

	@When("Check User Have Function To Upload A Single File Or An Folder")
	def Check_User_Have_Function_To_Upload_A_Single_File_Or_An_Folder () {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), 'q')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_View Dataset'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Upload Dataset'))
	}

	@Then("user should upload both single file and folder")
	def user_should_upload_both_single_file_and_fold () {
	}

	@When("Check For Modality Dx|Cr|Xc Only Dicom, Png, Jpg, Jpeg Are Accepted")

	def Check_For_Modality_Only_Dicom_Png_Jpg_Jpeg_Are_Accepted () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Create Dataset'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Dataset Name_dataset'), 'tqqatweqewarewqwrwardrrwqaiww58209101212')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select Modality'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_DX  CR  XC'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset_1'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Upload Dataset'))
	}


	@Then("user should not be upload other format as given")

	def user_should_not_be_upload_other_format_as_given () {
	}


	@When("Check If User Upload Any Other Format Rather Than Dicom, Png, Jpg, Jpeg, Rvg Give An Error")
	def Check_If_User_Upload_Any_Other_Format_Rather_Than_Dicom_Png_Jpg_Jpeg_Rvg_Give_An_Error () {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Dataset Name_dataset'), 'demurqee67')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/svg_Select Modality_css-19bqh2r'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_OT'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset_1'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Upload Dataset'))
	}

	@Then("system should give an error if user try to upload dicom in other format")

	def system_should_give_an_error_if_user_try_to_upload_dicom_i_other_format () {
	}


	@When("Check The Upload Speed Panel Shows The Exact No. Or Failed And Passed Studies While Upload")

	def Check_The_Upload_Speed_Panel_Shows_The_Exact_No_Or_Failed_And_Passed_Studies_While_Upload () {
	}


	@Then("count should be same on both places for fail and pass uploads")

	def count_should_be_same_on_both_place_for_fail_and_pass_uploads() {
	}

	@When("Check In Browser Annonymization Is Working Before We Upload Studies")
	def Check_In_Browser_Annonymization_Is_Working_Before_We_Upload_Studies () {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/input_Login in to_email'),
				'anupam.sachan@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/input_Login in to_password'),
				'PLGTm/4mhzCFv1nCPynrvg==')

		WebUI.click(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/button_View Dataset'))

		WebUI.click(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/span_Instances_carpl_checkbox'))

		WebUI.click(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/i_Upload Dataset_icon_box annonymize'))

		WebUI.click(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/button_CONFIRM'))

		WebUI.click(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/div__Backdrop'))
	}

	@Then("Browser Annonymization should be work before upload")

	def Browser_Annonymization_should_be_work_before_upload () {
	}

	@When("Check User Can Delete Study")
	def user_delete_study() {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/input_Login in to_email'),
				'anupam.sachan@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/input_Login in to_password'),
				'PLGTm/4mhzCFv1nCPynrvg==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		//WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), 'Test_mrdkd')

		WebUI.click(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/button_View Dataset'))

		WebUI.click(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/span_Instances_carpl_checkbox'))

		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Show 255075100EntriesShowing 1 to 1 of _6358e3'))

		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Instances_carpl_checkbox'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Upload Dataset_icon_box delete'))

		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Yes'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_wqaTotal Studies 0Modality Dicom Receiv_d189d8'))



	}

	@Then("user should delete the study that he uploaded")
	def user_should_delete_the_study_that_he_uploaded () {
	}

	@When("Check The Maximum No. Of Characters For The Templae Name")
	def Check_The_Maximum_No_Of_Characters_For_The_Templae_Name () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'testdemoaadmintestadminadmintestyesetester')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/nav_Annotation Template  .t50cd915a-d224-46_2ce30d'))

		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Copy TemplateDelete TemplateTemplate Na_79f452'))




	}


	@When("maximum characters should be 20")
	def  maximum_characters_should_be_20 () {
	}


	@When("Check If User Can Put Special Characters In The Name Field")
	def Check_If_Use_Can_Put_Special_Characters_In_The_Name_Field () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), '$$$$$')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/nav_Annotation Template  .t50cd915a-d224-46_2ce30d'))

		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Copy TemplateDelete TemplateTemplate Na_79f452'))


	}

	@Then("user should able to add special charcters")

	def user_should_able_to_add_special_charcters () {
	}

	@When("Check The Mandatory Inputs As Per Specifications")
	def Check_The_Mandatory_Inputs_As_Per_Specifications () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'tester12admin')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))

		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/nav_Annotation Template  .t50cd915a-d224-46_2ce30d'))

		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Copy TemplateDelete TemplateTemplate Na_79f452'))

	}

	@Then("user should not go ahead without filling mandatory input")
	def user_should_not_go_ahead_without_filling_mandatory_input () {
	}

	@When("Verify User Can Not Create Two Annotation Template With Same Name")
	def  Verify_User_Can_Not_Create_Two_Annotation_Template_With_Same_Name () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'exrom')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/nav_Annotation Template  .t50cd915a-d224-46_2ce30d'))

		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Copy TemplateDelete TemplateTemplate Na_79f452'))


	}

	@Then("It should not accept with same name")
	def It_should_not_accept_with_same_name () {
	}

	@When("Check whether the Diacom Reciver Button Is Working Or Not")
	def Check_whether_the_Diacom_Reciver_Button_Is_Working_Or_Not() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Dataset Name_dataset'), 'demo1234qaaaa')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset_1'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_New Notification_fa fa-close'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Modality_wrg-toggle-container'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Modality_wrg-toggle-container'))
	}

	@Then("user should have use this feature to annonyize study after upload")
	def user_should_have_use_this_feature_to_annonyize_study_after_upload () {
	}


	@When("Verify When Diacom Receiver Button Is On Ae Title And Port No. Will Shown in front end")
	def Verify_When_Diacom_Receiver_Button_Is_On_Ae_Title_And_Port_No_Will_Shown_in_front_end () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Dataset Name_dataset'), 'Ai123qaa')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Dataset_1'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_New Notification_fa fa-close'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Modality_wrg-toggle-container'))
	}

	@When ("Check Search Is Working For Searching Annotation Template")
	def Check_Search_Is_Working_For_Searching_Annotation_Template() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), 'demo')
	}

	@Then("Search should work for searching annotation")
	def Search_should_work_for_searching_annotation () {
	}

	@When("Check The Minimum Number Of Roi Lable Can Be Used In Annotation Template")
	def Check_The_Minimum_Number_Of_Roi_Lable_Can_Used_In_Annotation_Template () {

		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))


		WebUI.waitForPageLoad(60)
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div'))
		WebUI.waitForPageLoad(90)

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Calcification'))


		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'exromq')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
	}
	@Then("user should be able to use atleast one or no ROI'S")
	def user_should_be_able_to_use_atleast_one_or_no_ROI(){
	}


	@When("Check The Maximum Number Of Roi Lable Can Be Used In Annotation Template")
	def  Check_The_Maximum_Number_Of_Roi_Lable_Can_Be_Used_In_Annotation_Template () {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))


		WebUI.waitForPageLoad(60)
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div'))
		WebUI.waitForPageLoad(90)

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Calcification'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Crazy Paving Pattern'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Ground Glass Opacity'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Mediastinal Widening'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'q123')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
	}

	@When("Check The Hover Message On The Roi Label")
	def  Check_The_Hover_Message_On_The_Roi_Label () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_ROI Labels_fa fa-info-circle'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Form Builder_fa fa-info-circle'))
	}

	@Then("Hower message should be shown to user")
	def Hower_message_should_be_shown_to_user () {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CARPL.ai/i_Form Builder_fa fa-info-circle'),20)
	}


	@When("Check If User Can Put Special Characters In Template Description")

	def Check_If_User_Can_Put_Special_Characters_In_Template_Description () {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.doubleClick(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'read1')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Template Description_formdesc'), 'read!@@@')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
	}

	@Then("User sucessfull Enter special characters")
	def user_Enter_special_characters() {
	}


	@When("Check The Maximum Number Of Characters On Template Description")
	def  Check_The_Maximum_Number_Of_Characters_On_Template_Description () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.doubleClick(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'read1')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Template Description_formdesc'), 'I’m defining it as more than a 100 words. I’ve cheated with a few beautiful sentences a few words short, because there is no sense in having an absolute and arbitrary rule, but more than 100 words was my guiding principle. I think any sentence more than 100 words is almost guaranteed to be complex, complicated, and enormous.')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
	}

	@Then("user should able to add the maximum number of character")
	def user_should_able_to_add_the_maximum_number_of_character () {
	}

	@When("Check User Can Not Create Annoation Template Without Name")

	def Check_User_Can_Not_Create_Annoation_Template_Without_Name() {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.doubleClick(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
	}

	@Then("user can not able fill the annoation template details")
	def user_can_not_able_fill_the_annoation_template_details () {
	}

	@When("Check If User Can Use All Of Those Form Elements")
	def Check_If_User_Can_Use_All_Of_Those_Form_Elements() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Paragraph'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Dropdown'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Checkboxes'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Radio Buttons'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Text Input'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Multi-line Input'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Range'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Matrix Questionnaire'))
	}


	@Then("user select able to select all option form elements")
	def user_select_able_to_select_all_option_form_elements () {
	}

	@When("In Form Element User Can Change The Place Holder Labels")

	def In_Form_Element_User_Can_Edit_Change_The_Place_Holder_Labels () {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Paragraph'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Paragraph_fa fa-edit mr-3 fa_template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/div_dhfah'), 'demo')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))
	}

	@Then("user able to edit or change in place holder label")

	def user_able_to_edit_or_change_in_place_holder_label () {
	}

	@When("Check User Can Make The Text To Bold")

	def Check_User_Can_Make_The_Text_To_Bold () {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'test123')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Paragraph'))


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Paragraph_fa fa-edit mr-3 fa_template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Label_rdw-option-wrapper'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Label_rdw-option-wrapper'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Label_rdw-option-wrapper'))


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/div_dhfah'), 'demo')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))
	}

	@Then("Bold Letter should appear in Paragraph Editor")

	def Bold_Letter_should_appear_in_Paragraph_Editor () {
	}



	@When("Check User Can Make The Text To Underline")

	def Check_User_Can_Make_The_Text_To_Underline () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'qwerww12')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Paragraph'))


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Paragraph_fa fa-edit mr-3 fa_template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Label_rdw-option-wrapper'))



		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Underlinelocator_Annotation'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Underlinelocator_Annotation'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/div_dhfah'), 'demo')
		WebUI.waitForPageLoad(60)
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))
	}

	@Then("underline format will appear in Paragraph Editor")

	def underline_format_will_appear_in_Paragraph_Editor () {
	}
	@When("Check User Can Make The Text To Italic")
	def Chec_User_Can_Make_The_Text_To_Italic () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'qwret123')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Paragraph'))


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Paragraph_fa fa-edit mr-3 fa_template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Label_rdw-option-wrapper'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Italiclocatorforannotationpage'))


		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/div_dhfah'), 'demo')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))
	}

	@Then("Italic format will appear in Paragraph Editor")

	def Italic_format_will_appear_in_Paragraph_Editor () {
	}



	@When("Verify If User Change Text To Superscript, Superscripted Textis Showing On Placeholder")
	def Verify_If_User_Change_Text_To_Superscript_Superscripted_Text_is_Showing_On_Placeholder () {



		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))



		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'demor12345')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Paragraph'))


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Paragraph_fa fa-edit mr-3 fa_template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Label_rdw-option-wrapper'))






		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Superscriptlocator'))
		WebUI.waitForPageLoad(60)
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Superscriptlocator'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Superscriptlocator'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Superscriptlocator'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/div_dhfah'), 'Because many writers abuse long sentences, cramming too many thoughts into each sentence, muddling up their message and leaving readers confused.So, the main trick to composing a beautiful long sentence is to communicate only one idea with clarity.A couple of weeks ago, I read There There by Tommy Orange. The New York Times named it as one of the 10 best novels of 2018. It’s an ambitious novel about identity and about urban life of Native Americans.')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
	}

	@Then("text should appear superscript format")
	def text_should_appear_superscript_format () {
	}


	@When("Verify If User text Subscripted Text Is Reflected On Placeholder")
	def Verify_If_User_text_Subscripted_Text_Is_Reflected_On_Placeholder () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'text345211')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Paragraph'))


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Paragraph_fa fa-edit mr-3 fa_template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Label_rdw-option-wrapper'))

		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Italiclocatorforannotationpage'))




		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Subscript'))
		WebUI.waitForPageLoad(60)


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Label_rdw-option-wrapper'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Label_rdw-option-wrapper'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/div_dhfah'), 'The sentence above describes one scene: how a train emerges in a rough, impoverished city district. The summing up of the graffitied apartment walls, abandoned houses, warehouses, and auto body shops gives you a feel of the overcrowded city life.Note how the sentence starts with its core (the train emerges), then meanders through the rough buildings, and ends with a bang: stubbornly resist like deadweight all of Oakland’s new development.Just like poetry, the start and the end lines of a long sentence are the most important. Here’s an even better example, showing the chaos and power of memories:')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))



	}

	@Then("text should appear subscripted format")
	def text_should_appear_subscripted_format () {
	}


	@When("Verify User Use The Bullet Points It Will Showing On The Placeholder")
	def  Verify_User_Use_The_Bullet_Points_It_Will_Showing_On_The_Placeholder () {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'demor12222345')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Paragraph'))


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Paragraph_fa fa-edit mr-3 fa_template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Label_rdw-option-wrapper'))

		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Italiclocatorforannotationpage'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Bulletpoint'))
		WebUI.waitForPageLoad(90)

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))


	}

	@Then("Bullet point will added in placeholder")
	def Bullet_point_will_added_in_placeholder () {
	}

	@When("Check If User Use Number Points It Will Be Showing On The Place Holder")
	def Check_If_User_Use_Number_Points_It_Will_Be_Showing_On_The_Place_Holder () {



		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))



		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'qwer123')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Paragraph'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Paragraph_fa fa-edit mr-3 fa_template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Label_rdw-option-wrapper'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Numberpoints'))
		WebUI.waitForPageLoad(60)
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
	}


	@Then ("Number points will appear in placeholder textboxes")
	def Number_points_will_appear_in_placeholder_textboxes () {
	}

	@When("Check Right Text Alignment Is Working For The User")
	def Check_Right_Text_Alignment_Is_Working_For_The_User () {


		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'admin123')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Paragraph'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Paragraph_fa fa-edit mr-3 fa_template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/div_dhfah'), 'demo')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/LeftAlignment'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))
	}

	@Then("Text will appear in right side under the place holder page")

	def Text_will_appear_in_right_side_under_the_place_holder_page () {
	}






	@When("Check Center Text Alignment Is Working For The User")
	def Check_Center_Text_Alignment_Is_Working_For_The_User() {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Paragraph'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Paragraph_fa fa-edit mr-3 fa_template'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'carplai')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/div_dhfah'), 'demo')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/CenterAlignment'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
	}

	@Then("Text will appear in Center under the place holder page")
	def Text_will_appear_in_Center_under_the_place_holder_page () {
	}

	@When("Check Left Text Alignment Is Working For The User")
	def Check_Left_Text_Alignmen_Is_Working_For_The_User () {


		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'Accenture')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Paragraph'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Paragraph_fa fa-edit mr-3 fa_template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/div_dhfah'), 'demo')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/LeftAlignment'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))
	}

	@Then("Text will appear in Left Alignemnt under the place holder page")
	def Text_will_appear_in_Left_Alignemnt_under_the_place_holder_page () {
	}


	@When("Check The Justify Allignment Is Working For The User")
	def Check_The_Justify_Allignment_Is_Working_For_The_User () {


		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'wipro')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Paragraph'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Paragraph_fa fa-edit mr-3 fa_template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/div_dhfah'), 'demo')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Justify'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
	}

	@Then("Text will appear in Justify Alignemnt under the place holder page")
	def Text_will_appear_in_Justify_Alignemnt_under_the_place_holder_page () {
	}

	@When("Check The Font Size Is Working For The User")

	def Check_The_Font_Size_Is_Working_For_The_User () {



		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'drdo')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Paragraph'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Paragraph_fa fa-edit mr-3 fa_template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/click_dropdownParagarph'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Click_calendradate'))




		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/div_dhfah'), 'demo')




		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
	}

	@Then("it should be select font size under place holder page")

	def it_should_be_select_fon_size_unde_place_holder_page () {
	}

	@When("Verify User Use The Undo The Last Writing Task Can Be Undo")

	def Verify_User_Use_The_Undo_The_Last_Writing_Task_Can_Be_Undo () {


		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'cisive')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Paragraph'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Paragraph_fa fa-edit mr-3 fa_template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/div_dhfah'),'demo')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Undo_button'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Redo_button'))
	}

	@Then("It successfull redo and undo in place holder page")
	def It_successfull_redo_and_undo_in_place_holder_page () {
	}


	@When("Check User Can Copy The Element")

	def Check_User_Can_Copy_The_Element () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Create Template_three-dots'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Copy Template'))

	}

	@Then("Copy the element successfully")

	def Copy_the_element_successfully () {
	}


	@When("Check If User Can Delete the annotation templates")
	def Check_If_User_Can_Delete_the_annotation_templates () {


		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Create Template_three-dots'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Delete_templateAnnotation'))

	}

	@Then("user delete the annotation templates")
	def user_delete_the_annotation_templates () {
	}

	@When("Check User Can Use The Dropdown Element")
	def Check_User_Can_Use_The_Dropdown_Element () {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Dropdown'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Dropdown_fa fa-edit mr-3 fa_template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Dropdown_fa fa-edit mr-3 fa_template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Add Option'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Add Option'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Options_form-control'), 'demo')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'temp')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
	}

	@Then("Dropdown Element should added in Dropdown Editor page")

	def Dropdown_Element_should_added_in_Dropdown_Editor_page() {
	}

	@When("In Dropdown Element Check User Can Edit The Options")

	def In_Dropdown_Element_Check_User_Can_Edit_The_Options ()  {
	}


	@Then("user can edit the option in editor page")

	def user_can_edit_the_option_in_editor_page () {
	}

	@When("Check The Minimum Number Of Option Can Be Used In Dropdown")
	def Check_The_Minimum_Number_Of_Option_Can_Be_Used_In_Dropdown () {



		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Dropdown'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Dropdown_fa fa-edit mr-3 fa_template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Add Option'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Options_btn btn-danger'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Options_btn btn-danger'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'rex')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
	}

	@Then("Minimum number option should be removed from option editor")

	def  Minimum_number_option_should_be_removed_from_option_editor () {
	}



	@When("Check If User Can Delete The Dropdown Element")

	def Check_If_User_Can_Delete_The_Dropdown_Element () {
	}

	@Then("User should delete the dropdown from Dropdown Editor")
	def User_should_delete_the_dropdown_from_Dropdown_Editor() {
	}

	@When("Check User Can Use The Checkboxes Element")
	def Check_User_Can_Use_The_Checkboxes_Element () {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/li_Dropdown'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Dropdown_fa fa-edit mr-3 fa_template'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Options_form-control'), 'test1')


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))



		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/select_SelectSelecttest1Option2test2test3'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Dropdown_value'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'Samsung')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
	}


	@Then("checkboxes Element should be selected under the place holder page")

	def checkboxes_Element_should_be_selected_under_the_place_holder_page () {


		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Click_CheckboxesinAnnotationpage'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Dropdown_fa fa-edit mr-3 fa_template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Add Option'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Add Option'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Options_form-control'), 'demo')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))

		WebUI.click(findTestObject("Object Repository/Page_CARPL.ai/Select_checkboxAnnotationpage"))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'Apple')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
	}


	@When("Check User Can Use The Radio Buttons Element")
	def Check_User_Can_Use_The_Radio_Buttons_Element() {


		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Radiobutton_Annotationpage'))


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Dropdown_fa fa-edit mr-3 fa_template'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Requierd_buttonRadioButton'))


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Add Option'))


		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/Radiobuttonnametextboxes'), 'demo')
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/Value_textboxesAnnotationpage'), 'demo')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Radiobutton_anntotationpage'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'Hatchi')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
	}

	@Then("radio options will appear in annotation template page")

	def radio_options_will_appear_in_annotation_template_page () {
	}

	@When("Check The Minimum Number Of Option Can Be Used In Radio Buttons")
	def Check_The_Minimum_Number_Of_Option_Can_Be_Used_In_Radio_Buttons () {





		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Radiobutton_Annotationpage'))


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Dropdown_fa fa-edit mr-3 fa_template'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Add Option'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Options_btn btn-danger'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Radiobutton_anntotationpage'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'china')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
	}


	@Then("Radio button option should remove from Annotation templates")
	def Radio_button_option_should_remove_from_Annotation_templates () {
	}


	@When("Check If User Can Delete The Checkbox Element")

	def Check_If_User_Can_Delete_The_Checkbox_Element () {


		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Click_CheckboxesinAnnotationpage'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/DeleteIcon_Annotationpage'))


		//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))


	}


	@Then("Annotation template should be empty")
	def Annotation_template_should_be_empty () {
	}

	@When("Check User Can Use The Text Input Element")
	def Check_User_Can_Use_The_Text_Input_Elemnet () {


		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))



		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Clickin_TextInput_underAnnotationpage'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Dropdown_fa fa-edit mr-3 fa_template'))



		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/div_dhfah'),'demo')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Requierd_buttonRadioButton'))


		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'Complex')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
	}


	@Then("All Details should be appear in Text Input")
	def All_Details_should_be_appear_in_Text_Input () {
	}


	@When("Check The Maximum Number Of Options Can Be Used In Text Input")
	def Check_The_Maximum_Number_Of_Options_Can_Be_Used_In_Text_Input() {

		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Clickin_TextInput_underAnnotationpage'))



		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Clickin_TextInput_underAnnotationpage'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Clickin_TextInput_underAnnotationpage'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Clickin_TextInput_underAnnotationpage'))
	}


	@Then("Maximum number text input should appear in template annotation page")
	def Maximum_number_text_input_should_appear_in_template_annotation_page () {
	}


	@When("Check The Minimum Number Of Option Can Be Used In Text Input")
	def Check_The_Minimum_Number_Of_option_Can_Be_Used_In_Text_Input () {



		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Clickin_TextInput_underAnnotationpage'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Clickin_TextInput_underAnnotationpage'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/DeleteIcon_Annotationpage'))
	}



	@Then("Minimum number text input should appear in template annotation page")
	def Minimum_number_text_input_should_appear_in_template_annotation_page () {
	}


	@When("Check User Can Use The Multi Line Input Element")
	def Check_User_Can_Use_The_Multi_Line_Input_Element() {


		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/MultilineInput'))


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Dropdown_fa fa-edit mr-3 fa_template'))


		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/div_dhfah'),'demo')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Requierd_buttonRadioButton'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))



		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'Xray')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
	}

	@Then("Multi line input should appear in template annotation page")
	def  Multi_line_input_should_appear_in_template_annotation_page () {
	}


	@When("In Muti Line Input Element Check User Can Edit The Options")
	def In_Muti_Line_Input_Element_Check_User_Can_Edit_The_Options () {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://dev.carpl.ai/')
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/MultilineInput'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Dropdown_fa fa-edit mr-3 fa_template'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/div_dhfah'),'demo')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Requierd_buttonRadioButton'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'flipkart')
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/TextareaMultiline'), 'flipkart')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
	}


	@Then("it should relfect in Template annotation page")
	def  it_should_relfect_in_Template_annotation_page () {
	}


	@When("Check The Maximum Number Of Options Can Be Used In Multi Line Input")
	def Check_The_Maximum_Number_Of_Options_Can_Be_Used_In_Multi_Line_Input () {


		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/MultilineInput'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/MultilineInput'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/MultilineInput'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/MultilineInput'))
	}


	@Then("Maximum number of Multi line input text should be relfect")

	def Maximum_number_of_Multi_line_input_text_should_be_relfect () {
	}

	@When("Check The Minimum No. Of Option Can Be Used In Multi Line Input")

	def Check_The_Minimum_Number_Of_Option_Can_Be_Used_In_Muti_Line_Input () {


		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/MultilineInput'))
	}


	@Then("Minimum number of Multi line input text should be relfect")

	def Minimum_number_of_Multi_line_input_text_should_be_relfect () {
	}
	@When("Check If User Can Delete The Multi Line Input Element")

	def Check_If_User_Can_Delete_The_Multi_Line_Input_Element () {

		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://dev.carpl.ai/')

		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/MultilineInput'))

		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/DeleteIcon_Annotationpage'))
	}

	@Then("Empty list will be appear in annotation template")
	def Empty_list_will_be_appear_in_annotation_template(){
	}
	
	
	@When("Check User Can Use The Range Element")
	def Check_User_Can_Use_The_Range_Element () {
		
		
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://dev.carpl.ai/')
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Rangetextboxes'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Dropdown_fa fa-edit mr-3 fa_template'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/div_dhfah'),'demo')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Requierd_buttonRadioButton'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/MinRangeoption'),'1')
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/MaxRangeoption'),'50')
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/StepsRangeoption'),'99')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'fracture')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
		
	}
	
	
	@Then("User can edit Range Element under Annotation Template page")
	
	def User_can_edit_Range_Element_under_Annotation_Template_page () {
		
	}
	
	@When("Check The Maximum Range A User Can Set")
	def Check_The_Maximum_Range_A_User_Can_Set () {
		
		
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://dev.carpl.ai/')
		
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Rangetextboxes'))
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Dropdown_fa fa-edit mr-3 fa_template'))
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		
		
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/div_dhfah'),'demo')
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Requierd_buttonRadioButton'))
		
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/MinRangeoption'),'1')
		
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/MaxRangeoption'),'50')
		
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/StepsRangeoption'),'10000')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))
		
		
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'hand fracture')
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
		
	}
	
	
	@Then("Maximum range should added in Label page")
	
	def Maximum_range_should_added_in_Label_page () {
		
	}
	
	@When("Check The Minimum Number Of Step A User Can Set")
	
	def Check_The_Minimum_Number_Of_Step_A_User_Can_Set () {
		
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://dev.carpl.ai/')
		
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Rangetextboxes'))
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Dropdown_fa fa-edit mr-3 fa_template'))
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Placeholder Label_public-DraftStyleDefa_c857fa'))
		
		
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/div_dhfah'),'demo')
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Requierd_buttonRadioButton'))
		
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/MinRangeoption'),'1')
		
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/MaxRangeoption'),'50')
		
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/StepsRangeoption'),'0')
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Done'))
		
		
		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'Leg fracture')
		
		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))
			
	}
	
	@Then("Minimum number of step in range Editor")
	
	def Minimum_number_of_step_in_range_Editor () { 
		
		
	}
	
	
	
}



