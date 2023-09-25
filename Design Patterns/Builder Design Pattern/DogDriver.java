public class DogDriver {

    public static void main(String[] args) {
        Dog dog1 = new Dog.DogBuilder()
                .setBreed("pug")
                .setName("akshay")
                .setPrice(1000)
                .build();

        System.out.println(dog1);
    }
}
