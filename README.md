# retoIlana


Autor: Alejandro Polo Carvajal

Pagina automatizada: https://demoqa.com/
Modulo automatizado: registro.
Patron de diseño: POM Puro y selenium webdriver
Framework: Junit, gherkin, cucumber, selenium, webdriver.
Framework adicionales: libreria Faker.
Lenguaje programacion: Java.
Driver: ChromeDriver version  114.0.5735.90.


Se crea proyecto  en patron de diseño POM con actualizacion de diseño,
similares a las de screenplay, se automatizo una pagina para realizar registro de
una cuenta, los datos que se utilizaron, la mayoria son falsificados o de relleno por
medio de la libreria FAKER se implementaron los datos, haciendo que cadavez que
se ejecute el test, cree una cuenta distinta al igual al llenar los datos del
formulario por medio de un modelo, para asi el tomar informacion aleatoria tambien
es de resaltar que se construyo de forma dinamica la logica, por ultimo se
ejecuto un analicis de codigo estatico con la herramienta
SonarLink solo quedaron los codesmell que no son prioritarios o alarmantes.