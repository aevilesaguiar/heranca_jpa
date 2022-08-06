package com.treinamento.principal;

import javax.persistence.Persistence;

public class CriarTabela {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("heranca_pessoa");
    }
}
