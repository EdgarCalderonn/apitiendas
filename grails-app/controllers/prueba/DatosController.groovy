package prueba

import grails.converters.*


class DatosController {

    def jsonObj = request.JSON

    def index() {



    }

    def prueba = {


        Tienda tienda1 = new Tienda(nombre:"Si sirvio",horario: "drvfr",imagen: "cecr",id:3)
        TiendaController.create(tienda1)
        render tienda1 as JSON

    }






    def tiendas = {
        def l = Tienda.list()
        render l as JSON
    }

}
