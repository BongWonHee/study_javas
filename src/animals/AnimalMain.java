package animals;

public class AnimalMain {
    public static void main(String[] args) {

        try {
            HoresAnimallmpl horesAnimallmpl = new HoresAnimallmpl();

            HumanAnimallmpl humanAnimallmpl = new HumanAnimallmpl();

            HorseAnmalExtend horseAnmalExtend = new HorseAnmalExtend();

            HumanAnimalExtend humanAnimalExtend = new HumanAnimalExtend();

            System.out.println(horesAnimallmpl.toString()); // horse 의 arms, legs, speech 출력

            System.out.println(humanAnimallmpl.toString()); // human 의 arms, legs, speech 출력

            System.out.println(horseAnmalExtend.getSpeed()); // horse 의 arms, legs, speech , 속도 출력

            System.out.println(humanAnimalExtend.getSpeed()); // human 의 arms, legs, speech 출력
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // try {
        // HumanAnimalImpl human = new HumanAnimalImpl();
        // int foots = human.setLegs(2);
        // int hands = human.setArms(2);
        // String possible = human.setEnableSpeech("YES!!");
        // System.out.println(human.toString(foots, hands, possible));
        // // Result_Legs : 2, Arms : 2, Speech : YES!!
        // HumanAnimalExtend humanspec = new HumanAnimalExtend();
        // int speeds = humanspec.HumanAnimalExtend(3);
        // System.out.println(humanspec.getSpeed());
        // // Results_Legs : 2, Arms : 2, Speech : YES!!
        // // Legs : 0, Arms : 0, Speech : , Speed : 3Km

        // HorseAnimalImpl horse = new HorseAnimalImpl();
        // foots = horse.setLegs(4);
        // hands = horse.setArms(0);
        // possible = horse.setEnableSpeech("NOOOOO!!!!!");
        // System.out.println(horse.toString());
        // // Result_Legs : 2, Arms : 2, Speech : YES!!
        // // legs : 4, arms : 0, speech : NOOOOO!!!!!
        // HorseAnimalExtend horsespec = new HorseAnimalExtend();
        // speeds = horsespec.HorseAnimalExtend(12);
        // System.out.println(horsespec.getSpeed());
        // // Result_Legs : 2, Arms : 2, Speech : YES!!
        // // Legs : 0, Arms : 0, Speech : , Speed : 3Km
        // // legs : 4, arms : 0, speech : NOOOOO!!!!!
        // // legs : 0, arms : 0, speech : , speed : 12km

        // } catch (Exception e) {
        // // TODO: handle exception
        // }
        // System.out.println();

    }
}
