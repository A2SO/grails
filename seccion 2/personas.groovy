

import groovy.json.JsonOutput  


class Persona{
    String nombre;
    String edad;
}

// Instancias de la clase persona para almacenar en el achivo person.json
def persona = new Persona(
    edad: '24',
    nombre: 'Jose '
)

def persona1 = new Persona(
    edad: '23',
    nombre: 'alfredo '
    
)


//Convirtiendo a JSON los datos de persona 
def personaJson = JsonOutput.toJson([ persona, persona1 ])

//Almacena los datos de persona en el archivo person.json
def outputFile = new File("person.json")
outputFile.write(personaJson)

//Muestra los datos de persona almacenados en el archivo person.json
println(); 
println ("*********************************************")
println ("* los siguientes datos han sido almacenados *")
println ("*********************************************")

println JsonOutput.prettyPrint(personaJson.toString())