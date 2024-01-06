#language: es
Característica: : Crear registro

  @RegisterSuccess
  Escenario: 001 - verificar el formulario de registro
    Dado que el usuario ingresa a la pagina web para la creacion de un registro
    Cuando llena los campos requeridos
    Entonces crea su cuenta con exito