package mypackage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import mypackage.managers.JokeManager;
import mypackage.models.Joke;

@Controller
public class JokesController {

    private JokeManager jokeManager;

    @GetMapping("/downvote/{jokeId}")
    public String downvoteJoke(@PathVariable int jokeId, Model model) {
        jokeManager.downvoteJoke(jokeId);
        model.addAttribute("joke", jokeManager.getRandomJoke());

        return "jokePage";
    }

    @GetMapping("/upvote/{jokeId}")
    public String upvoteJoke(@PathVariable int jokeId, Model model) {
        jokeManager.upvoteJoke(jokeId);
        model.addAttribute("joke", jokeManager.getRandomJoke());

        return "jokePage";
    }

    @GetMapping({"/", ""})
    public String getRandomJoke(Model model) {
        model.addAttribute("joke", jokeManager.getRandomJoke());

        return "jokePage";
    }

    @PostMapping("submitJoke/")
    public String submitJoke(@RequestBody Joke joke) {
        joke.setVotes(0);
        this.jokeManager.saveJoke(joke);

        return "jokeSubmitted";
    }

    @Autowired
    public void setJokeManager(JokeManager jokeManager) {
        this.jokeManager = jokeManager;
    }
}
