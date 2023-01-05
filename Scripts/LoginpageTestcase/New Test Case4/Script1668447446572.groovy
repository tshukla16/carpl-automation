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

WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))


WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Project'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Project'))

WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Project Name_form-control'), 'demo70')

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_china  sudocarpl.ai'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/ButtonNextAnotationpage'))
//
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_BackNext'))
//
WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/dropdownvalue_annotation'))
//
WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_2k XRAYS  sudocarpl.ai'))
//
WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Button_nextAnnotationpage'))
//
WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Annotation Project'))
//
WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Unassigned_carpl_checkbox'))
//
WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Click_AssginAnnotation'))
WebUI.waitForPageLoad(60)
//WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_AssignAnnotator_email'), 'sudo@carpl.ai')
WebUI.waitForPageLoad(60)
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Click_Addannotatorbutton'))
//
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/AssginAnnotatorbutton'))


//WebUI.refresh()



WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.carpl.ai/')

WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))
WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))
WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Project'))
WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Click_Annotate_button'))
WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/AnnotateStudy'))



//WebUI.openBrowser('')

//WebUI.navigateToUrl('https://dev.carpl.ai/')
//
//WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'anupam.sachan@carpl.ai')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'PLGTm/4mhzCFv1nCPynrvg==')
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))
//
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Project'))
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Click_Annotate_button'))
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/AnnotateStudy'))
//
