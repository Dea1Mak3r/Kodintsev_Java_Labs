package Lab_7_MVVM;

import java.util.List;

interface WorkoutView {
    void displayWorkouts(List<Workout> workouts);
    void showCompletionMessage(String workoutName);
    void showError(String message);
}
