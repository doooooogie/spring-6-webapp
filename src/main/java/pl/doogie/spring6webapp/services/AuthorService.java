package pl.doogie.spring6webapp.services;

import pl.doogie.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
