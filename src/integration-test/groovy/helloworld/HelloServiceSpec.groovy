package helloworld

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class HelloServiceSpec extends Specification {

    HelloService helloService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Hello(...).save(flush: true, failOnError: true)
        //new Hello(...).save(flush: true, failOnError: true)
        //Hello hello = new Hello(...).save(flush: true, failOnError: true)
        //new Hello(...).save(flush: true, failOnError: true)
        //new Hello(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //hello.id
    }

    void "test get"() {
        setupData()

        expect:
        helloService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Hello> helloList = helloService.list(max: 2, offset: 2)

        then:
        helloList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        helloService.count() == 5
    }

    void "test delete"() {
        Long helloId = setupData()

        expect:
        helloService.count() == 5

        when:
        helloService.delete(helloId)
        sessionFactory.currentSession.flush()

        then:
        helloService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Hello hello = new Hello()
        helloService.save(hello)

        then:
        hello.id != null
    }
}
