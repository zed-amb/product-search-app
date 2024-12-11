package com.zola.service;

import com.zola.entity.Metro;
import com.zola.repository.MetroRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class MetroService {
    private final MetroRepository metroRepository;

    public MetroService(MetroRepository metroRepository) {
        this.metroRepository = metroRepository;
    }

    public List<Metro> getAllMetros() {
        return metroRepository.findAll();
    }

    public Metro getMetroById(Long metroId) {
        return metroRepository.findById(metroId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Metro not found with ID: " + metroId));
    }
}
