import inheritances.ObjectInheritances;
import vehicles.Bicycle;
import vehicles.MountainBike;
import vehicles.RoadCycle;

public class Inheritances {
    public static void main(String[] args) {
        try {
            // ObjectInheritances objectInheritances = new ObjectInheritances();
            // System.out.println();
            // // 상속 확인 중_class확인: 항상 Objec클랙스에 상속받아져있음
            // 상속 할 Class 생성_class Bicycle
            // Bicycle bicycle = new Bicycle(5500,"blue");
            // System.out.println(bicycle.toString());

            // 상속해서 활용_class MountainBike
            // MountainBike mountainBike = new MountainBike();
            // MountainBike mountainBike = new MountainBike(6200,"yellow",5);
            // System.out.println();


            RoadCycle roadCycle = new RoadCycle(6200, "red","삼천리자전거" );
            System.out.println(roadCycle.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }
        System.out.println();
    }
}
