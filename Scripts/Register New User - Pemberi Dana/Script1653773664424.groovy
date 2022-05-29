import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dev.p2p.alamisharia.co.id/')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Home Page/a_Daftar_disini'))

WebUI.click(findTestObject('Object Repository/Form Registrasi Pemberi Dana/btn_Pemberi_Dana'))

// Inisiasi incremental untuk email user baru
String i = GlobalVariable.nextUser

String emailname = 'rizup2p_' + i

String email = emailname + '@mailnesia.com'

String name = 'Rizu P2P ' + i

String password = '1234567' + i

System.out.println(email)

// Update GlobalVariable untuk email & password
GlobalVariableUpdater.updatePermanently('dev', 'name', name)

GlobalVariableUpdater.updatePermanently('dev', 'email', email)

GlobalVariableUpdater.updatePermanently('dev', 'password', password)

i.toInteger()

i++

GlobalVariableUpdater.updatePermanently('dev', 'nextUser', i)

System.out.println(i)

WebUI.setText(findTestObject('Object Repository/Form Registrasi Pemberi Dana/input_Nama Lengkap'), 'Rizu Test Satu')

WebUI.setText(findTestObject('Object Repository/Form Registrasi Pemberi Dana/input_Email_email'), email)

System.out.println(email)

WebUI.setText(findTestObject('Object Repository/Form Registrasi Pemberi Dana/input_No. Handphone'), '081273837823')

WebUI.setText(findTestObject('Object Repository/Form Registrasi Pemberi Dana/input_Password'), password)

WebUI.click(findTestObject('Object Repository/Form Registrasi Pemberi Dana/label_Individual'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Form Registrasi Pemberi Dana/select_Instagram'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Form Registrasi Pemberi Dana/button_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/Form Registrasi Pemberi Dana/input_Saya tertarik update info terbaru ALAMI'))

WebUI.scrollToElement(findTestObject('Object Repository/Form Registrasi Pemberi Dana/p_Plaza 89, Kav. X7Jln. H.R. Rasuna Said'), 
    0)

WebUI.click(findTestObject('Object Repository/Form Registrasi Pemberi Dana/input_Saya sudah membaca dan setuju'))

WebUI.click(findTestObject('Object Repository/Page Ketentuan Pengguna/button_Lanjutkan_step2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page Ketentuan Pengguna/p_Kamu sudah berhasil mendaftar'), 
    0)

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

// Open new tab for Verifying Email
WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('https://mailnesia.com/mailbox/' + emailname)

WebUI.click(findTestObject('Object Repository/Form Registrasi Pemberi Dana/a_Mina  ALAMI no-replyalamisharia.co.id'))

WebUI.switchToWindowTitle(emailname + ' @ Mailnesia - Anonymous E-Mail In Seconds')

WebUI.click(findTestObject('Object Repository/Page Mailnesia/a_Klik Untuk Aktivasi Email Log-in'))


// Verifikasi Telah berhasil registrasi User baru: Pemberi Dana 
WebUI.verifyElementPresent(findTestObject('Object Repository/Page Success Activation/p_Akun Kamu sudah berhasil diaktifkan (Pemberi Dana)'), currentWindow)

//WebUI.verifyElementText(findTestObject('Object Repository/Page Success Activation/p_Akun Kamu sudah berhasil diaktifkan (Pemberi Dana)'), 
//    'Akun Kamu sudah berhasil diaktifkan sebagai Pemberi Dana. Silahkan klik link login dibawah ini untuk masuk.')

WebUI.click(findTestObject('Object Repository/Page Success Activation/a_Masuk ke Akun Saya'))


