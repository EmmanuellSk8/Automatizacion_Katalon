import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class iniciarSesion {

	@Given("abrir el navegador y dirigirse a katalon cura")
	def abrir_el_navegador_y_dirigirse_a_katalon_cura(){
		WebUI.openBrowser("https://katalon-demo-cura.herokuapp.com/")
		WebUI.maximizeWindow()
	}

	@When("darle al boton y pasar al formulario")
	def darle_al_boton_y_pasar_al_formulario() {
		WebUI.click(findTestObject('Boton_inicio'))
	}

	@And("obtener los datos e ingresarlos")
	def obtener_los_datos_e_ingresarlos(){
		String user =  WebUI.getAttribute(findTestObject('Get_user'), 'value')
		String password = WebUI.getAttribute(findTestObject('Get_password'), 'value')
		WebUI.setText(findTestObject('Post_user'), user )
		WebUI.setText(findTestObject('Post_password'), password)
	}


	@And("darle clic a iniciar")
	def darle_clic_a_iniciar()  {
		WebUI.click(findTestObject('login'))
	}

	@And ("seleccionar el punto de la cita")
	def seleccionar_el_punto_de_la_cita(){
		WebUI.click(findTestObject('falicity'))
		WebUI.click(findTestObject('facility-option'))
	}

	@And ("marcar el checkbox")
	def marcar_el_checkbox() {
		WebUI.click(findTestObject('checkBox'))
	}

	@And ("marcar el radio button")
	def marcar_el_radio_button() {
		WebUI.click(findTestObject('radioButton'))
	}


	@And("digitar la fecha para la cita")
	def digitar_la_fecha_para_la_cita() {
		WebUI.click(findTestObject('fecha'))
		WebUI.setText(findTestObject('fecha'), '11/11/2019')
	}

	@And ("dejar un comentario")
	def dejar_un_comentario () {
		WebUI.setText(findTestObject('comentario'),'feliz navidad para todos')
	}

	@Then ("verirficar que la peticion de la cita sea aceptada")
	def verirficar_que_la_peticion_de_la_cita_sea_aceptada() {
    WebUI.click(findTestObject('boton-cita'))
	}
}