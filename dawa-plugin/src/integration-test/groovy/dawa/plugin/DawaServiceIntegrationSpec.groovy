package dawa.plugin

import grails.testing.mixin.integration.Integration
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

@Integration
class DawaServiceIntegrationSpec extends Specification {

    @Autowired(required = true)
    DawaService dawaService

    def "test that we can get regions from service"() {
        when:
            def result = dawaService.regioner

        then:
            result.size() == 5
    }
}
