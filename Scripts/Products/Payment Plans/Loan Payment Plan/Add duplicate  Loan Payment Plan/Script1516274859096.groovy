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

WebUI.mouseOver(findTestObject('Products/Payment Plans/common/mnuProductMenu'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Products/Payment Plans/common/mnu_PaymentPlans'))

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/mnu_AddLoanPaymentPlan'))

WebUI.verifyElementVisible(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/grd_addloanpaymentplanpage'))

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/txt_loanname'), findTestData('Payments/PaymentsModule').getValue(
        1, 1))

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/btn_loanpaymentplansavebutton'))

WebUI.callTestCase(findTestCase('Common/LogOut'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/MarkerCheckerLogin'), [('Email') : findTestData('MarkerCheckerLogin/CheckerLogin').getValue(
            1, 1), ('Password') : findTestData('MarkerCheckerLogin/CheckerLogin').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Products/Payment Plans/common/mnuProductMenu'))

WebUI.mouseOver(findTestObject('Products/Payment Plans/common/mnu_PaymentPlans'))

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Disapproveloanpaymentplan/mnu_PaymentPlansApprovals'))

WebUI.verifyElementNotPresent(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/grd_verifynotinapprovallist'), 
    0)

WebUI.callTestCase(findTestCase('Common/LogOut'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/Login'), [('Email') : '', ('Password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Products/Payment Plans/common/mnuProductMenu'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Products/Payment Plans/common/mnu_PaymentPlans'))

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/mnu_AddLoanPaymentPlan'))

not_run: WebUI.verifyElementVisible(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/grd_addloanpaymentplanpage'))

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/txt_loanname'), findTestData('Payments/PaymentsModule').getValue(
        1, 2))

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/txt_displayname(marketing)'), findTestData(
        'Payments/PaymentsModule').getValue(2, 1))

WebUI.verifyElementChecked(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/chk_checkcanbeprimary'), 0)

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/loanproducttypestoselect'))

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/btn_addloanproducttype'))

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/txt_Deposit'), '3000')

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/txt_freeusageonactivation'), '5')

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/txt_costpercredit'), '55')

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/cbo_creditsystem'))

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/cbo_dailycountdown'))

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/txt_optimalloanuration(days)'), '365')

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/txt_totalprice'), '63000')

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/cbo_loantype'))

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/cbo_credit'))

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/txt_notes'), findTestData('Common/Approver Notes/Approver Notes').getValue(
        1, 1))

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/btn_loanpaymentplansavebutton'))

WebUI.verifyElementVisible(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/grd_cashpaymentplan'))

WebUI.verifyElementNotPresent(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/grd_errorpage'), 0)

WebUI.callTestCase(findTestCase('Common/LogOut'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/MarkerCheckerLogin'), [('Email') : findTestData('MarkerCheckerLogin/CheckerLogin').getValue(
            1, 1), ('Password') : findTestData('MarkerCheckerLogin/CheckerLogin').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Products/Payment Plans/common/mnuProductMenu'))

WebUI.mouseOver(findTestObject('Products/Payment Plans/common/mnu_PaymentPlans'))

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Disapproveloanpaymentplan/mnu_PaymentPlansApprovals'))

String verify = WebUI.getText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/VerifyPaymentloan'))

System.out.println(verify)

