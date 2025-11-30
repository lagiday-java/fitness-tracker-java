import java.util.ArrayList;

public class WorkoutTracker{
    private ArrayList<Workout> workouts;

    WorkoutTracker()
    {
        this.workouts = new ArrayList<>();
    }

    public void addWorkouts (Workout workouts)
    {
        this.workouts.add(workouts);
    }

    public double CalculateTotalDistance()
    {
        double totalDistance = 0;
        for (int i = 0; i < workouts.size(); i++)
        {
            totalDistance += workouts.get(i).getDistance();
        }
        return totalDistance;
    }

    public void printAllWorkouts()
    {
        System.out.println("-Your training list-");
        for (int i = 0; i < workouts.size(); i++)
        {
            System.out.println(workouts.get(i));
        }
        System.out.println("-Waiting for your new training sessions-");

    }
}
