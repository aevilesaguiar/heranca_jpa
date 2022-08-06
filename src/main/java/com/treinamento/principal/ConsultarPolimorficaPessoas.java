package com.treinamento.principal;


import com.treinamento.dao.JPAUtil;
import com.treinamento.model.Cliente;
import com.treinamento.model.Pessoa;

import javax.persistence.EntityManager;
import java.util.List;

public class ConsultarPolimorficaPessoas {
    public static void main(String[] args) {

        EntityManager manager = JPAUtil.getEntityManager();

        List<Pessoa> pessoas = manager.createQuery("from Pessoa",
                Pessoa.class).getResultList();
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());

            if(pessoa instanceof  Cliente){
                System.out.println(" - é um cliente");
            }else {
                System.out.println(" - é um fornecdor");
            }
        }


        manager.close();
        JPAUtil.close();



    }
}
