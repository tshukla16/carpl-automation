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



//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://dev.carpl.ai/')
//
//WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Project'))
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Project'))
//
//WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Project Name_form-control'), 'rest')
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select'))
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_fabes  sudocarpl.ai'))
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/ButtonNextAnotationpage'))
//
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Next'))
//
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select'))
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/dropdownvalue_annotation'))
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_fuzzy  sudocarpl.ai'))
//
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Next'))
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Button_nextAnnotationpage'))
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Button_CreateAnnotationProjects1'))
//
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Annotation Project'))
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Unassigned_carpl_checkbox'))
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Click_AssginAnnotation'))
//WebUI.waitForPageLoad(60)
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_t34868406-9841-41bc-aa1d-5f1dd358853b    _9b6f6a'))
//
//WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_AssignAnnotator_email'), 'anupam.sachan@carpl.ai')
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Add Annotator'))
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Assign Annotator'))
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/img_Assign Annotation_img-fluid rounded-cir_b74cff'))
//
//WebUI.refresh()
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Unassigned_carpl_checkbox'))
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Click_AssginAnnotation'))
//WebUI.waitForPageLoad(60)
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_t34868406-9841-41bc-aa1d-5f1dd358853b    _9b6f6a'))
//
//WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_AssignAnnotator_email'), 'tanay.shukla@carpl.ai')
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Add Annotator'))
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Assign Annotator'))
//
//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/img_Assign Annotation_img-fluid rounded-cir_b74cff'))
//


WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.carpl.ai/')

WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'sudo@carpl.ai')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'GbQ7aaLRPnzYPozY5hlVuQ==')

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Template'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Template'))
		
WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Radiobutton_Annotationpage'))
		
WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input__formname'), 'china')

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Save Template'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Project'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Project'))

WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Project Name_form-control'), 'rest')

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_fabes  sudocarpl.ai'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/ButtonNextAnotationpage'))

//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Next'))

//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_Select'))
WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/dropdownvalue_annotation'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/div_fuzzy  sudocarpl.ai'))

//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Button_nextAnnotationpage'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Button_CreateAnnotationProjects1'))

//WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Create Annotation Project'))

WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Unassigned_carpl_checkbox'))



		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Click_AssginAnnotation'))
//		WebUI.waitForPageLoad(60)
//
//		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_t34868406-9841-41bc-aa1d-5f1dd358853b    _9b6f6a'))
//
//		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_AssignAnnotator_email'), 'anupam.sachan@carpl.ai')
//
//		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Add Annotator'))
//
//		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Assign Annotator'))
//
//		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/img_Assign Annotation_img-fluid rounded-cir_b74cff'))
//
//		WebUI.refresh()
//		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/span_Unassigned_carpl_checkbox'))
//
//		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Click_AssginAnnotation'))
//		WebUI.waitForPageLoad(60)
//
//		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_t34868406-9841-41bc-aa1d-5f1dd358853b    _9b6f6a'))
//
//		WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_AssignAnnotator_email'), 'tanay.shukla@carpl.ai')
//
//		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Add Annotator'))
//
//		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Assign Annotator'))
//
//		WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/img_Assign Annotation_img-fluid rounded-cir_b74cff'))
//		
//        WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/selectuser_dropdown'))
//		
//		
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Click_AssginAnnotation'))
////WebUI.waitForPageLoad(60)
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/i_t34868406-9841-41bc-aa1d-5f1dd358853b    _9b6f6a'))
////
////WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_AssignAnnotator_email'), 'anupam.sachan@carpl.ai')
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Add Annotator'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Assign Annotator'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Notificationcancel'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/img_Assign Annotation_img-fluid rounded-cir_b74cff'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Logout'))
////
////WebUI.setText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_email'), 'anupam.sachan@carpl.ai')
////
////WebUI.setEncryptedText(findTestObject('Object Repository/Page_CARPL.ai/input_Login in to_password'), 'PLGTm/4mhzCFv1nCPynrvg==')
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_LOG IN'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/a_Annotation Project'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Annotate'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/button_Annotate Study'))
////
////WebUI.switchToWindowTitle('CARPL Viewer')
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/div_Angle Double Down'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////	
////	WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////
////
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////
////
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////
////
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////
////
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////
////
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////
////
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////
////
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////
////
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////
////
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////WebUI.click(findTestObject('Object Repository/Page_CARPL.ai/Yes_Radiobutton'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Save and Mark Complete'))
////
////WebUI.click(findTestObject('Object Repository/Page_CARPL Viewer/button_Yes'))
////
////
