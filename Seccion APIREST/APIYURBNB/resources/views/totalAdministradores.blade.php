<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- CSS de Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

<!-- CSS de DataTables -->
<link href="https://cdn.datatables.net/1.11.5/css/dataTables.bootstrap5.min.css" rel="stylesheet">

<!-- JavaScript de jQuery -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- JavaScript de DataTables -->
<script src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap5.min.js"></script>

    <title>Document</title>
</head>
<body>
<!-- Barra de Navegación -->
<nav class="navbar navbar-expand-lg" style="background-color:#2db879;">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">
                <img src="{{ asset('images/yurbnb-image.png') }}" alt="logo" width="100" height="">
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="{{ url('/perfilUser ') }}">Home</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Ganancias
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="{{ url('/totalOfertantes ') }}">Total Ganancias Ofertantes</a></li>
                            <li><a class="dropdown-item" href="{{ url('/totalAdministradores ') }}">Total Administrador de Ofertas</a></li>
                        </ul>
                    </li>
                    <li class="nav-item">
                        <!-- Botón de Cierre de Sesión -->
                        <button class="btn btn-outline-danger">
                            Cerrar Sesión
                        </button>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

<br><br><br>

<div class="container">
<h1>Total de ganancias administradores de oferta</h1>
<br><br><br>
<div class="card mt-4" id="gananciasCard" style="">
        <div class="card-body">
            <h5 class="card-title">Cantidad de administradores:</h5>
            <p class="card-text"></p>
        </div>
        <div class="card-body">
            <h5 class="card-title">Total de ganancias:</h5>
            <p class="card-text"></p>
        </div>
    </div>
  <br><br><br>


</div>
<div class="container">
<form action="{{ url('registroAdministradores') }}" method="get">
    <input type="submit" value="Registrar Administradores" class="btn btn-primary">
</form>
</div>
<div class="container mt-5">

        <div class="row mb-3">
            <div class="col-md-6 offset-md-6">
                <input type="text" class="search form-control" placeholder="Buscar">
            </div>
        </div>
        <div class="row">
            <div class="col">

            <table class="table table-hover table-bordered results">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Codigo Usuario</th>
                            <th>Tipo Usuario</th>
                            <th>Telefono</th>
                            <th>Correo Electronico</th>
                            <th>DUI</th>
                            <th>Estado</th>
                            <th>Fecha Registro</th>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
            <tr>
                <th scope="row"></th>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td><form action="{{ url('modificarAdministradores') }}" method="get">
                    <input type="submit" value="Modificar" class="btn btn-info">
                </form></td>
                <td><form action="{{ url('eliminarAdministradores') }}" method="get">
                    <input type="submit" value="Eliminar" class="btn btn-danger">
                </form></td>
            
            </tr>
         
            </tbody>
                </table>
            </div>
        </div>
    </div>

   

</body>
</html>