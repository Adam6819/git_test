public class Engine {

    private int hp;

    private boolean isOn;

    //konstrukor
    public Engine(int hp){
        isOn = false;
    }



    public void start(){
        isOn = true;
        System.out.println("Motorn är igång. ");

    }

    public void stop(){
        isOn = false;
        System.out.println("Motorn har st'ngs av. ");

    }

    public boolean isRunning(){
        return isOn;

    }

    public int getHp(){
        return hp;


    }

}
