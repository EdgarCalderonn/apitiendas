package prueba


import grails.rest.*

@Resource(uri='/personas')
class User {

    String nombre
    String apellido
    int edad

    static constraints = {

        nombre blank:false
    }
}
