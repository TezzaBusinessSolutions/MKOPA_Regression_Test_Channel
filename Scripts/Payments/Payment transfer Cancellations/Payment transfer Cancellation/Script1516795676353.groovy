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

WebUI.callTestCase(findTestCase('Common/MarkerCheckerLogin'), [('Email') : findTestData('MarkerCheckerLogin/CheckerLogin').getValue(
            1, 1), ('Password') : findTestData('MarkerCheckerLogin/CheckerLogin').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Payments/Common Payments Objects/mnu_PaymentsDropdownMenu'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Payments/Payments Exceptions/mnu_PaymentsExceptions'))

WebUI.delay(2)

WebUI.click(findTestObject('Payments/Payments Exceptions/Payments Transfer for Approval/mnu_PaymentsTransfersForApproval'))

WebUI.click(findTestObject('Payments/Payment transfer Cancellation/lnk_approve transfer '))

WebUI.verifyElementVisible(findTestObject('Payments/Payment transfer Cancellation/txt_approve payment transfer'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Payments/Payment transfer Cancellation/btn_save(approve transfer)'))

WebUI.delay(5)

WebUI.verifyAlertPresent(0)

WebUI.delay(5)

WebUI.acceptAlert()

WebUI.delay(5)

WebUI.setText(findTestObject('Payments/Payment transfer Cancellation/txt-Comment'), 'Test')

WebUI.click(findTestObject('Payments/Payment transfer Cancellation/btn_save(approve transfer)'))

WebUI.verifyAlertPresent(0)

WebUI.acceptAlert()

