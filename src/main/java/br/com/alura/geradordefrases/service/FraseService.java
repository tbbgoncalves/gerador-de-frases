package br.com.alura.geradordefrases.service;

import br.com.alura.geradordefrases.dto.FraseDTO;
import br.com.alura.geradordefrases.model.Frase;
import br.com.alura.geradordefrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository fraseRepository;

    public FraseDTO obterFrase() {
        Frase frase = fraseRepository.obterFrase();

        return new FraseDTO(frase.getId(), frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
