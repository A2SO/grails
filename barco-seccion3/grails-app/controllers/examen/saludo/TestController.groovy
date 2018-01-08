package examen.saludo

class TestController {

    def index() { 
def saludos = request.getParameter("saludos")

render(view: '/saludo/index', model: [saludos: saludos])

        }
}
