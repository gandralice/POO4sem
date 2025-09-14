<?php

use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return view('welcome');
});

Route::resource('/computadores', App\Http\Controllers\ComputadorController::class);
