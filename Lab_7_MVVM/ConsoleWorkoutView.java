package Lab_7_MVVM;

import java.util.List;

class ConsoleWorkoutView implements WorkoutView {
    @Override
    public void displayWorkouts(List<Workout> workouts) {
        System.out.println("Текущие тренировки:");
        for (Workout workout : workouts) {
            System.out.println(workout);
        }
    }

    @Override
    public void showCompletionMessage(String workoutName) {
        System.out.println("Поздравляем! Тренировка '" + workoutName + "' завершена!");
    }

    @Override
    public void showError(String message) {
        System.out.println("Ошибка: " + message);
    }
}
