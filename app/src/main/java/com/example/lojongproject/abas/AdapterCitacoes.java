package com.example.lojongproject.abas;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lojongproject.R;

import java.util.List;

public class AdapterCitacoes extends RecyclerView.Adapter<AdapterCitacoes.MyViewHolderCitacao> {

    public interface OnItemClickListener {
        void onItemClick(ArtigosClass artigo);
    }

    private List<ArtigosClass> listaArtigos;
    private OnItemClickListener listener;

    public AdapterCitacoes(List<ArtigosClass> artigos ,OnItemClickListener listener) {

        this.listaArtigos = artigos;
        this.listener = listener;

    }

    @NonNull
    @Override
    public MyViewHolderCitacao onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listview_citacoes, parent, false);

        return new MyViewHolderCitacao(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderCitacao holder, int position) {
        ArtigosClass artigo = listaArtigos.get(position);

        holder.bind(listaArtigos.get(position),listener);

        holder.titulo.setText(artigo.getTitulo());
        holder.descricao.setText(artigo.getDescricao());
        holder.imagem.setImageResource(artigo.getImagem());


    }


    @Override
    public int getItemCount() {
        return listaArtigos.size();
    }

    public class MyViewHolderCitacao extends RecyclerView.ViewHolder{

        TextView titulo;
        TextView descricao;
        ImageView imagem;



        public MyViewHolderCitacao(View itemView){
            super(itemView);

            titulo = itemView.findViewById(R.id.textViewTitle);
            descricao = itemView.findViewById(R.id.textViewDescription);
            imagem = itemView.findViewById(R.id.main_image);

        }

        public  void bind (final ArtigosClass artigo , final OnItemClickListener listener){
            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    listener.onItemClick(artigo);
                }
            });
        }

    }
}
