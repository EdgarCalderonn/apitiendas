package prueba

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TiendaServiceSpec extends Specification {

    TiendaService tiendaService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Tienda(...).save(flush: true, failOnError: true)
        //new Tienda(...).save(flush: true, failOnError: true)
        //Tienda tienda = new Tienda(...).save(flush: true, failOnError: true)
        //new Tienda(...).save(flush: true, failOnError: true)
        //new Tienda(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tienda.id
    }

    void "test get"() {
        setupData()

        expect:
        tiendaService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Tienda> tiendaList = tiendaService.list(max: 2, offset: 2)

        then:
        tiendaList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tiendaService.count() == 5
    }

    void "test delete"() {
        Long tiendaId = setupData()

        expect:
        tiendaService.count() == 5

        when:
        tiendaService.delete(tiendaId)
        sessionFactory.currentSession.flush()

        then:
        tiendaService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Tienda tienda = new Tienda()
        tiendaService.save(tienda)

        then:
        tienda.id != null
    }
}
