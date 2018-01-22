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

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Payments/Common Payments Objects/mnu_PaymentsDropdownMenu'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Payments/Refund/mnu_Refund'))

WebUI.delay(2)

WebUI.click(findTestObject('Payments/Refund/Customer Approval Refunds/lnk_Approve Customer Refunds'))

WebUI.delay(2)

WebUI.click(findTestObject('Payments/Refund/Customer Approval Refunds/lnk_Approve', [('receiptNo') : receiptNo]))

WebUI.comment('filling  in the refund form')

if (approvalStatus == '') {
    WebUI.click(findTestObject('Payments/Refund/Customer Approval Refunds/btn_save'))

    WebUI.verifyElementPresent(findTestObject('Payments/Refund/Customer Approval Refunds/Errmsg_approvalStatus'), 0)
} else {
}

WebUI.click(findTestObject('Payments/Refund/Customer Approval Refunds/drpdwn approvalstatus'))

WebUI.delay(2)

WebUI.click(findTestObject('Payments/Refund/Customer Approval Refunds/aprrovalstatus'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Payments/Refund/Customer Approval Refunds/txt_notes'), notes)

not_run: WebUI.click(findTestObject('Payments/Refund/Customer Approval Refunds/btn_save'))

WebUI.verifyElementPresent(findTestObject('Payments/Refund/Customer Approval Refunds/msg_ReundDetails'), 2)

