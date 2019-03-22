package reference;

import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.*;

public class RatingRegister {
    private Map<Film, List<Rating>> filmRatings;
    private Map<Person, HashMap<Film, Rating>> personalRatings;

    public RatingRegister() {
        this.filmRatings = new HashMap<Film, List<Rating>>();
        this.personalRatings = new HashMap<Person, HashMap<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating) {
        if (!filmRatings.containsKey(film)) {

            filmRatings.put(film, new ArrayList<Rating>());
        }
        filmRatings.get(film).add(rating);
    }

    public List<Rating> getRatings(Film film) {
        return filmRatings.get(film);
    }

    public Map<Film, List<Rating>> filmRatings() {
        return filmRatings;
    }

    public void addRating(Person person, Film film, Rating rating) {
        addRating(film, rating);

        if(!personalRatings.containsKey(person)){
            personalRatings.put(person, new HashMap<Film, Rating>());
            personalRatings.get(person).put(film, rating);
        } else if(!personalRatings.get(person).containsKey(film)){
            personalRatings.get(person).put(film, rating);
        }
    }
    public Rating getRating(Person person, Film film){
        if(!personalRatings.containsKey(person)){
            return Rating.NOT_WATCHED;
        } else if (!personalRatings.get(person).containsKey(film)){
            return Rating.NOT_WATCHED;
        } else {
            return personalRatings.get(person).get(film);
        }
    }
    public Map<Film, Rating> getPersonalRatings(Person person){
        if(!personalRatings.containsKey(person)){
            return new HashMap<>();
        }
        return personalRatings.get(person);
    }
    public List<Person> reviewers(){
        return new ArrayList<Person>(personalRatings.keySet());
    }
}


