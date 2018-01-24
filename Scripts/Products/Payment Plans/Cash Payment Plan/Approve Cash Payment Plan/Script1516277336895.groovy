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

WebUI.callTestCase(findTestCase('Products/Payment Plans/Cash Payment Plan/Add Cash Payment Plan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/LogOut'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/MarkerCheckerLogin'), [('Email') : findTestData('MarkerCheckerLogin/CheckerLogin').getValue(
            1, 1), ('Password') : findTestData('MarkerCheckerLogin/CheckerLogin').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Products/Payment Plans/common/mnuProductMenu'))

WebUI.mouseOver(findTestObject('Products/Payment Plans/common/mnu_PaymentPlans'))

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Disapproveloanpaymentplan/mnu_PaymentPlansApprovals'))

WebUI.verifyElementPresent(findTestObject('Products/Payment Plans/Loan Payment Plan/Disapproveloanpaymentplan/grd_PaymentPlansApprovalsPage'), 
    0)

WebUI.click(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/lnk_approvecashpaymentplan'))

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Disapproveloanpaymentplan/cbo_ApprovalStatus'))

WebUI.delay(2)

WebUI.click(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/cbo_approvecash'))

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Disapproveloanpaymentplan/txt_LoanApproverNotes'), 
    'Test')

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Disapproveloanpaymentplan/btn_ApprovalsSaveButton'))

WebUI.getText(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/VerifyCashpaymentplanslist'))

System.out.println(verify)

WebUI.closeBrowser()

