package br.com.alura.geradordefrases.dto;

public record FraseDTO(Long id,
                       String titulo,
                       String frase,
                       String personagem,
                       String poster) {
}
