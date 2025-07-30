import java.lang.reflect.Array;
import java.util.ArrayList;

public class Netflix {
    private ArrayList<Material> materials;
    private User credential;
    public boolean isLogin = false;   //kontrol


    // Parametreli constructor
    public Netflix(ArrayList<Material> materials) {
        this.materials = materials;

    }

    //Parametresiz constructor
    public Netflix() {
        this.materials = new ArrayList<>();
    }

    public void login(User user) {
        if (user.getUserName().equals("TestUser") && user.getPassword().equals("123456")) {
            isLogin = true;
            credential = user;
            System.out.println("Giriş başarılı!");
        }else {
            System.out.println("Giriş Yapılamadı");
        }
    }

    public void addMovie(Movie m1) {
        if (isLogin) materials.add(m1);
    }

    public void addBook(Book b1) {
        if (isLogin) materials.add(b1);

    }

    public void addMaterial(Material m2) {
        if (isLogin) materials.add(m2);

    }

    public void highAvgScore() {

        if (materials.isEmpty()) {
            System.out.println("Material bulunamadı.");
            return;
        }

        Material highest = materials.get(0);
        for (Material material : materials) {
            if (material.getAvgScore() > highest.getAvgScore()) {
                highest = material;
            }
        }
        System.out.println("En yüksek ortalama skorlu material: " + highest.getName());

    }


    public void lowestAvgMovie() {
        Movie low = null;
        double minAvg = Double.MAX_VALUE;
        for (Material m : materials) {
            if (m instanceof Movie) {
                double avg = m.getAvgScore();
                if (avg < minAvg) {
                    minAvg = avg;
                    low = (Movie) m;

                }

            }

        }
        if (low != null) {
            System.out.println("Ortalaması en düşük film: " + low.getName());
        } else {
            System.out.println("Film bulunamadı.");
        }






    }

    public void expensiveByCategory(int categoryId) {
        Material expensive = null;

        for (Material m : materials) {
            if (m.getCategory().getId() == categoryId) {
                if (expensive == null || m.getprice() > expensive.getprice()) {
                    expensive = m;
                }
            }

        }
        if (expensive != null) {
            System.out.println("En pahalı material: " + expensive.getName());
        } else {
            System.out.println("Bu kategoride material bulunamadı.");
        }
    }

    public void moviesByActorId(int personId) {
        boolean found = false;
        for (Material m : materials) {


            if(m instanceof Movie){
                Movie movie = (Movie) m;

                for (Person actor : movie.getActors()) {
                    if (actor.getId() == personId) {
                        if (!found) {
                        System.out.println("N4 – Kişi ID'si " + personId + " olan kişinin filmleri:");
                        }
                        movie.showDetail();
                        found = true;

                    }

                    break;

                }
              

            }

        }
    }
}










