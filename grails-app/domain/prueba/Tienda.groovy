package prueba

import grails.rest.*

@Resource(uri='/tiendas')
class Tienda {


    String nombre, horario, ubicacion, imagen

    static constraints = {


    }

    static mapping = {

        table 'tiendas'
        version false

        columns{
            id column : 'id_tienda', type : "long", sqlType: "int", generator : 'increment'
            nombre    : 'nombre'
            ubicacion : 'ubicacion'
            imagen    : 'imagen'
        }
    }


}
