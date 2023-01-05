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

WebUI.navigateToUrl('https://dev.carpl.ai/')

WebUI.setText(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/input_Login in to_email'),
	'automation.testing@carpl.ai')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/input_Login in to_password'),
	'+47ROO6XJ3vl2Lg59yjZ6Q==')

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Dataset Manager'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_My Datasets'))

WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Search_form-control'), 'demo13')

WebUI.click(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/button_View Dataset'))

WebUI.click(findTestObject('Object Repository/Page_Activate your account. - 34shuklagmail_7dbbb1/Page_CARPL.ai/span_Instances_carpl_checkbox'))

//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Show 255075100EntriesShowing 1 to 1 of _6358e3'))

//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Instances_carpl_checkbox'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_Upload Dataset_icon_box delete'))

//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_wqaTotal Studies 0Modality Dicom Receiv_d189d8'))