package Lab_7_MVVM;

import java.util.ArrayList;
import java.util.List;

class WorkoutViewModel {
    private List<Workout> workouts;
    private WorkoutView view;

    public WorkoutViewModel(WorkoutView view) {
        this.view = view;
        this.workouts = new ArrayList<>();
    }

    public void addWorkout(Workout workout) {
        workouts.add(workout);
    }

    public List<Workout> getWorkouts() {
        return new ArrayList<>(workouts);
    }

    public void setCompletedReps(String workoutName, int completedReps) {
        for (Workout workout : workouts) {
            if (workout.getName().equals(workoutName)) {
                try {
                    workout.setCompletedReps(completedReps);
                    if (workout.isCompleted()) {
                        view.showCompletionMessage(workout.getName());
                    }
                } catch (IllegalArgumentException e) {
                    view.showError(e.getMessage());
                }
                return;
            }
        }
        view.showError("Упражнение с названием '" + workoutName + "' не найдено.");
    }

    public void updateView() {
        view.displayWorkouts(workouts);
    }
}
