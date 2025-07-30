import java.util.ArrayList;

public abstract class Material {
    private int id;
    private String name;
    private ArrayList<Integer> scores;
    private int release_year;
    private Category category;
    private int price;
    private String type;

    public Material(int id, String name, ArrayList<Integer> scores, int release_year, Category category, int price, String type) {
        this.id = id;
        this.name = name;
        this.scores = scores;
        this.release_year = release_year;
        this.price = price;
        this.category = category;
        this.type = type;
    }

    public void addScore(int score) {
        scores.add(score);
    }

    public double getAvgScore() {
        return scores.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Category getCategory(){
        return category;
    }
    public int getprice(){
        return price;
    }


    public void showDetail(){

    }
}


