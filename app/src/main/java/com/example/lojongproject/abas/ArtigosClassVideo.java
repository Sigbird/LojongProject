package com.example.lojongproject.abas;

public class ArtigosClassVideo {

    private  String Titulo;
    private  String Descricao;
    private int imagem;
    private int videoId;

    public ArtigosClassVideo(){

    }

    public ArtigosClassVideo(String titulo, String descricao, int imagem, int videoid) {
        Titulo = titulo;
        Descricao = descricao;
        this.imagem = imagem;
        this.videoId = videoid;
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

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoid) {
        this.videoId = videoid;
    }

}
