<?php
namespace App\Models;

use Illuminate\Database\Eloquent\Model;

class Receita extends Model
{
    // Defina o nome da tabela
    protected $table = 'receitas';  // Se a tabela se chama 'receitas'

    // Defina os campos que são preenchíveis (fillable)
    protected $fillable = [
        'dt_emissao', 'nm_remedio', 'nm_medico', 'posologia'
    ];

    // Caso tenha timestamps no banco, você pode deixar o Eloquent gerenciar automaticamente.
    public $timestamps = true;
}
