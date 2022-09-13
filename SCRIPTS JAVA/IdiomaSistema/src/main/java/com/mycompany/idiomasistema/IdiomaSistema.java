package com.mycompany.idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("O idiota do sistema é ");
        System.out.println(idioma.toString());
    }
}