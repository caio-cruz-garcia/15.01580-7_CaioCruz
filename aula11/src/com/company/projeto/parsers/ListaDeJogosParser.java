package com.company.projeto.parsers;

import com.company.projeto.model.Jogo;
import com.company.projeto.model.ListaDeJogos;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ListaDeJogosParser {
    public static JSONArray toJson(ListaDeJogos lista){
        JSONArray json = new JSONArray();
        lista.getJogos().forEach( jogo -> {
            json.put(JogoParser.toJson(jogo));
        });
        return json;
    }

    public static ListaDeJogos fromJson(JSONArray json){
        ListaDeJogos lista = new ListaDeJogos();
        json.forEach( item -> {
            lista.addJogo(JogoParser.fromJson((JSONObject) item));
        });
        return lista;
    }
}
