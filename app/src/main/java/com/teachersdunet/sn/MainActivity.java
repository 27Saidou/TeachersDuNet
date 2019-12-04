package com.teachersdunet.sn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//creation des variable
    int compteur;
    Button ajouter,supprimer;
    TextView afficheur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.copines);
        compteur=3;
        ajouter=(Button)findViewById(R.id.bNewCopine);
        supprimer=(Button)findViewById(R.id.bNewEx);
        afficheur=(TextView)findViewById(R.id.tvAfficheur);
    }

    public void addCopine(View v){
        compteur ++;
        afficheur.setText("Vous avez " + compteur + "  copines actu");

    }
    public  void delCopine(View v){
        if (compteur !=0){
            compteur--;
        }
        afficheur.setText("Vous avez  " + compteur + "  copines actu");

    }
}
