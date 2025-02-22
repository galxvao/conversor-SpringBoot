package com.senai.conversor.dto;

import lombok.Data;

@Data
public class RespostaDto {
    private Integer valorOriginal;
    private String tipoConversao;
    private Integer valorConvertido;
}
