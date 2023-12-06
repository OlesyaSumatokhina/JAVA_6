import ru.netology.services.RestMonth;

public class Main {

    public static void main(String[] args) {
        RestMonth servise = new RestMonth();
        int expected = 3;

        int summMonths = servise.restMonth(100000, 60000, 1500000);
        System.out.println("Месяцев могу отдохнуть - " + summMonths);
    }

}
