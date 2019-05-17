public class Main {

    public static void main(String[] args) throws Exception {
        MovieFactory actionMovies = FactoryProducer.getFactory("action");

        HollywoodMovie hollywoodActionMovie = actionMovies.getHollywoodMovie();
        System.out.println(hollywoodActionMovie.getTitle());

        BollywoodMovie bollywoodActionMovie = actionMovies.getBollywoodMovie();
        System.out.println(bollywoodActionMovie.getTitle());

        MovieFactory comedyMovies = FactoryProducer.getFactory("comedy");
        BollywoodMovie bollywoodComedyMovie = comedyMovies.getBollywoodMovie();
        System.out.println(bollywoodComedyMovie.getTitle());

        HollywoodMovie hollywoodComedyMovie = comedyMovies.getHollywoodMovie();
        System.out.println(hollywoodComedyMovie.getTitle());
    }
}
