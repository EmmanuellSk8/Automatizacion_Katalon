
Feature: Soy usuario que desea iniciar sesión en Katalon cura
 
  Scenario:  
  
    Given abrir el navegador y dirigirse a katalon cura
    When darle al boton y pasar al formulario
    And obtener los datos e ingresarlos
    And darle clic a iniciar
 		And seleccionar el punto de la cita
    And marcar el checkbox
    And marcar el radio button
    And digitar la fecha para la cita 
    And dejar un comentario
    Then verirficar que la peticion de la cita sea aceptada
