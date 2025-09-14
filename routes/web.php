<?php

use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return view('welcome');
});

Route::resource('/receitas',App\Http\Controllers\ReceitaController::class);