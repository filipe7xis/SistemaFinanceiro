package br.com.filipe.sistemafinanceiropizzaria.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Compra {

    private int id;
    private Produto produto;
    private int quantidade;
    private BigDecimal valorUnitario;
    private LocalDate data;
    private LocalTime hora;
    private Usuario usuarioResponsavel;
}
