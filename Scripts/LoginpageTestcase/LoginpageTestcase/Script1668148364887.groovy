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

WebUI.navigateToUrl('https://uatv2.carpl.ai/')

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/form_Login in to CARPL Enter UsernameLOG IN_8eda57'))

WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Algorithms'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Add Algorithm'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/input_Name_form-control'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/input_Name_form-control'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/input_Findings_findings'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Next'))

