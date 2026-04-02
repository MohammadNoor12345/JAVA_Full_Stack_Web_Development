package L29_MyCustomer;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;

class Movie{

    String name;
    String review;
    String collection;

    public Movie(String name,String review,String collection) {
        this.name=name;
        this.review=review;
        this.collection=collection;
    }
    public String getName() {
        return name;
    }
    public String getReview() {
        return review;
    }
    public String getCollection() {
        return collection;
    }
    @Override
    public String toString() {
        return "Movie [name=" + name + ", review=" + review + ", collection=" + collection + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(collection, name, review);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Movie other = (Movie) obj;
        return Objects.equals(collection, other.collection) && Objects.equals(name, other.name)
                && Objects.equals(review, other.review);

    }

}

public class L01_MyMovieCons {

    public static void main(String[] args) {

        ArrayList<Movie> al=new ArrayList<>();
        al.add(new Movie("Dhurandar", "Hit", "10000"));
        al.add(new Movie("Dhurandar:The revenge", "Hit", "20000"));
        al.add(new Movie("KGF", "Hit", "15000"));
        al.add(new Movie("Pushpa", "Hit", "9000"));
        al.add(new Movie("Game Changer", "Flop", "5000"));
        al.add(new Movie("Dhadak2", "Flop", "6500"));
        al.add(new Movie("Double iSmart", "Flop", "6900"));

        Consumer<Movie> c=(m)->{
            if(m.review.equals("Hit")) {
                System.out.println(m.getName());
            }
        };
        for(Movie m:al) {
            c.accept(m);
        }

    }

}
