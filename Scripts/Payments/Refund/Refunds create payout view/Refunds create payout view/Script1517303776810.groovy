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

WebUI.callTestCase(findTestCase('File Upload Center/Common/UploadPaymentFile'), [('filePath') : 'C:\\Users\\Ruth.Siyoi\\git\\MKOPA_Regression_Test_Channel\\FilesToUpload\\payments.csv'
        , ('comment') : 'Am a Keyword Guru', ('tagged') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/Login'), [('Email') : '', ('Password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.setText(findTestObject('Customers/Common/Search Customer', [('customer') : customer]), customer)

WebUI.click(findTestObject('Customers/Common/Search Icon'))

WebUI.delay(5)

WebUI.click(findTestObject('Customers/List Customers/img_MorePaymentInformation'))

WebUI.click(findTestObject('Payments/Refund/Refunds view payout page/link_paymentreceipt', [('depositReceipt') : depositReceipt]))

WebUI.verifyElementPresent(findTestObject('Payments/Refund/Refunds view payout page/button_refundpayment'), 0)

WebUI.verifyElementPresent(findTestObject('Payments/Refund/Refunds view payout page/button_Transfer Payment'), 0)

WebUI.callTestCase(findTestCase('Payments/Refund/Refunds create payout view/step_PaymentDetailsInformation'), [('amount') : '50'
        , ('notes') : 'Test'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/MarkerCheckerLogin'), [('Email') : findTestData('MarkerCheckerLogin/CheckerLogin').getValue(
            1, 1), ('Password') : findTestData('MarkerCheckerLogin/CheckerLogin').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Payments/Common Payments Objects/mnu_PaymentsDropdownMenu'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Payments/Refund/menu_Refund'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Payments/Refund/Refunds view payout page/menu_approvecustomerrefund'), 0)

WebUI.click(findTestObject('Payments/Refund/Refunds view payout page/menu_approvecustomerrefund'))

WebUI.click(findTestObject('Payments/Refund/Refunds view payout page/link_approverefunds', [('ApproveNumber') : ApproveNumber]))

WebUI.verifyElementVisible(findTestObject('Payments/Refund/Refunds view payout page/grid_approverefundpage'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Payments/Refund/Customer Approval Refunds/drpdwn approvalstatus'))

WebUI.click(findTestObject('Payments/Refund/Customer Approval Refunds/aprrovalstatus'))

WebUI.setText(findTestObject('Payments/Refund/Refunds view payout page/text_refundapprovernotes', [('notes') : notes]), 
    'Test')

WebUI.click(findTestObject('Payments/Refund/Refunds view payout page/button_save'))

WebUI.verifyElementVisible(findTestObject('Payments/Refund/Refunds view payout page/grid_refunddetailspage'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Payments/Common Payments Objects/mnu_PaymentsDropdownMenu'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Payments/Payouts/Payouts'))

WebUI.delay(3)

WebUI.click(findTestObject('Payments/Refund/Refunds view payout page/menu_productrefund'))

verify = WebUI.getText(findTestObject('Payments/Refund/Refunds view payout page/grid_productrefundscreatepayout'), FailureHandling.STOP_ON_FAILURE)

System.out.println(verify)

WebUI.closeBrowser()

