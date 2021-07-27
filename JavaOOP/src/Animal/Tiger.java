package Animal;

public class Tiger extends Felidae{

    public Tiger(int age, double weight, String running, String eating) {
        super(age, weight, running, eating);
    }
    public void sounds(){
        System.out.println(getSounds());
    }

    public String getSounds() {
        return sounds;
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
