package mypackage.managers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import mypackage.models.Joke;
import mypackage.repositories.JokeRepository;

public class JokeManager {
    private static JokeManager jokeManager;

    private JokeRepository jokeRepository;

    private JokeManager() {
    }

    public static JokeManager getInstance() {
        if (jokeManager == null) {
            jokeManager = new JokeManager();
        }
        return jokeManager;
    }

    @Autowired
    public void setJokeRepository(JokeRepository jokeRepository) {
        this.jokeRepository = jokeRepository;
    }

    public Joke getRandomJoke() {
        Iterator<Joke> allJokes = jokeRepository.findAll().iterator();
        ArrayList<Joke> allJokesArrayList = new ArrayList<>();
        while (allJokes.hasNext()) {
            allJokesArrayList.add(allJokes.next());
        }

        Random random = new Random();
        return allJokesArrayList.get(random.nextInt(allJokesArrayList.size()));
    }

    public void saveJoke(Joke joke) {
        jokeRepository.save(joke);
    }
    
    public void upvoteJoke(int jokeId) {
        Joke j = jokeRepository.findById(jokeId).get();
        j.setVotes(j.getVotes() + 1);
        jokeRepository.save(j);
    }

    public void downvoteJoke(int jokeId) {
        Joke j = jokeRepository.findById(jokeId).get();
        j.setVotes(j.getVotes() - 1);
        jokeRepository.save(j);
    }
}