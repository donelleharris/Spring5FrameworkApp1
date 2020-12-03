package com.donelleharris.spring5webapp.repos;

import com.donelleharris.spring5webapp.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
