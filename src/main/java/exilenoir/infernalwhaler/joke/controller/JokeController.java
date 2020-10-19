package exilenoir.infernalwhaler.joke.controller;

import exilenoir.infernalwhaler.joke.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ExileNoir
 * @project infernalWhaler-joke-app
 * @date 19/10/2020
 */
@Controller
public class JokeController {

    private final JokeService jokeService;

    @Autowired
    public JokeController(final JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(final Model model) {
        model.addAttribute("joke", jokeService.getJokes());

        return "chucknorris";
    }
}
