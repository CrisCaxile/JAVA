package com.mycompany.resolucaotela;

import java.awt.Toolkit;


public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        System.out.println("A resolução de tela atual é ");
        System.out.println(resolucao.getScreenSize());
    }
}