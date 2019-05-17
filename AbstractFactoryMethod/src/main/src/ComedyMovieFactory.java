public class ComedyMovieFactory implements MovieFactory {
    public HollywoodMovie getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }

    public BollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}
