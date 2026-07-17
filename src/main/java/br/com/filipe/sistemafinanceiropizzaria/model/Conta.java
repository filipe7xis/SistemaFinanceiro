package br.com.filipe.sistemafinanceiropizzaria.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Conta {

    private int id;
    private String nomeConta;
    private BigDecimal valor;
    private LocalDate vencimento;
    private boolean paga;
    private LocalDate dataPagamento;

}
