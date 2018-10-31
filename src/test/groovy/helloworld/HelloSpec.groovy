package helloworld

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class HelloSpec extends Specification implements DomainUnitTest<Hello> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
