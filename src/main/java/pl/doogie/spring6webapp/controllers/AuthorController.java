package pl.doogie.spring6webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.doogie.spring6webapp.services.AuthorService;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/authors")
    public String getBooks(Model model) {
        model.addAttribute("authors", authorService.findAll());
        return "authors";
    }
}
