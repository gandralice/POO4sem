<?php

namespace Database\Seeders;

use App\Models\Computador;
use Illuminate\Database\Seeder;

class DatabaseSeeder extends Seeder
{
    public function run(): void
    {
        Computador::create(['marca'=>'Lenovo', 'preco'=>5000, 'ram'=>8, 'disco'=>500]);
        Computador::create(['marca'=>'Dell', 'preco'=>5400, 'ram'=>8, 'disco'=>500]);
        Computador::create(['marca'=>'Samsung', 'preco'=>7200, 'ram'=>12, 'disco'=>1000]);

    }
}
