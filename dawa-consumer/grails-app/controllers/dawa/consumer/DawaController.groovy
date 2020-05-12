package dawa.consumer

import dawa.plugin.DawaService
import grails.converters.JSON

class DawaController {

    DawaService dawaService

    def index() {
        render dawaService.regioner as JSON
    }
}
