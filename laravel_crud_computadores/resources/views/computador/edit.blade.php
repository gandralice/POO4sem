@extends('base')
@section('conteudo')
    <form action="/computadores/{{$objetoComputador->id}}" method="post">
        @method('put')
        @csrf
        <p>Marca: <input type="text" name="marca" value="{{$objetoComputador->marca}}" /></p> [cite: 602]
        <p>Preço: <input type="number" name="preco" step="0.01" value="{{$objetoComputador->preco}}" /></p> [cite: 604]
        <p>RAM: <input type="number" name="ram" value="{{$objetoComputador->ram}}" /></p> [cite: 606]
        <p>Disco: <input type="number" name="disco" value="{{$objetoComputador->disco}}" /></p>
        <p>
            <input type="submit" value="Enviar" />
            <a href="/computadores">Voltar</a>
        </p>
    </form>
@endsection