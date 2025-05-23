package br.gov.sp.fatec.itu.music.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.itu.music.entities.Music;
import br.gov.sp.fatec.itu.music.services.MusicService;

@RestController
@RequestMapping("music")
public class MusicController {
    
    @Autowired
    private MusicService service;

    @GetMapping
    public ResponseEntity<List<Music>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<Music> save(@RequestBody Music music){
        return ResponseEntity.created(null).body(service.save(music));
    }
}
