package reference;

import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;

import java.util.*;

public class Reference {
    private RatingRegister register;

    public Reference(RatingRegister register){
        this.register = register;
    }
    public Film recommendFilm(Person person){

        List<Film> films = new ArrayList<Film>(register.filmRatings().keySet());

        Collections.sort(films, new FilmComparator(register.filmRatings()));

        return films.get(0);
    }
}
