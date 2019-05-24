package prueba

import grails.rest.*

@Resource(uri='/personas')

class Persona {

    String nombre,correo


    static constraints = {
    }


    static mapping = {
        table 'personas'
        version false


        columns{

            id column   : 'id_persona', type : "long", sqlType: "int", generator : 'increment'
            nombre      : 'nombre'
            correo      : 'correo'



        }

    }


}
