
function cogerRes(frm) {
  contrasena = frm.pwd.value;
  apellidos = frm.apellidos.value;
  nombre = frm.nombre.value;
  
  var Persona = new Object();
Persona.contrasena = contrasena;
Persona.apellidos = apellidos;
Persona.nombre = nombre;

alert(JSON.stringify(Persona, null, 4));

console.log(Persona);
    document.getElementById("formulario").reset();

}