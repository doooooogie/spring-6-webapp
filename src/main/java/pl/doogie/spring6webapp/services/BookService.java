package pl.doogie.spring6webapp.services;

import pl.doogie.spring6webapp.domain.Book;

public interface BookService  {

    Iterable<Book> findAll();
}
