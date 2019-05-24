package prueba

import grails.gorm.services.Service

@Service(Tienda)
interface TiendaService {

    Tienda get(Serializable id)

    List<Tienda> list(Map args)

    Long count()

    void delete(Serializable id)

    Tienda save(Tienda tienda)

}