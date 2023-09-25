public class Dog {
    // we had to ensure fields once initialised dont get changed later on,
    // now think why bare final keyword with fields(as then setField will be exposed) will
    // not suffice.
    // with constructors there will be lots of overloading permutation.
    // builder pattern solves this issue.

    private String name;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", price=" + price +
                '}';
    }

    private String breed;
    private String gender;
    private int price;

    public Dog(DogBuilder dogBuilder) {
        this.gender = dogBuilder.gender;
        this.name = dogBuilder.name;
        this.price = dogBuilder.price;
        this.breed = dogBuilder.breed;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public static class DogBuilder{


        public String breed;
        public String gender;
        public String name;
        public int price;

        public DogBuilder setBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public DogBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public DogBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public DogBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Dog build() {
            return new Dog(this);
        }
    }
}
