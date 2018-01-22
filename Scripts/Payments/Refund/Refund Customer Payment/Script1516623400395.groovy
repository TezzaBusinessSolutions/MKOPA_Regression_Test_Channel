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

WebUI.mouseOver(findTestObject('Customers/Common/mnu_CustomerDropDown'))

WebUI.click(findTestObject('Customers/Common/mnu_ListCustomerMenu'))

WebUI.waitForPageLoad(pageLoad)

WebUI.comment('Clicking on the Customer Account we want to refund')

WebUI.scrollToElement(findTestObject('Customers/List Customers/lnk_CustomerToRefundAccountLink', [('customerToRefund') : customerToRefund]), 
    0)

WebUI.click(findTestObject('Customers/List Customers/lnk_CustomerToRefundAccountLink', [('customerToRefund') : customerToRefund]))

not_run: WebUI.waitForPageLoad(pageLoad)

String bal = WebUI.getText(findTestObject('Customers/List Customers/lbl_AvailableBalance'), FailureHandling.STOP_ON_FAILURE)

System.out.println(bal)

WebUI.scrollToElement(findTestObject('Customers/List Customers/img_MorePaymentInformation'), 3)

WebUI.click(findTestObject('Customers/List Customers/img_MorePaymentInformation'))

WebUI.waitForPageLoad(pageLoad)

WebUI.scrollToElement(findTestObject('Customers/List Customers/lbl_AvailableBalance', [('receiptNumber') : receiptNumber]), 
    0)

WebUI.click(findTestObject('Customers/List Customers/lnk_CustomerDepositTransfer', [('customerToRefund') : customerToRefund
            , ('receiptNumber') : receiptNumber]))

WebUI.waitForPageLoad(pageLoad)

WebUI.click(findTestObject('Customers/List Customers/btn_refundPayment'))

WebUI.waitForPageLoad(pageLoad)

for (def row = 1; row <= findTestData('Customer/RefundCustomer').getRowNumbers(); row++) {
    WebUI.setText(findTestObject('Customers/List Customers/txt_Amount'), findTestData('Payments/RefundCustomer').getValue(
            'Refund Amount', row))

    WebUI.setText(findTestObject('Customers/List Customers/txt_RefundNotes'), findTestData('Payments/RefundCustomer').getValue(
            'Refund Notes', row))

    WebUI.click(findTestObject('Customers/List Customers/btn_SubmitButton'))

    String notes_error = WebUI.getText(findTestObject('Customers/List Customers/errormsg_FillRequestNotes'))

    String refundQued = WebUI.getText(findTestObject('Customers/List Customers/msg_RefundQuedForApproval'))

    if (notes_error) {
        System.out.println(notes_error)
    }
}

WebUI.delay(15)

WebUI.closeBrowser()

not_run: WebUI.callTestCase(findTestCase('Payments/Refund/CustomerRefundPaymentApproval'), [('approvalStatus') : findTestData(
            'Payments/PaymentsModule').getValue(1, 1), ('notes') : findTestData('Payments/PaymentsModule').getValue(2, 1)
        , ('phoneNo') : '22521729'], FailureHandling.STOP_ON_FAILURE)

