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

WebUI.mouseOver(findTestObject('Products/Payment Plans/Menu/menu_ProductMenu'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Products/Payment Plans/Menu/menu_PaymentPlans'))

WebUI.click(findTestObject('null'))

WebUI.verifyElementVisible(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/grid_addloanpaymentplanpage'))

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/text_loanname', [('name') : name]), 
    name)

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/button_loanpaymentplansavebutton'))

WebUI.callTestCase(findTestCase('Common/LogOut'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/MarkerCheckerLogin'), [('Email') : findTestData('MarkerCheckerLogin/CheckerLogin').getValue(
            1, 1), ('Password') : findTestData('MarkerCheckerLogin/CheckerLogin').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Products/Payment Plans/Menu/menu_ProductMenu'))

WebUI.mouseOver(findTestObject('Products/Payment Plans/Menu/menu_PaymentPlans'))

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Disapproveloanpaymentplan/menu_PaymentPlansApprovals'))

WebUI.verifyElementNotPresent(findTestObject('Products/Payment Plans/Cash Payment Plan/Approve Cash Payment Plan/grid_verifynotinapprovallist'), 
    0)

WebUI.callTestCase(findTestCase('Common/LogOut'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/Login'), [('Email') : '', ('Password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Products/Payment Plans/Menu/menu_ProductMenu'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Products/Payment Plans/Menu/menu_PaymentPlans'))

WebUI.click(findTestObject('null'))

WebUI.verifyElementVisible(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/grid_addloanpaymentplanpage'))

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/text_loanname', [('name') : name]), 
    name)

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/text_displayname(marketing)', 
        [('displayname') : displayname]), displayname)

WebUI.verifyElementChecked(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/chk_checkcanbeprimary'), 
    0)

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/select_loanproducttype'))

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/button_addloanproducttype'))

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/text_Deposit', [('deposit') : deposit]), 
    deposit)

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/text_freeusageonactivation', [
            ('freeusage') : freeusage]), freeusage)

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/text_costpercredit', [('costpercredit') : costpercredit]), 
    costpercredit)

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/dropdown_creditsystem'))

WebUI.delay(5)

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/select_dailycountdown'))

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/text_optimalloanuration(days)', 
        [('days') : days]), days)

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/text_totalprice', [('price') : price]), 
    price)

WebUI.setText(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/text_notes', [('notes') : notes]), 
    notes)

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/dropdown_loantype'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/select_credit'), 0)

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/select_credit'))

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/button_loanpaymentplansavebutton'))

not_run: WebUI.verifyElementVisible(findTestObject('Products/Payment Plans/Cash Payment Plan/Approve Cash Payment Plan/grid_cashpaymentplan'))

not_run: WebUI.verifyElementNotPresent(findTestObject('Products/Payment Plans/Loan Payment Plan/Addloanpaymentplan/grid_errorpage'), 
    0)

WebUI.callTestCase(findTestCase('Common/LogOut'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/MarkerCheckerLogin'), [('Email') : findTestData('MarkerCheckerLogin/CheckerLogin').getValue(
            1, 1), ('Password') : findTestData('MarkerCheckerLogin/CheckerLogin').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Products/Payment Plans/Menu/menu_ProductMenu'))

WebUI.mouseOver(findTestObject('Products/Payment Plans/Menu/menu_PaymentPlans'))

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Disapproveloanpaymentplan/menu_PaymentPlansApprovals'))

String verify = WebUI.getText(findTestObject('Products/Payment Plans/Loan Payment Plan/Disapproveloanpaymentplan/VerifyPaymentloan'))

System.out.println(verify)

