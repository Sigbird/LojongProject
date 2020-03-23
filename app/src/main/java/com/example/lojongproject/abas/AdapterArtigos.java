package com.example.lojongproject.abas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lojongproject.R;

import java.util.List;

public class AdapterArtigos extends RecyclerView.Adapter<AdapterArtigos.MyViewHolder> {

    private  List<ArtigosClass> listaArtigos;

    public AdapterArtigos(List<ArtigosClass> artigos) {

        this.listaArtigos = artigos;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listview_artigos, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            ArtigosClass artigo = listaArtigos.get(position);


            holder.titulo.setText(artigo.getTitulo());
            holder.descricao.setText(artigo.getDescricao());
            holder.imagem.setImageResource(artigo.getImagem());
            holder.botaoshare.setImageResource(R.drawable.bt_sharewhite);
    }

    @Override
    public int getItemCount() {
        return listaArtigos.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titulo;
        TextView descricao;
        ImageView imagem;
        ImageView botaoshare;

        public MyViewHolder(View itemView){
            super(itemView);

            titulo = itemView.findViewById(R.id.textViewTitle);
            descricao = itemView.findViewById(R.id.textViewDescription);
            imagem = itemView.findViewById(R.id.main_image);
            botaoshare = itemView.findViewById(R.id.button_share);
        }

    }
}
