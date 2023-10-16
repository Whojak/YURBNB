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
<script src="https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap5.min.js"></script>    <title>Menu</title>
</head>

<body>

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
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
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

<div class="container mt-5">
      <h1 class="text-center mb-4">Perfil Usuarios</h1>
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
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
            <tr>
                <th scope="row">1</th>
                <td>Wilson</td>
                <td>Alfonso</td>
                <td>WA0001</td>
                <td>Cliente</td>
                <td>22222222</td>
                <td>wilson.alfonso@gmail.com</td>
                <td>1224567-8</td>
                <td>Activo</td>
                <td>10-10-2023</td>
                <td>
                <form action="{{ url('clientes') }}" method="get">
                    <input type="submit" value="Informacion" class="btn btn-primary">
                </form>
                </td>
            </tr>
            <tr>
                <th scope="row">2</th>
                <td>Armida</td>
                <td>Franco</td>
                <td>AF0001</td>
                <td>Ofertante</td>
                <td>22222222</td>
                <td>armid.franco@gmail.com</td>
                <td>1224567-8</td>
                <td>Inactivo</td>
                <td>10-10-2023</td>
                <td>
                <form action="{{ url('ganancias') }}" method="get">
                    <input type="submit" value="Informacion" class="btn btn-primary">
                </form>
                </td>
            </tr>
            <tr>
                <th scope="row">3</th>
                <td>Alonso</td>
                <td>Rojelio</td>
                <td>AR0001</td>
                <td>Administrador de ofertas</td>
                <td>22222222</td>
                <td>alonso@gmail.com</td>
                <td>1224567-8</td>
                <td>Activo</td>
                <td>10-10-2023</td>
                <td>
                <form action="{{ url('adGanancias') }}" method="get">
                    <input type="submit" value="Informacion" class="btn btn-primary">
                </form>
                </td>
            </tr>
            </tbody>
                </table>
            </div>
        </div>
    </div>

   


<script>
    $(document).ready(function() {
  $(".search").keyup(function () {
    var searchTerm = $(".search").val();
    var listItem = $('.results tbody').children('tr');
    var searchSplit = searchTerm.replace(/ /g, "'):containsi('")
    
  $.extend($.expr[':'], {'containsi': function(elem, i, match, array){
        return (elem.textContent || elem.innerText || '').toLowerCase().indexOf((match[3] || "").toLowerCase()) >= 0;
    }
  });
    
  $(".results tbody tr").not(":containsi('" + searchSplit + "')").each(function(e){
    $(this).attr('visible','false');
  });

  $(".results tbody tr:containsi('" + searchSplit + "')").each(function(e){
    $(this).attr('visible','true');
  });

  var jobCount = $('.results tbody tr[visible="true"]').length;
    $('.counter').text(jobCount + ' item');

  if(jobCount == '0') {$('.no-result').show();}
    else {$('.no-result').hide();}
		  });
});
</script>

<style>
    body{
  padding:20px 20px;
}

.results tr[visible='false'],
.no-result{
  display:none;
}

.results tr[visible='true']{
  display:table-row;
}

.counter{
  padding:8px; 
  color:#ccc;
}
</style>

</div>


    
   
</body>

</html>
