package cl.desafiolatam.pokemon.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import cl.desafiolatam.pokemon.R;
import cl.desafiolatam.pokemon.model.Pokedex;
import cl.desafiolatam.pokemon.model.Pokemon;

public class PokeAdapter extends RecyclerView.Adapter<PokeAdapter.PokeVH> {

    public List<Pokemon> pokemonList;

    public PokeAdapter(List<Pokemon> pokeList) {
        pokemonList = pokeList;
    }

    @NonNull
    @Override
    public PokeAdapter.PokeVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_pokemon, parent, false);
        return new PokeVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PokeAdapter.PokeVH holder, int position) {
        //Dada una posisición en la lista, asignar la información al ViewHolder
        Pokemon pokemon = pokemonList.get(position);

        //Asignar la información a las vistas del ViewHolder
        holder.bind(pokemon);
    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }


    public class PokeVH extends RecyclerView.ViewHolder {
        private ImageView imgPoke;
        private TextView tvId;
        private TextView tvName;
        //private TextView tvCategoria;

        public PokeVH(@NonNull View itemView) {
            super(itemView);
            imgPoke = itemView.findViewById(R.id.imgPokemon);
            tvId = itemView.findViewById(R.id.tvId);
            tvName = itemView.findViewById(R.id.tvNombre);
            //tvCategoria = itemView.findViewById(R.id.tvCategoria);
        }

        public void bind(@NonNull Pokemon pokemon) {
            Picasso.get().setIndicatorsEnabled(true);
            Picasso.get().load(pokemon.getImageSrc()).resize(100,100).into(imgPoke);
            tvId.setText(pokemon.getId());
            tvName.setText(pokemon.getName());
            //tvCategoria.setLabelFor(pokemon.getLabels());
        }
    }
}
