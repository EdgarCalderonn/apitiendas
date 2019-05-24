package prueba

import grails.rest.*

@Resource(uri='/productos')
class Producto {

    int id_tienda
    String nombre, descripcion, imagen
    double precio



    static constraints = {
    }


    static mapping = {
        table 'productos'
        version false


        columns{

            id column   : 'id_producto', type : "long", sqlType: "int", generator : 'increment'
            id_tienda   : 'id_tienda'
            nombre      : 'nombre'
            descripcion : 'descripcion'
            precio      : 'precio'
            imagen      : 'imagen'



        }

    }

}
