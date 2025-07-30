import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1,"Berra","Aydın",24);
        Person p2 = new Person(2,"Fatma","Kılıç",19);
        Person p3 = new Person(3,"Zeynep","Yıldırım",35);
        Person p4 = new Person(4,"Umut","Polat",29);


        Category c1 =new Category(1,"C01","Romantik");
        Category c2 =new Category(2,"C02","Korku");

        ArrayList<Integer> movieScore1= new ArrayList<Integer>(List.of(4,3,2));
        ArrayList<Integer> movieScore2 = new ArrayList<>(List.of(4,3,3));

        ArrayList<Person> list = new ArrayList<Person>(List.of(p1, p2));
        ArrayList<Person>list2 = new ArrayList<Person>(List.of( p2));

        Movie m1 = new Movie(1,"GORA",movieScore1,2007,30,c2, "movie",list,p3);
        Movie m2 = new Movie(2,"Harry Poter",  movieScore2 ,2000,80,c1,"movie",list2, p3);
        m1.addScore(9);
        m2.addScore(10);

        m1.addActor(p1);
        m1.addActor(p2);
        m2.addActor(p2);


        ArrayList<Integer> bookScore1 = new ArrayList<>(List.of(4,4,3));
        ArrayList<Integer> bookScore2 = new ArrayList<>(List.of(3,2,3));
        Book b1= new Book(3,"Körlük", bookScore1  , 2017,30,c1,"book",p1,450);
        Book b2= new Book(4,"Satranç", bookScore2, 1990,45,c2,"book",p2,95);
        b1.addScore(7);
        b2.addScore(9);


        User u1 = new User(10,"Test","User",27,"TestUser","123456");


        Netflix n= new Netflix();

        n.login(u1);


        n.addMovie(m1);
        n.addMovie(m2);

        n.addBook(b1);
        n.addBook(b2);


        n.highAvgScore();
        n.lowestAvgMovie();
        n.expensiveByCategory(1);
        n.moviesByActorId(2);




    }

}