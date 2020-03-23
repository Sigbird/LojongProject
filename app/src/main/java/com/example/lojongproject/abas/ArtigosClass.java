package com.example.lojongproject.abas;

import android.graphics.drawable.Drawable;
import android.media.Image;

public class ArtigosClass {

    private  String Titulo;
    private  String Descricao;
    private int imagem;

    public  ArtigosClass(){

    }

    public ArtigosClass(String titulo, String descricao, int imagem) {
        Titulo = titulo;
        Descricao = descricao;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }


}
