package Animal;

public class Animal {
    int age;
    double weight;
    String running;
    String eating;

    public Animal(int age, double weight, String running, String eating){
        this.age = age;
        this.weight = weight;
        this.running = running;
        this.eating = eating;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRunning() {
        return running;
    }

    public void setRunning(String running) {
        this.running = running;
    }

    public String getEating() {
        return eating;
    }

    public void setEating(String eating) {
        this.eating = eating;
    }


}
