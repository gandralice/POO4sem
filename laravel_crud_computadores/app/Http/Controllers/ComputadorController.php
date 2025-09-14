<?php

namespace App\Http\Controllers;

use App\Models\Computador; // [cite: 337]

use Illuminate\Http\Request;

class ComputadorController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        return view('computador.index')->with('ComputadorCollection', Computador::all()); // [cite: 355]
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        return view('computador.create');
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        Computador::create($request->all());
        return redirect('/computadores');
    }

    /**
     * Display the specified resource.
     */
    public function show(Computador $computadore)
    {
        return view('computador.show')->with('objetoComputador', $computadore);
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(Computador $computadore)
    {
        return view('computador.edit')->with('objetoComputador', $computadore);
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Computador $computadore)
    {
        $computadore->update($request->all());
        return redirect('/computadores');
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Computador $computadore)
    {
        $computadore->delete();
        return redirect('/computadores');
    }
}
