@extends('base')

@section('conteudo')
<div class="container mt-4">
    <h2 class="mb-4">Lista de Receitas</h2>

    <a href="{{ url('/receitas/create') }}" class="btn btn-primary mb-3">Novo</a>

    <table class="table table-bordered table-striped">
        <thead>
            <tr>
                <th>DtEmissao</th>
                <th>Remédio</th>
                <th>Medico</th>
                <th>Posologia</th>
                <th>Ações</th>
            </tr>
        </thead>
        <tbody>
            @foreach($ReceitaCollection as $receita)
            <tr>
                <td>{{ $receita->dt_emissao }}</td>
                <td>{{ $receita->nm_remedio}}</td>
                <td>{{ $receita->nm_medico }}</td>
                <td>{{ $receita->posologia }}</td>
                <td>
                    <a href="{{ url('/receitas/'.$receita->id.'/edit') }}" class="btn btn-sm btn-warning">Editar</a>
                    <a href="{{ url('/receitas/'.$receita->id) }}" class="btn btn-sm btn-danger"
                       onclick="return confirm('Tem certeza que deseja excluir?')">Excluir</a>
                </td>
            </tr>
            @endforeach
        </tbody>
    </table>

    <!-- Paginação -->
    <div class="d-flex justify-content-center">
        {{ $ReceitaCollection->links() }}
    </div>
</div>
@endsection