public class Person {

    private String lastName;
    private String firstName;
    private int age;
    private int height;
    private int weight;
    private String homeCity;
    private String nationality;

    public Person(String lastName, String firstName, int age, int height, int weight, String homeCity, String nationality) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.homeCity = homeCity;
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", homeCity='" + homeCity + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public static class builder {
        private String lastName;
        private String firstName;
        private int age;
        private int height;
        private int weight;
        private String homeCity;
        private String nationality;

        public builder() {}

        public builder lastname(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public builder firstname(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public builder age(int age) {
            this.age = age;
            return this;
        }

        public builder height(int height) {
            this.height = height;
            return this;
        }

        public builder weight(int weight) {
            this.weight = weight;
            return this;
        }

        public builder homecity(String homeCity) {
            this.homeCity = homeCity;
            return this;
        }

        public builder nationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Person build() {
            return new Person(lastName, firstName, age, height, weight, homeCity, nationality);
        }

    }
}
