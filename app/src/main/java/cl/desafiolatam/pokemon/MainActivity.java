package cl.desafiolatam.pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import cl.desafiolatam.pokemon.model.Pokedex;
import cl.desafiolatam.pokemon.views.PokeAdapter;


/* TODO
/******************************************************************************************************
* Crear Packages
* [X] Crear package views --> Para el adaptador
* [X] Crear package model --> Para los Pojos
* POJOS
* 1 [X] Creación de POJOs --> Pokemon
* 2 [X] Fuente de Datos --> Pokedex
* Adaptador
* 3 [X] Crear la clase publica Adapter que extiende RecyclerView.Adapter
* 7 [X] Implementar el método abstracto onCreateViewHolder
* 9 [X] Implementar el método abstracto onBindViewHolder
* 13 [X] Implementar el método abstracto gerItemCount
* 10 [X] Agregar el constructor que reciba los datos
*  ViewHolder
* 6 [X] Layout para el ViewHolder --> En este caso sólo 1 porqu sólo hay 1 tipo de dato (1 ViewHolder
* 4 [X] Extender la clase RecyclerView con el adaptador
* 5 [X] Crear el constructor que llame a la superclase
* 11 [X] Crear e instancias cada vista del ViewHolder
* 12 [X] Crear el metódo Bind quye reciba la información y actualice las vistas
* MainActivity (RecyclerView)
* 8 [X] Crear una instancia de adapter con un constructor que reciba la lista de pokemones
* 14 [X] Layout que incluye el RecyclerView
* 15 [X] Instancias el adapter con los datos
* 16 [X] Enlaxzar en el código el RecyclerView con el adpatador
* 17 [X] Enlazar el RecyclerView con el Layout
* Imagenes URL
* [X] Activar permisos de Internet en el manifest
* [X] Añadir implementation Picasso en gradle del módulo
* [X] Añadir picasso.get().load(pokemon.getImageSrc()).resize(100, 100).into(imgPokemon) en Adaptador
* [X]
 ******************************************************************************************************/
public class MainActivity extends AppCompatActivity {

    private RecyclerView pokeRecycler;
    private PokeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pokeRecycler = findViewById(R.id.rvPokemon);
        adapter = new PokeAdapter(Pokedex.getPokelist());
        if (pokeRecycler != null) {
            LinearLayoutManager manager = new LinearLayoutManager(this);
            pokeRecycler.setLayoutManager(manager);
            pokeRecycler.setAdapter(adapter);
        }
    }
}