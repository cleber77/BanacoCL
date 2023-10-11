package com.cleber.bocodenota;

import android.content.Context;
import android.content.SharedPreferences;

public  class AnotacaoPreferencia {

    private Context context;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    private  final String NOME_ARQUIVO = "anotacao.preferencia";
    private  final String CHAVE_NOME = "nome";

    public AnotacaoPreferencia( Context c ) {
         this.context = c;
         preferences= context.getSharedPreferences(NOME_ARQUIVO,0);
         editor = preferences.edit();
    }

    public  void  salvaAnotacao(String anotacao){
        editor.putString(CHAVE_NOME,anotacao);
        editor.commit();


    }

     public  void recupraAnotacao(){


     }
}