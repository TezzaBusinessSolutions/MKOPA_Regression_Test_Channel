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

WebUI.mouseOver(findTestObject('Payments/Common Payments Objects/mnu_PaymentsDropdownMenu'))

WebUI.mouseOver(findTestObject('Payments/Customer Payments/Floating Payments/mnu_CustomerPaymentsSubMenu'))

WebUI.click(findTestObject('Payments/Customer Payments/Floating Payments/mnu_FloatingPaymentsMenu'))

WebUI.getText(findTestObject('Payments/Customer Payments/Floating Payments/lnk_FloatingPayerPayment'))

WebUI.verifyTextPresent('LKE4700S22', false)

WebUI.mouseOver(findTestObject('Payments/Common Payments Objects/mnu_PaymentsDropdownMenu'))

WebUI.click(findTestObject('Payments/Search For Payment/mnu_SearchForPayment'))

WebUI.setText(findTestObject('Payments/Search For Payment/txt_ReceiptNumber'), receiptNumber)

WebUI.setText(findTestObject('Payments/Search For Payment/txt_PaymentPhone'), phoneNumber)

WebUI.setText(findTestObject('Payments/Search For Payment/txt_PaymentDate'), paymentDate)

WebUI.click(findTestObject('Payments/Search For Payment/btn_SubmitButton'))

WebUI.callTestCase(findTestCase('Common/LogOut'), [:], FailureHandling.STOP_ON_FAILURE)

