<!DOCTYPE html>
<html>
	<head>
		<title>Examen</title>

    <asset:stylesheet src="bootstrap.css"/>

	</head>
	<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">
        <img alt="Brand" src="...">
 
      </a>
    </div>

  </div>
</nav>

    <div class="container theme-showcase" role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron">
        <h1>Enviar saludos</h1>
        <p>Para que tus saludos aparescan en la parte de abajo tienes que escribir lo siguiente  http://localhost:8080/test/?saludos=Aqui van tus saludos .</p>

      </div>

<h1>Estos son tus saludos:</h1>
        <h2> ${saludos}</h2>
	</body>
</html>