package examen.barco
import barco.examen.Ship

import grails.rest.RestfulController

class ShipController extends RestfulController {
    static responseFormats = ['json', 'xml', 'ship']

 ShipController() {
        super(Ship)
    }
}
