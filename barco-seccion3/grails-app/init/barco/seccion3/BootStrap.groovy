package barco.seccion3

import barco.examen.Ship
 
class BootStrap {

    def init = { servletContext ->
    	if (Ship.count() == 0) {
            new Ship(tipo: 'Yate', clase: 'LR' , operador: 'Doe',numero_tripulacion: 	56,velocidad_maxima: 20 ).save()
            new Ship(tipo: 'Pesquero', clase: 'SS', operador: 'Smith',numero_tripulacion: 20,velocidad_maxima: 25 ).save()
            new Ship(tipo: 'crucero', clase: 'LR' , operador:  'Robinson',numero_tripulacion: 200,velocidad_maxima: 40 ).save()
        }
    }
    def destroy = {
    }
}
