@extends('base')

@section('conteudo')
    <form action="/computadores" method="post">
        @csrf <p>Marca: <input type="text" name="marca" /></p>
        <p>Preço: <input type="number" name="preco" step="0.01" /></p>
        <p>RAM: <input type="number" name="ram" /></p>
        <p>Disco: <input type="number" name="disco" /></p>
        <p>
            <input type="submit" value="Enviar" />
            <a href="/computadores">Voltar</a>
        </p>
    </form>
@endsection