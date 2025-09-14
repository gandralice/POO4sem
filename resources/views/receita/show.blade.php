@extends('base')
@section('conteudo')
<dl>
    <dt>DtEmissão</dt>
    <dd>{{$objetoReceita->dt_emissao}}</dd>
    <dt>Remédio</dt>
    <dd>{{$objetoReceita->nm_remedio}}</dd>
    <dt>Médico</dt>
    <dd>{{$objetoReceita->nm_medico}}</dd>
    <dt>Posologia</dt>
    <dd>{{$objetoReceita->posologia}}</dd>
</dl>
<form action="/receitas/{{$objetoReceita->id}}" method="post">
    @csrf
    @method('delete')
        
        <input type="submit" value="Enviar" />
        <a href="/receitas">Voltar</a>
        
</form>
@endsection