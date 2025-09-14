<?php

namespace App\Http\Controllers;

use App\Models\Receita;
use Illuminate\Http\Request;
use App\Http\Requests\ReceitaRequest;


class ReceitaController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        return View('receita.index')->with('ReceitaCollection',Receita::paginate(6));
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        return View('receita.create');
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(ReceitaRequest $request)
    {
        Receita::create($request->all());
        return redirect('/receitas');
    }

    /**
     * Display the specified resource.
     */
    public function show(Receita $receita)
    {
        return view('receita.show')->with('objetoReceita', $receita);
    }

    public function edit(Receita $receita)
    {
        //dd($receitas); 
        return view('receita.edit')->with('objetoReceita', $receita);
    }


    /**
     * Update the specified resource in storage.
     */
    public function update(ReceitaRequest $request, Receita $receita)
    {
        $receita->update($request->all());
        return redirect('/receitas');
    }



    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Receita $receita)
    {
        $receita->delete();
        return redirect('/receitas');
    }
}
