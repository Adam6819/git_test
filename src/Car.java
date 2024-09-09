public class Car {

    private String color;

    private String model;

    private int speed;

    private Engine engine;

    public Car(String color, String model, int hp){


    }

    public void setColor(String newColor){
        color = newColor;
    }

    public String getColor(){
        return color;
    }

    public void setModel(String newModel){
        model = newModel;

    }

    public String getModel(){
        return model;

    }

    void start(){
        engine.start();
        //Metod kropp, skriver vad medtod ska göra
        System.out.println("bilen är startad");
    }

    void stop(){
        engine.stop();
        System.out.println("Bilen har stannat. ");

    }

    void accelerate(int increase){
        speed += increase;
        System.out.println("Bilen kör nu i " + speed + " km/h");

    }

}


