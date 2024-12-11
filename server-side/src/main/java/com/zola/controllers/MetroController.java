package com.zola.controllers;

import com.zola.entity.Metro;
import com.zola.service.MetroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/metro")
public class MetroController {
    private final MetroService metroService;

    public MetroController(MetroService metroService) {
        this.metroService = metroService;
    }

    @GetMapping
    public ResponseEntity<List<Metro>> getAllMetros() {
        return ResponseEntity.ok(metroService.getAllMetros());
    }
}
