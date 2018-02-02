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

WebUI.click(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/menu_AddcashPaymentPlan'))

WebUI.verifyElementVisible(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/grid_addcashpaymentplanpage'))

WebUI.setText(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/text_cashname', [('name') : name]), 
    name)

WebUI.click(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/button_cashpaymentplansavebutton'))

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

WebUI.click(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/menu_AddcashPaymentPlan'))

WebUI.verifyElementVisible(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/grid_addcashpaymentplanpage'))

WebUI.setText(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/text_cashname', [('name') : name]), 
    name)

WebUI.setText(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/text_displayname(marketing)', 
        [('variable') : displayname]), displayname)

WebUI.click(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/select_cashproducttype'))

WebUI.click(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/button_addcashproducttype'))

WebUI.setText(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/text_cashprice', [('price') : price]), 
    price)

WebUI.setText(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/text_approvernotes', [('notes') : notes]), 
    notes)

WebUI.click(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/button_cashpaymentplansavebutton'))

WebUI.verifyElementVisible(findTestObject('Products/Payment Plans/Cash Payment Plan/Approve Cash Payment Plan/grid_cashpaymentplan'))

WebUI.callTestCase(findTestCase('Common/LogOut'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/MarkerCheckerLogin'), [('Email') : findTestData('MarkerCheckerLogin/CheckerLogin').getValue(
            1, 1), ('Password') : findTestData('MarkerCheckerLogin/CheckerLogin').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Products/Payment Plans/Menu/menu_ProductMenu'))

WebUI.mouseOver(findTestObject('Products/Payment Plans/Menu/menu_PaymentPlans'))

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Disapproveloanpaymentplan/menu_PaymentPlansApprovals'))

WebUI.click(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/link_approvecashpaymentplan'))

WebUI.click(findTestObject('Products/Payment Plans/Cash Payment Plan/Approve Cash Payment Plan/cbo_ApprovalStatus'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Products/Payment Plans/Cash Payment Plan/Approve Cash Payment Plan/cbo_approvecash'))

WebUI.setText(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/text_approvernotes', [('notes') : notes]), 
    notes)

WebUI.click(findTestObject('Products/Payment Plans/Loan Payment Plan/Disapproveloanpaymentplan/button_ApprovalsSaveButton'))

String verify = WebUI.getText(findTestObject('Products/Payment Plans/Cash Payment Plan/Addcashpaymentplan/VerifyCashpaymentplanslist'))

System.out.println(verify)

WebUI.closeBrowser()

