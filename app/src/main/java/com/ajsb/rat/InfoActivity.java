package com.ajsb.rat;

/**
 * Programación Multimedia y de Dispositivos Móviles
 * Race Against Time
 */

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InfoActivity extends AppCompatActivity
{
    @BindView(R.id.butBack)
    public Button button ;

    @BindView(R.id.limite)
    public EditText limite ;

    /**
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ButterKnife.bind(this) ;

        SharedPreferences sp = getSharedPreferences("com.ajsb.rat.configuracion", Context.MODE_PRIVATE) ;
        Integer limit = sp.getInt("limite", 0) ;

        //Bundle bundle = getIntent().getExtras().getBundle("info") ;
        //limite.setText(String.valueOf(bundle.getInt("limite")));
        //limite.setText(String.valueOf(getIntent().getExtras().getInt("limite"))) ;

        limite.setText(String.valueOf(limit)) ;

        // Regresamos a la actividad anterior al pulsar el botón
        button.setOnClickListener((v) ->
        {
            Integer l = Integer.parseInt(limite.getText().toString()) ;
            sp.edit().putInt("limite", l).apply() ;

            setResult(66) ;
            finish() ;
            return ;
        }) ;
    }

    /**
     */
    @Override
    public void onBackPressed() { }
}