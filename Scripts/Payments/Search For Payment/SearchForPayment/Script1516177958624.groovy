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

WebUI.click(findTestObject('Payments/Search For Payment/Payments'))

WebUI.click(findTestObject('Payments/Search For Payment/mnu_SearchForPayment'))

WebUI.setText(findTestObject('Payments/Search For Payment/txt_ReceiptNumber'), receiptNumber)

WebUI.setText(findTestObject('Payments/Search For Payment/txt_PaymentPhone'), phoneNumber)

WebUI.setText(findTestObject('Payments/Search For Payment/txt_PaymentDate'), '2017-03-10')

WebUI.click(findTestObject('Payments/Search For Payment/btn_SubmitButton'))



int totalRecords=15;
String pickAccount(totalRecords) {
	Random random=new Random()
	int randomRowId = 1 + random.nextInt(totalRecords); // Random integer between 1 and totalRecords (both inclusive).
	//testRunner.testCase.setPropertyValue('departureAirportId', DataTable[randomRowId][0]);

}

