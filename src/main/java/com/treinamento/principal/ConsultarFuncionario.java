package com.treinamento.principal;


import com.treinamento.dao.JPAUtil;
import com.treinamento.model.Cliente;
import com.treinamento.model.Funcionario;

import javax.persistence.EntityManager;
import java.util.List;

public class ConsultarFuncionario {
    public static void main(String[] args) {

        EntityManager manager = JPAUtil.getEntityManager();

        List<Funcionario> funcionarios = manager.createQuery("from Funcionario",
                Funcionario.class).getResultList();
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome() + " - " + funcionario.getCargo()+" - "+funcionario.getSalario());
        }


        manager.close();
        JPAUtil.close();



    }
}
