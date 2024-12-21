package Lab_7_MVVM;

public class Lab7_Task3 {
    public static void main(String[] args) {
        WorkoutView view = new ConsoleWorkoutView();

        WorkoutViewModel viewModel = new WorkoutViewModel(view);

        viewModel.addWorkout(new Workout("Push-Ups", 20, 0));
        viewModel.addWorkout(new Workout("Squats", 15, 5));

        viewModel.updateView();

        System.out.println("\nОбновление прогресса:");
        viewModel.setCompletedReps("Push-Ups", 10);
        viewModel.setCompletedReps("Squats", 15);

        viewModel.updateView();

        // Пытаемся установить некорректное значение
        viewModel.setCompletedReps("Push-Ups", 25);
    }
}
