package br.com.filipe.sistemafinanceiropizzaria.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Venda {

    private int id;
    private Usuario usuarioResponsavel;
    private BigDecimal valorTotal;
    private String formaPagamento;
    private LocalDate data;
    private LocalTime hora;

}
