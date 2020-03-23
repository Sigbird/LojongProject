package com.example.lojongproject.abas;

import android.net.Uri;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lojongproject.MainActivity;
import com.example.lojongproject.R;

import org.w3c.dom.Document;

import java.util.List;
import java.util.Set;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(ArtigosClassVideo artigo);
    }

    private  List<ArtigosClassVideo> listaArtigos;
    private  OnItemClickListener listener;

    public Adapter(List<ArtigosClassVideo> artigos, OnItemClickListener listener) {

        this.listaArtigos = artigos;
        this.listener = listener;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listview_videos, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ArtigosClassVideo artigo = listaArtigos.get(position);

            holder.bind(listaArtigos.get(position),listener);

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
        Integer videoid;

        public MyViewHolder(View itemView){
            super(itemView);

            titulo = itemView.findViewById(R.id.textViewTitle);
            descricao = itemView.findViewById(R.id.textViewDescription);
            imagem = itemView.findViewById(R.id.main_image);
            botaoshare = itemView.findViewById(R.id.button_share);

        }

        public  void bind (final ArtigosClassVideo artigo , final OnItemClickListener listener){
            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                   listener.onItemClick(artigo);
                }
            });
        }

    }
}
