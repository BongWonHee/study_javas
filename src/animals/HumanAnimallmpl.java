package animals;

public class HumanAnimallmpl implements InterfaceAnimal {
    int setLegs = 2;
    int setArms = 2;
    String setEnbleSpeech = "yes";
    int speed = 3;

    @Override
    public int setLegs(int val) {
        this.setLegs = this.setLegs;
        return setLegs;

    }

    @Override
    public int setArms(int val) {
        this.setArms = this.setArms;
        return setArms;
    }

    @Override
    public String setEnbleSpeech(String val) {
        this.setEnbleSpeech = this.setEnbleSpeech;
        return setEnbleSpeech;
    }

    @Override
    public int speed(int val) {
        this.speed = this.speed;
        return speed;
    }

    public String toString() {
        String str = " arms : " + setArms + " Legs : " + setLegs + " speech : " + setEnbleSpeech;
        return str;
    }

  
}