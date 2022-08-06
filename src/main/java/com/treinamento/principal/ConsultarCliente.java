package com.treinamento.principal;


import com.treinamento.dao.JPAUtil;
import com.treinamento.model.Cliente;

import javax.persistence.EntityManager;
import java.util.List;

public class ConsultarCliente {
    public static void main(String[] args) {

        EntityManager manager = JPAUtil.getEntityManager();

        List<Cliente> clientes = manager.createQuery("from Cliente",
                Cliente.class).getResultList();
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome() + " - " + cliente.getRendaMensal());
        }


        manager.close();
        JPAUtil.close();



    }
}
