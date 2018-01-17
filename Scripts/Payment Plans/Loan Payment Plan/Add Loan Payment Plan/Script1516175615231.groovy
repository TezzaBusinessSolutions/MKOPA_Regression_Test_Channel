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

WebUI.mouseOver(findTestObject('Payment Plans/common/mnuProductMenu'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Payment Plans/common/mnu_PaymentPlans'))

WebUI.click(findTestObject('Payment Plans/Cash Payment Plan/Addcashpaymentplan/mnu_AddcashPaymentPlan'))

WebUI.verifyElementVisible(findTestObject('Payment Plans/Loan Payment Plan/Addloanpaymentplan/grd_addloanpaymentplanpage'))

WebUI.setText(findTestObject('Payment Plans/Loan Payment Plan/Addloanpaymentplan/txt_loanname'), findTestData('PaymentPlans/Paymentplannames').getValue(
        1, 1))

WebUI.setText(findTestObject('Payment Plans/Loan Payment Plan/Addloanpaymentplan/txt_displayname(marketing)'), findTestData(
        'PaymentPlans/Paymentplannames').getValue(2, 1))

WebUI.verifyElementChecked(findTestObject('Payment Plans/Loan Payment Plan/Addloanpaymentplan/chk_checkcanbeprimary'), 0)

WebUI.scrollToElement(findTestObject('Payment Plans/Loan Payment Plan/Addloanpaymentplan/loanproducttypestoselect'), 0)

WebUI.click(findTestObject('Payment Plans/Loan Payment Plan/Addloanpaymentplan/loanproducttypestoselect'))

WebUI.delay(2)

WebUI.click(findTestObject('Payment Plans/Loan Payment Plan/Addloanpaymentplan/btn_addloanproducttype'))

WebUI.click(findTestObject('Payment Plans/Loan Payment Plan/Addloanpaymentplan/btn_loanpaymentplansavebutton'))

