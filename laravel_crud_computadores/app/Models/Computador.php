<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

class Computador extends Model
{
    protected $fillable = ['marca', 'preco', 'ram', 'disco'];
}
