package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import java.util.HashMap;
import java.util.Map;

public class ColumnHandler {

    private List<String> colonne1;
    private List<String> colonne2;
    private List<String> colonne3;

    public List<String> getColonne1() {
        return colonne1;
    }

    public void setColonne1(List<String> colonne1) {
        this.colonne1 = colonne1;
    }

    public List<String> getColonne2() {
        return colonne2;
    }

    public void setColonne2(List<String> colonne2) {
        this.colonne2 = colonne2;
    }

    public List<String> getColonne3() {
        return colonne3;
    }

    public void setColonne3(List<String> colonne3) {
        this.colonne3 = colonne3;
    }

    public Map<String, Integer> linkPositionToGain() {
        Map<String, Integer> values = new HashMap<>();

        values.put("7", 300);
        values.put("BAR", 100);
        values.put("R", 15);
        values.put("P", 15);
        values.put("T", 15);
        values.put("C", 8);

        return values;
    }

    public void deserializeColumns() {

        String json = "["
                + "[\"7\", \"C\", \"BAR\", \"T\", \"P\", \"7\", \"C\", \"BAR\", \"T\", \"R\", \"7\", \"C\", \"BAR\", \"R\", \"P\"],"
                + "[\"7\", \"P\", \"C\", \"T\", \"R\", \"BAR\", \"C\", \"T\", \"R\", \"C\", \"BAR\", \"P\", \"T\", \"C\", \"R\"],"
                + "[\"7\", \"BAR\", \"T\", \"P\", \"C\", \"R\", \"T\", \"P\", \"C\", \"R\", \"T\", \"P\", \"C\", \"R\", \"T\"]"
                + "]";

        Gson gson = new Gson();
        Type listType = new TypeToken<List<List<String>>>() {}.getType();
        List<List<String>> allColumns = gson.fromJson(json, listType);


        setColonne1(allColumns.get(0));
        setColonne2(allColumns.get(1));
        setColonne3(allColumns.get(2));
    }







}
