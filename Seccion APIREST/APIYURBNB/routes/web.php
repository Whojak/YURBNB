<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});

Route::get('/', function () {
    return view('index');
});

Route::view('/envioContraseña', 'envioContraseña')->name('envioContraseña');
Route::view('/ganancias', 'ganancias')->name('ganancias');
Route::view('/clientes', 'clientes')->name('clientes');
Route::view('/adminOf', 'adminOf')->name('adminOf');
Route::view('/ofertantes', 'ofertantes')->name('ofertantes');
Route::view('/perfilUser', 'perfilUser')->name('perfilUser');
Route::view('/adGanancias', 'adGanancias')->name('adGanancias');
Route::view('/totalOfertantes', 'totalOfertantes')->name('totalOfertantes');
Route::view('/totalAdministradores', 'totalAdministradores')->name('totalAdministradores');
Route::view('/registroAdministradores', 'registroAdministradores')->name('registroAdministradores');
Route::view('/modificarAdministradores', 'modificarAdministradores')->name('modificarAdministradores');
Route::view('/eliminarAdministradores', 'eliminarAdministradores')->name('eliminarAdministradores');
Route::view('/tokenAministradores', 'tokenAministradores')->name('tokenAministradores');

