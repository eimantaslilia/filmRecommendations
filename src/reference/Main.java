package reference;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;


public class Main {

    public static void main(String[] args) {

    RatingRegister db = new RatingRegister();

    Film avatar = new Film("Avatar");
    Film titanic = new Film("Titanic");
    Film hurtLocker = new Film("hurtLocker");
    Film manchesterByTheSea = new Film("Manchester by the Sea");
    Film Troy = new Film("Troy");

    Person jonas = new Person("Jonas");
    Person kazys = new Person("Kazys");
    Person andrius = new Person("Andrius");

    db.addRating(kazys, avatar, Rating.FINE);
    db.addRating(kazys, titanic, Rating.BAD);
    db.addRating(kazys, hurtLocker, Rating.GOOD);
    db.addRating(kazys, manchesterByTheSea, Rating.GOOD);
    db.addRating(kazys, Troy, Rating.GOOD);

    db.addRating(andrius, avatar, Rating.BAD);
    db.addRating(andrius, titanic, Rating.MEDIOCRE);
    db.addRating(andrius, hurtLocker, Rating.MEDIOCRE);
    db.addRating(andrius, manchesterByTheSea, Rating.GOOD);
    db.addRating(andrius, Troy, Rating.FINE);

    Reference ref = new Reference(db);

    System.out.println("The film recommended to Jonas is: " + ref.recommendFilm(jonas));

    }
}
