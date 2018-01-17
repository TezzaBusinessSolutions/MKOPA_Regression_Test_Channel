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

WebUI.setText(findTestObject('Customers/Customers List/txt_SearchCustomer'), Account)

WebUI.click(findTestObject('Customers/Customers List/btn_search'))

WebUI.getText(findTestObject('Customers/Customers List/Credits'))

WebUI.delay(2)

WebUI.comment('uploading payment to customer')

WebUI.callTestCase(findTestCase('File Upload Center/Common/TC-UploadPaymentFile'), [('mpesaPayment') : findTestData('File Upload Center/File Upload Payment').getValue(
            1, 1), ('comment') : findTestData('File Upload Center/File Upload Payment').getValue(2, 1), ('tagged') : ''], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Customers/Customers List/btn_Close'))

WebUI.comment('verifying increment of sent credits')

WebUI.setText(findTestObject('Customers/Customers List/txt_SearchCustomer'), Account)

WebUI.click(findTestObject('Customers/Customers List/btn_search'))

WebUI.verifyElementText(findTestObject('Customers/Customers List/Credits'), Credits)

