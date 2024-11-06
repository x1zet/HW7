public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников
        int itWorkers = 100;

        for (int i = 1; i < itWorkers; i++){
            if (i % 2 == 0){
                System.out.println("Уволен работник с id: " + i);
            }
        }
    }
}
