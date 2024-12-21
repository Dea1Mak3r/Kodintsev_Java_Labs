package Lab_7_MVVM;

class Workout {
    private String name;
    private int reps;
    private int completedReps;

    public Workout(String name, int reps, int completedReps) {
        this.name = name;
        this.reps = reps;
        this.completedReps = completedReps;
    }

    public String getName() {
        return name;
    }

    public int getReps() {
        return reps;
    }

    public int getCompletedReps() {
        return completedReps;
    }

    public void setCompletedReps(int completedReps) {
        if (completedReps > reps) {
            throw new IllegalArgumentException("Выполненные повторения не могут превышать общее количество!");
        }
        this.completedReps = completedReps;
    }

    public boolean isCompleted() {
        return completedReps >= reps;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "name='" + name + '\'' +
                ", reps=" + reps +
                ", completedReps=" + completedReps +
                '}';
    }
}
