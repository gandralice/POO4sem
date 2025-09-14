<?php
namespace Database\Seeders;

// use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use App\Models\Receita;

class DatabaseSeeder extends Seeder
{
    public function run(): void
    {
        Receita::create(['dt_emissao'=>'2025-05-01','nm_remedio'=>'Rivotril','nm_medico'=>'Maira Sillfer','posologia'=>'1x ao dia']);
        Receita::create(['dt_emissao'=>'2025-05-02','nm_remedio'=>'Dramin','nm_medico'=>'Aimee Alves','posologia'=>'1x antes de dormir']);
        Receita::create(['dt_emissao'=>'2025-05-03','nm_remedio'=>'Vonal','nm_medico'=>'Alice Gandra','posologia'=>'Se ficar enjoado']);
    }
}