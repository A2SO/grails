<!DOCTYPE html>
<html>
	<head>
		<title>Vista Cliente</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

    <asset:stylesheet src="bootstrap.css"/>

	</head>
	<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/">
          <p>Atras</p>
      </a>
    </div>

  </div>
</nav>

    <div class="container theme-showcase" role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron">
          <center> <H3  >registro de nuevo cliente</h3></center>
        <form id="formulario" >
  <div class="form-group">
    <label for="nombre">nombre:</label>
    <input type="text" name="nombre" class="form-control" id="nombre">
  </div>
   <div class="form-group">
    <label for="apellidos">apellidos:</label>
    <input type="text" nombre="apellidos" class="form-control" id="apellidos">
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" name="pwd" class="form-control" id="pwd">
  </div>
  <button type="button" class="btn btn-default" onclick="recogerRes(this.form)" >Submit</button>
</form>
      </div>
    <asset:javascript src="application.js"/>

</body>
</html>
