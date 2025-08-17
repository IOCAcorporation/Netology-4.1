public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int answer = service.calculate(20); // должно получиться 500
        System.out.println(answer + " - Счет милей.");
        }
    }

