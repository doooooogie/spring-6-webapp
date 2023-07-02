package pl.doogie.spring6webapp.services;

import org.springframework.stereotype.Service;
import pl.doogie.spring6webapp.domain.Author;
import pl.doogie.spring6webapp.repositories.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
