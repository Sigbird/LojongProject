package com.example.lojongproject.abas;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import com.example.lojongproject.PlayerActivity;
import com.example.lojongproject.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideosFragment extends Fragment {


    private  String[] itens = {"a","b"};
    private List<ArtigosClassVideo> listaArtigos = new ArrayList<>();


    public VideosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_videos, container, false);

        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.listaview);

        CriarArtigos();



        //Adapter adapter = new Adapter(listaArtigos);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

       recyclerView.setAdapter(new Adapter(listaArtigos, new Adapter.OnItemClickListener() {
           @Override
           public void onItemClick(ArtigosClassVideo artigo) {
               Intent intent = new Intent(root.getContext(), PlayerActivity.class);
                intent.putExtra("EXTRA_VIDEO_ID", artigo.getVideoId());
                startActivity(intent);
           }
       }));



       // RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        //listVideos = root.findViewById(R.id.listaview);

      //  ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
      //          root.getContext(),
       //         android.R.layout.simple_list_item_1,
       //         android.R.id.text1,
       //         itens
      //  );

        //listVideos.setAdapter(adaptador);

        // Inflate the layout for this fragment


        return root;
    }



    public  void CriarArtigos(){

        ArtigosClassVideo artigo =  new ArtigosClassVideo("Felicidade genuína","O que é felicidade genuína e como podemos cultiva-la? E como confundimos prazer com felicidade?", R.drawable.img_artboardbeach,1);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClassVideo("Ciência e Meditação","Saiba mais sobre as pesquisas científicas dos efeitos da meditação e como funciona este treino da mente.", R.drawable.img_artboardmetidation,2);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClassVideo("A prática da meditação","O objetivo da meditação é nos fazer ver a realidade como ela é. Mas como fazemos isso?", R.drawable.vid_apraticadameditacao,3);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClassVideo("O que é Atenção Plena?","Você vive no \\\"momento presente\\\"? O que é mindfulness e por que isto é indispensável a meditação?", R.drawable.vid_atencaoplena,4);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClassVideo("Os tipos de meditação","Quais são os tipos de meditação e qual o propósito de cada prática?", R.drawable.vid_ostiposdeme,5);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClassVideo("Introdução ao Lojong","Meditar é cultivar um estado mental. É um treino. Como o Lojong pode ajudar a dar inicio a este treinamento?", R.drawable.vid_introducao,6);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClassVideo("O que é Equilíbrio Conativo?","Módulo do \\\"Programa CEB\\\". Alinhamos as nossas intenções a cultivar qualidades que nos conduzirão a felicidade genuína.", R.drawable.vid_conativo,7);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClassVideo("Equilíbrio da Atenção","Módulo do \\\"Programa CEB\\\". Treinamos a capacidade de direcionar e manter a atenção num objeto à nossa escolha.", R.drawable.vid_atencao,8);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClassVideo("O que é Equilíbrio Afetivo?","Módulo do \\\"Programa CEB\\\". Exercícios para melhorar a qualidade das nossas relações.", R.drawable.vid_afetivo,9);
        this.listaArtigos.add(artigo);

        artigo =  new ArtigosClassVideo("O que é Equilíbrio Cognitivo?","Módulo do \\\"Programa CEB\\\". Perceber da forma mais clara possível a realidade, identificando o papel do observador.", R.drawable.vid_cognitivo,10);
        this.listaArtigos.add(artigo);

    }

}
