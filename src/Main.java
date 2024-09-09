public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        //car1.color = "vit";
        //car1.model = "vw";
        //car1.speed = 0;

        car1.setColor("Röd");
        car1.setModel("Volvo");


        car1.start();
        car1.accelerate(50);

        //System.out.println("Bilen är " + car1.color + " och är märket " + car1.model);
        //System.out.println("Bilen är " + car1.getColor() + " och är märket " + car1.getColor());

        Engine e = new Engine(200);
        System.out.println(e.getHp());




    }



}