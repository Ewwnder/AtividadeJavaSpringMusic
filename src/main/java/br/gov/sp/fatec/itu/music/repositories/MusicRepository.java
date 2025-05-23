package br.gov.sp.fatec.itu.music.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.itu.music.entities.Music;

public interface MusicRepository extends JpaRepository<Music, Long>{

}
