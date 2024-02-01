package com.gestionEtude.demo.Repository;

import com.gestionEtude.demo.Entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepo extends JpaRepository<Note,Long> {
}
