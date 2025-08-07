public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = 20;
        int price = 10_000 /miles;
        int answer = service.calculate(price); // должно получиться 500
        System.out.println(answer + " - Счет милей.");
        }
    }

