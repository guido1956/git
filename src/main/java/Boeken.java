import java.util.ArrayList;

public class Boeken {
    private final ArrayList<Boek> boeken = new ArrayList<>();

    public Boeken() {
    }

    public void addBoek(Boek boek) {
        boeken.add(boek);
    }

    public int aantalBoeken() {
        return boeken.size();
    }

    public String toString() {
        String rapport = "";
        for (Boek boek : boeken) {
            rapport += boek.getTitel();
        }
        return rapport;
    }


}
