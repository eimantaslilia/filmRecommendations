package reference.comparator;

import reference.domain.Film;
import reference.domain.Rating;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class FilmComparator implements Comparator<Film> {
    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
    }
    public int average(Film o){
        double totalAvg = 0.0;
        for (int i = 0; i < ratings.get(o).size(); i++) {
            totalAvg += ratings.get(o).get(i).getValue();
        }
        double divideBy = ratings.get(o).size();
        totalAvg = totalAvg / divideBy;
        long sum = Math.round(totalAvg);
        return Math.toIntExact(sum);
    }
    @Override
    public int compare(Film o1, Film o2) {

        return average(o2) - average(o1);
    }
}
