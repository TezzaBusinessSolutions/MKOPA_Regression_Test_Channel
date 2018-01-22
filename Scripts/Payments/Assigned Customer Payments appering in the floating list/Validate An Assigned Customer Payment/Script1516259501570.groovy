import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Common/Login'), [('Email') : '', ('Password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Payments/Assinging Floating Payer Payment/Menu-Payments'))

WebUI.click(findTestObject('Payments/Assigned Customer Payments appering in the floating list/Submenu_Payment Exceptions'))

WebUI.click(findTestObject('Payments/Assigned Customer Payments appering in the floating list/SubMenu_Menu_Unmatched Payments'))

WebUI.delay(5)

 -not_run: WebUI.click(findTestObject('Payments/Assinging Floating Payer Payment/Menu-Payments'))		
 		
not_run: WebUI.click(findTestObject('Payments/Assinging Floating Payer Payment/SubMenu-CustomerPayments'))		
		
not_run: WebUI.click(findTestObject('Payments/Assinging Floating Payer Payment/Submenu-Menu-Floating Payments'))		
		
not_run: WebUI.delay(5)		
		
not_run: WebUI.click(findTestObject('Payments/Assinging Floating Payer Payment/Menu-Payments'))		
		
not_run: WebUI.click(findTestObject('Payments/Assigned Customer Payments appering in the floating list/Submenu_Payment Exceptions'))		
		
not_run: WebUI.click(findTestObject('Payments/Assigned Customer Payments appering in the floating list/SubMenu_Menu_Unmatched Payments'))		
	
not_run: WebUI.delay(5)		

'After the test case has run change the customer ID for the next customer\r\n'
WebUI.click(findTestObject('Payments/Assigned Customer Payments appering in the floating list/Select_Customer_From_List_Of_Unmatched', 
        [('Refno') : refvar]))

WebUI.click(findTestObject('Payments/Assigned Customer Payments appering in the floating list/Button-Resolve Button'))

WebUI.verifyTextPresent('Please select a valid payer', false)

WebUI.verifyTextPresent('Please select a valid product account', false)

WebUI.delay(5)

WebUI.click(findTestObject('Payments/Assigned Customer Payments appering in the floating list/SelectingOnReferenceDropDown'))

WebUI.delay(2)

WebUI.setMaskedText(findTestObject('Payments/Assigned Customer Payments appering in the floating list/Inputbox-Customer Reference'), 
    '237516781')

WebUI.delay(2)

WebUI.click(findTestObject('Payments/Assigned Customer Payments appering in the floating list/Dropdown To Select Product Account'))

WebUI.delay(3)

WebUI.click(findTestObject('Payments/Assigned Customer Payments appering in the floating list/Dropdown To Select Product Account'))

WebUI.doubleClick(findTestObject('Payments/Assinging Floating Payer Payment/SelectingProductAccount'))

WebUI.sendKeys(findTestObject('Payments/Assigned Customer Payments appering in the floating list/Input_Comment'), 'Resolving Unmatched Payment')

WebUI.click(findTestObject('Payments/Assigned Customer Payments appering in the floating list/Button-Resolve Button'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Payments/Assigned Customer Payments appering in the floating list/Success message for resolve'), 
    0)

WebUI.click(findTestObject('Payments/Assinging Floating Payer Payment/Menu-Payments'))

WebUI.click(findTestObject('Payments/Assigned Customer Payments appering in the floating list/Submenu_Payment Exceptions'))

WebUI.click(findTestObject('Payments/Assigned Customer Payments appering in the floating list/SubMenu_Menu_Unmatched Payments'))

WebUI.verifyTextNotPresent(refvar, false)

