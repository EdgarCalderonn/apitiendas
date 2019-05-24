package prueba


import grails.rest.*

@Resource(uri='/resenas')
class Resenas {

    int id_persona, id_tienda
    double puntaje
    String comentario




    static constraints = {
    }

    static mapping = {
        table 'resenas'
        version false


        columns{

            id column   : 'id_resena', type : "long", sqlType: "int", generator : 'increment'
            id_persona  : 'id_persona'
            id_tienda   : 'id_tienda'
            puntaje     : 'puntaje'
            comentario  : 'comentario'



        }

    }
}
