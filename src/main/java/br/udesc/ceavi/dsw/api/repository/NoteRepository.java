package br.udesc.ceavi.dsw.api.repository;

import br.udesc.ceavi.dsw.api.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */
public interface NoteRepository extends JpaRepository<Note, Long> {

}
