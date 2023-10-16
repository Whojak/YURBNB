<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
     <!-- Enlace a tu CSS personal -->
     <link rel="stylesheet" type="text/css" href="{{ asset('css/index.css') }}">
     <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>



    <!-- Enlaces a Bootstrap y otros recursos -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<div class="login-reg-panel">
    <div class="login-info-box">
        <h2>¿Tienes una cuenta?</h2>
        <p>Por favor ingresa con tu correo</p>
        <label id="label-register" for="log-reg-show">Login</label>
        <input type="radio" name="active-log-panel" id="log-reg-show" checked="checked">
    </div>
                        
    <div class="register-info-box">
        <h2>¿Aun no tienes una cuenta?</h2>
        <p>Por favor ingresa tus datos</p>
        <label id="label-login" for="log-login-show">Registrar</label>
        <input type="radio" name="active-log-panel" id="log-login-show">
    </div>
                        
    <div class="white-panel">
        <div class="login-show">
            <h2>LOGIN</h2>
            <input type="text" placeholder="Email" class="form-control mb-3">
            <input type="password" placeholder="Password" class="form-control mb-3">
            <form action="{{ url('perfilUser') }}" method="get">
                <input type="submit" value="Login" class="btn btn-outline-secondary">
            </form>
            <a href="{{ url('/envioContraseña') }}">¿Olvidaste tu contraseña?</a>
        </div>
        <div class="register-show">
            <h2>REGISTRO</h2>
            <div class="form-row">
    <div class="col">
        <input type="text" placeholder="Nombre" class="form-control form-control-sm">
    </div>
    <div class="col">
        <input type="text" placeholder="Apellido" class="form-control form-control-sm">
    </div>
</div>
<div class="form-row">
    <div class="col">
        <input type="text" placeholder="Telefono" class="form-control form-control-sm">
    </div>
    <div class="col">
        <input type="text" placeholder="DUI" class="form-control form-control-sm">
    </div>
</div>
<input type="text" placeholder="Email" class="form-control form-control-sm">
<input type="password" placeholder="Password" class="form-control form-control-sm">
<input type="password" placeholder="Confirm Password" class="form-control form-control-sm">
<form action="{{ url('tokenAministradores') }}" method="get">
                <input type="submit" value="Registrar" class="btn btn-outline-secondary">
            </form>
</div>

<!-- Scripts de Bootstrap y jQuery -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

<!-- Tu script personal -->
<script src="js/index.js"></script>
</body>
</html>