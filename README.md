# Reto-Ilana-POM


### Autor: Alejandro Polo Carvajal

#### Pagina automatizada: https://demoqa.com/
#### Modulo automatizado: Forms, elements, widgets(slider)
#### Patron de diseño: POM Puro con selenium webdriver
#### Framework: Junit, gherkin, cucumber, selenium, webdriver.
#### Framework adicionales: libreria Faker.
#### Lenguaje programacion: Java.
#### Driver: Edge version  120.0.2210.121
##### ------------------------------------------------------------------------------------------------------
### Buscar en la siguiente ruta los reportes y evidencias de cada uno de los test con estado exitoso
#### path: src/test/resources/ReporteEvidencias
### Todos los casos pruebas cumplen con cada criterio solitado
### Todas las clases estan con auto-ident lines y reformat code
##### ------------------------------------------------------------------------------------------------------
### Dentro de esta ruta encontrara tres runner llamados:
#### TestRunnerCarrusel.java
#### TestRunnerElements.java
#### TestRunnerRegister.java
### Donde el stakeholder "Interesad@" podra ejecutar desde la linea #11
##### ------------------------------------------------------------------------------------------------------

Se crea proyecto  en patron de diseño POM con actualizacion de diseño,
similares a las de screenplay, se automatizo una pagina para realizar registro de
una cuenta, los datos que se utilizaron, la mayoria son falsificados o de relleno por
medio de la libreria FAKER se implementaron los datos, haciendo que cadavez que
se ejecute el test, cree una cuenta distinta al igual al llenar los datos del
formulario por medio de un modelo, para asi el tomar informacion aleatoria tambien
es de resaltar que se construyo de forma dinamica la logica, por ultimo se
ejecuto un analicis de codigo estatico con la herramienta
SonarLink solo quedaron los codesmell que no son prioritarios o alarmantes.

