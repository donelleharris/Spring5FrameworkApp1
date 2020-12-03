package com.donelleharris.spring5webapp.repos;

import com.donelleharris.spring5webapp.models.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
