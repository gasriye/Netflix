import java.util.ArrayList;

public class Movie extends Material{
    private ArrayList<Person> actors;
    private Person director;


    public Movie(int id, String name, ArrayList<Integer> scores, int release_year, int price, Category category, String type, ArrayList<Person> actors , Person director  ){
        super(id, name, scores, release_year, category, price, type);
        this.actors = actors;
        this.director=director;
    }

    public void addActor(Person actor){
        actors.add(actor);

    }

    public ArrayList<Person> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Person> actors) {
        this.actors = actors;
    }

    @Override
    public void showDetail(){
        System.out.println("Movie: " + getName() + ", Director: " + director + ", Actors: " + actors + ", Avg Score: " + getAvgScore());
    }
}
