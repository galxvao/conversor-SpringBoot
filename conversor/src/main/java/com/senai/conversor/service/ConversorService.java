package com.senai.conversor.service;

import com.senai.conversor.dto.RequisicaoDto;
import com.senai.conversor.dto.RespostaDto;
import org.springframework.stereotype.Service;

@Service
public class ConversorService {

    public RespostaDto Conversao (RequisicaoDto dados){

        RespostaDto resposta = new RespostaDto();

        int resultadoConversao = 0;

        switch (dados.getTipoConversao()){

            case "cm-m":
                resultadoConversao = dados.getValor() / 100;
                break;
            case  "m-cm":
                resultadoConversao = dados.getValor() * 100;
                break;
            case "kg-g":
                resultadoConversao = dados.getValor() * 1000;
                break;
            case "g-kg":
                resultadoConversao = dados.getValor() / 1000;
            case "c-f":
                resultadoConversao = ((dados.getValor() * 9 / 5) + 32);
                break;
            case "f-c":
                resultadoConversao = ((dados.getValor() - 32) * 5 / 9);
                break;
            default:
                throw new IllegalArgumentException("Conversão Inválida");
        }

        resposta.setValorOriginal(dados.getValor());
        resposta.setTipoConversao(dados.getTipoConversao());
        resposta.setValorConvertido(resultadoConversao);

            return resposta;
    }
}
