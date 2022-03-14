package work21;

public class Human implements Jumping,Running {

    private int maxDistanceKilometers = 50;
    private int maxJumpSM = 200;

    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }

    @Override
    public void run(int distanceKiloMeters) {
        System.out.println("Человек бежит");
    }

    public void jumpOverWall(int heightSM) {
        if (heightSM<maxJumpSM) {
            System.out.print("Человек ");
            Wall.jumpOverWall(heightSM);
        }
        else System.out.printf("Человек не смог перепрыгнуть через препятствие высотой %d см.\n", heightSM);
    }

    void jumpOverObjectWall (Wall wall){
        if (wall.getHeightSM()<maxJumpSM) {
            System.out.printf("Человек прыгает через объектную стену высотой %d см.\n", wall.getHeightSM());
        }
        else System.out.printf("Человек не смог прыгнуть на высоту %d см.\n", wall.getHeightSM());
    }

    void runOnTable(int distanceKiloMeters) {
        if (distanceKiloMeters<maxDistanceKilometers) {
            System.out.print("Человек ");
            RunTable.runOnTable(distanceKiloMeters);
        }
        else System.out.printf("Человек не смог пробежать на дистанцию %d километров.\n", distanceKiloMeters);
    }

    void runOnObjectTable(RunTable runTable) {
        if (runTable.getDistance()<maxDistanceKilometers) System.out.printf("Человек пробегает %d километров.\n", runTable.getDistance());
        else System.out.printf("Человек не смог пробежать на дистанцию %d километров.\n", runTable.getDistance());
    }


}
