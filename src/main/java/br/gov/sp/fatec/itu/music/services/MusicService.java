package br.gov.sp.fatec.itu.music.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.itu.music.entities.Music;
import br.gov.sp.fatec.itu.music.repositories.MusicRepository;
import jakarta.persistence.EntityNotFoundException;

@Service   
public class MusicService {

    @Autowired
    private MusicRepository repository;

    public List<Music> getAll(){
        return repository.findAll();
    }

    public Music save(Music music){
        return repository.save(music);
    }

    public void update(Music music, long id){
        Music aux = repository.getReferenceById(id);
        aux.setAlbum(music.getAlbum());
        aux.setCantor(music.getCantor());
        aux.setGenero(music.getGenero());
        aux.setNome(music.getNome());

        repository.save(aux);
    }

    public void delete(long id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        }
        else{
            throw new EntityNotFoundException("Aluno não cadastrado!");
        }
    }
    
}
