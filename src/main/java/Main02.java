public class Main02 {
    public static void main(String[] args) {
        Boek boek = new Boek("Java" , "Guido Dulos");
        System.out.println(boek.getTitel() + " " + boek.getAuteur());
        boek.setAantalBladzijden(2323);
        System.out.println(boek.getAantalBladzijden());
    }
}
