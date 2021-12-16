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

WebUI.callTestCase(findTestCase('File Upload Center/Common/TC-UploadPaymentFile'), [('mpesaPayment') : findTestData('File Upload Center/File Upload Payment').getValue(
            1, 1), ('comment') : findTestData('File Upload Center/File Upload Payment').getValue(2, 1), ('tag') : findTestData(
            'File Upload Center/File Upload Payment').getValue(3, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Payments/Confirmation Sms On Payment/close pop up'))

WebUI.setText(findTestObject('Payments/Confirmation Sms On Payment/Text input Search_Bar'), '20114119')

WebUI.click(findTestObject('Payments/Confirmation Sms On Payment/Click Search bar'))

WebUI.delay(20)

WebUI.click(findTestObject('Payments/Confirmation Sms On Payment/Click Radio button'))

WebUI.delay(10)

WebUI.click(findTestObject('Payments/Confirmation Sms On Payment/Click SMS grid'))

