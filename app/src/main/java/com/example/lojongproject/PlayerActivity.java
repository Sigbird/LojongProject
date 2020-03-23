package com.example.lojongproject;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    VideoView videoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        Integer sessionId = getIntent().getIntExtra("EXTRA_VIDEO_ID",1);
        videoView = findViewById(R.id.videoView);

        String path1 = VideoChooser(sessionId);

        Uri uri=Uri.parse(path1);
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(uri);
        videoView.start();

    }


    public String VideoChooser(int videoid){

        String path1;

        switch (videoid){
            case 1:
                path1="https://d35mkqei6qg744.cloudfront.net/pt/videos/1felicidadegenuina.mp4";
                break;
            case 2:
                path1="https://d35mkqei6qg744.cloudfront.net/pt/videos/2cienciaemeditacao.mp4";
                break;
            case 3:
                path1="https://d35mkqei6qg744.cloudfront.net/pt/videos/3praticadameditacao.mp4";
                break;
            case 4:
                path1="https://d35mkqei6qg744.cloudfront.net/pt/videos/4atencaoplena.mp4";
                break;
            case 5:
                path1="https://d35mkqei6qg744.cloudfront.net/pt/videos/5tiposdemeditacao.mp4";
                break;
            case 6:
                path1="https://d35mkqei6qg744.cloudfront.net/pt/videos/6introlojong.mp4";
                break;
            case 7:
                path1="https://d35mkqei6qg744.cloudfront.net/pt/videos/7equilibrioconativo.mp4";
                break;
            case 8:
                path1="https://d35mkqei6qg744.cloudfront.net/pt/videos/8equilibriodaatencao.mp4";
                break;
            case 9:
                path1="https://d35mkqei6qg744.cloudfront.net/pt/videos/9equilibrioafetivo.mp4";
                break;
            case 10:
                path1="https://d35mkqei6qg744.cloudfront.net/pt/videos/10equilibriocognitivo.mp4";
                break;
            default:
                path1="https://d35mkqei6qg744.cloudfront.net/pt/videos/1felicidadegenuina.mp4";
                break;
        }
        return  path1;
    }
}
