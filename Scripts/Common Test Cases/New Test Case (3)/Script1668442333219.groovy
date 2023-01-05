import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')
WebUI.navigateToUrl('https://accounts.google.com/v3/signin/identifier?dsh=S2080782870%3A1668433658114427&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=ARgdvAu1ae0YuUduDzRIgCtv4WbYOUPFvhfVkHrxUQNUp7vHEeaWMn5xIbXkz69eVwboZ7OWhcx4')

WebUI.setText(findTestObject('Object Repository/Page_Gmail/input_to continue to Gmail_identifier'), '34shukla@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Gmail/input_Too many failed attempts_Passwd'), 'd4oEhXEFz5hSrM9Tll3dHg==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Gmail/input_Too many failed attempts_Passwd'), Keys.chord(Keys.ENTER))


WebUI.click(findTestObject('Object Repository/Page_Inbox (1) - 34shuklagmail.com - Gmail/div_info 2'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/h2_Activate your account'))

