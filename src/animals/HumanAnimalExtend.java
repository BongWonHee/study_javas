package animals;


public class HumanAnimalExtend implements InterfaceAnimal{
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

   

    public String getSpeed() {
        String inter = " arms : " + setArms + " Legs : " + setLegs + " speech : " + setEnbleSpeech + " speed : "
                + speed + "Km";
        return inter;
    }
    }
    // public class HumanAnimalExtend extends HumanAnimalImpl {
    // int forth = 0;

    // public HumanAnimalExtend() {
    // }

    // public int HumanAnimalExtend(int speed) {

    //     this.forth = speed;
    //     return this.forth;
    // }

    // public String getSpeed() {
    //     String gather = "Legs : " + super.first + ", Arms : " + super.second + ", Speech : " + super.third
    //             + ", Speed : "
    //             + this.forth + "Km";
    //     return gather;
    // }

