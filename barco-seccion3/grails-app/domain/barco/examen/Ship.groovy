package barco.examen
import grails.rest.Resource
@Resource(uri='/ship', formats=['json'])

class Ship {


    String tipo
    String clase
    String operador
    int numero_tripulacion
    int velocidad_maxima

    static constraints = {
    }
}
