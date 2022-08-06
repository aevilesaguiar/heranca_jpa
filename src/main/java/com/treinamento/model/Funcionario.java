package com.treinamento.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@DiscriminatorValue("F")
public class Funcionario extends Pessoa {

    @Column(nullable = true)
    private BigDecimal salario;
    @Column(length = 60, nullable = true)
    private String cargo;



    public Funcionario() {

    }



    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
