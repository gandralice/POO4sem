<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class ReceitaRequest extends FormRequest
{
    public function authorize(): bool
    {
        return true;
    }

    public function rules(): array
    {
        return [
            'dt_emissao' => 'required|date',
            'nm_remedio' => 'required|max:100',
            'nm_medico' => 'required|max:100',
            'posologia' => 'required|max:200',
        ];
    }
    public function messages(): array
    {
        return [
            'dt_emissao.*' => 'Data é obrigatória',
            'nm_remedio.*' => 'Remédio obrigátorio',
            'nm_medico.*' => 'Médico obrigátorio',
            'posologia.*' => 'Posologia obrigátorio',
        ];
    }
}
