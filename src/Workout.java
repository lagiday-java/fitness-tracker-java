public class Workout {
    private String type;
    private double duration;
    private double distance;

    Workout (String type, double duration, double distance)
    {
        this.type = type;
        this.duration = duration;
        this.distance = distance;
    }

    public String getType()
    {
        return this.type;
    }
    public double getDuration()
    {
        return this.duration;
    }

    public double getDistance() {
        return this.distance;
    }

    @Override
    public String toString()
    {
        return "Training: " + this.type + " | Duration: " + this.duration + " min | Distance: " + this.distance + " km";
    }
}
