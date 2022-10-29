public class Car {
    final String producer;
    final String model;
    Double millage;
    String colour;
    Double width;
    Double height;
    Double lenght;

    Car(String producer, String model)
    {
        this.producer = producer;
        this.model = model;
    }

    public String toString(){
        return "producer: " + this.producer + " Model: " + this.model;
    }
}
