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

WebUI.click(findTestObject('Payments/Dealer Commission Generated/Menu-CustomerMenuBar'))

WebUI.click(findTestObject('Payments/Dealer Commission Generated/SubMenu-ListOfCustomer'))

WebUI.delay(10)

'Select a customer on the {In Payment } status'
WebUI.click(findTestObject('Payments/Validate Submit Button Is Working On Request Refund/Select Customer On List Of Customers', 
        [('Refno') : CustomerRef]))

WebUI.click(findTestObject('Payments/Validate Submit Button Is Working On Request Refund/Button More Payment Info'))

WebUI.delay(5)

'Put a recipt number with enough amount for refund'
WebUI.click(findTestObject('Payments/Validate Submit Button Is Working On Request Refund/Select Recipt Number To be Refunded'))

WebUI.click(findTestObject('Payments/Validate Submit Button Is Working On Request Refund/Refund Payment Button'))

WebUI.setText(findTestObject('Payments/Validate Submit Button Is Working On Request Refund/InPut Box For Amount To Be Refunded'), 
    '2000')

WebUI.setText(findTestObject('Payments/Validate Submit Button Is Working On Request Refund/Notes For Refund'), 'Testing for an over refund than the maximum refund')

WebUI.click(findTestObject('Payments/Validate Submit Button Is Working On Request Refund/Submit Button'))

not_run: WebUI.delay(5)

WebUI.setText(findTestObject('Payments/Validate Submit Button Is Working On Request Refund/InPut Box For Amount To Be Refunded'), 
    '100')

WebUI.setText(findTestObject('Payments/Validate Submit Button Is Working On Request Refund/Notes For Refund'), 'Refund made due to over payment')

WebUI.click(findTestObject('Payments/Validate Submit Button Is Working On Request Refund/Submit Button'))

