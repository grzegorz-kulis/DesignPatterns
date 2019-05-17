public class FactoryProducer {

    public static MovieFactory getFactory(String choice) throws Exception {
        if (choice == null) {
            return null;
        }

        if (choice.equalsIgnoreCase("comedy")) {
            return new ComedyMovieFactory();
        }
        else if (choice.equalsIgnoreCase("action")) {
            return new ActionMovieFactory();
        }
        else {
            throw new Exception("No such genre");
        }
    }

}
