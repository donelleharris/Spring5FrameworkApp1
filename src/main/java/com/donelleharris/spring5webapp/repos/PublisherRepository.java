package com.donelleharris.spring5webapp.repos;

import com.donelleharris.spring5webapp.models.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
