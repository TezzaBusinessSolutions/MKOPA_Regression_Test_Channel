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

WebUI.setText(findTestObject('Customers/Customers List/txt_SearchCustomer'), customer_Account)

WebUI.click(findTestObject('Customers/Customers List/btn_search'))

WebUI.getText(findTestObject('Customers/Customers List/Customer info/Status'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Making a payment transfar request')

WebUI.click(findTestObject('Customers/Customers List/Customer info/lnk_Payment Tab'))

WebUI.click(findTestObject('Customers/Customers List/Customer info/lk_ReccieptNumber', [('recieptNo') : recieptNo]))

WebUI.click(findTestObject('Customers/Customers List/Customer info/lnk_TransferPayment'))

WebUI.check(findTestObject('Customers/Customers List/Customer info/chk_payer'))

WebUI.sendKeys(findTestObject('Customers/Customers List/Customer info/txt_CustomerReference'), payer_Account)

WebUI.delay(3)

WebUI.setText(findTestObject('Customers/Customers List/Customer info/txt_comments'), comments)

WebUI.delay(2)

WebUI.click(findTestObject('Customers/Customers List/Customer info/drpdwn_customereference'))

WebUI.click(findTestObject('Customers/Customers List/Customer info/refNumber'))

WebUI.delay(3)

WebUI.click(findTestObject('Customers/Customers List/Customer info/drpdwn_productsAccount'))

WebUI.delay(2)

WebUI.click(findTestObject('Customers/Customers List/Customer info/drpdwn_productsAccount'))

WebUI.doubleClick(findTestObject('Customers/Customers List/Customer info/productAccount'))

WebUI.click(findTestObject('Customers/Customers List/Customer info/btn_Save'))

WebUI.verifyElementPresent(findTestObject('Customers/Customers List/Customer info/msg_transferSuccessful'), 2)

WebUI.click(findTestObject('Customers/Customers List/btn_Close'))

