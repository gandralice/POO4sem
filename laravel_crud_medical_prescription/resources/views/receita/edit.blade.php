@extends('base')

@section('conteudo')
    
    <form action="{{ route('receitas.update', $objetoReceita->id) }}" method="POST">
        @method('PUT') <!-- Isso faz o Laravel tratar como um PUT -->
        @csrf
        <p>DtEmissão: <input type="date" name="dt_emissao" value="{{ old('dt_emissao', $objetoReceita->dt_emissao) }}" /></p>
        @if($errors->has('dt_emissao'))
            <p>{{ $errors->first('dt_emissao') }}</p>
        @endif

        <p>Remédio: <input type="text" name="nm_remedio" value="{{ old('nm_remedio', $objetoReceita->nm_remedio) }}" /></p>
        @if($errors->has('nm_remedio'))
            <p>{{ $errors->first('nm_remedio') }}</p>
        @endif

        <p>Médico: <input type="text" name="nm_medico" value="{{ old('nm_medico', $objetoReceita->nm_medico) }}" /></p>
        @if($errors->has('nm_medico'))
            <p>{{ $errors->first('nm_medico') }}</p>
        @endif

        <p>Posologia: <input type="text" name="posologia" value="{{ old('posologia', $objetoReceita->posologia) }}" /></p>
        @if($errors->has('posologia'))
            <p>{{ $errors->first('posologia') }}</p>
        @endif

        <p>
            <input type="submit" value="Enviar" />
            <a href="{{ route('receitas.index') }}">Voltar</a>
        </p>
    </form>
@endsection
