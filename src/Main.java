import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Workout training1 = new Workout("Run", 30, 5.8);
        Workout training2 = new Workout("Swim" , 45, 2.1);

        WorkoutTracker tracker = new WorkoutTracker();
        tracker.addWorkouts(training1);
        tracker.addWorkouts(training2);

        System.out.println(" ");
        tracker.printAllWorkouts();
        System.out.println(" ");
        System.out.println("Total distance covered in training: " + tracker.CalculateTotalDistance() + " km");

    }
}
