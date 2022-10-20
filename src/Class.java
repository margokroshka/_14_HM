import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Class {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    public void check() {
        if (n == 1) {
            Function<Information, Results> function = (x) -> {
                Results results = new Results();
                results.setResult(x.string.reverse());
                System.out.println(results);
                return results;
            };
            Information information = new Information();
            Results apply = function.apply(information);
            System.out.println(apply.getResult());
        } else if (n == 2) {
            Function<Information, Results> function = (x) -> {
                Results results = new Results();
                int resault = 1;
                for (int i = 1; i <= 5; i++) {
                    resault = i * resault;
                }
                results.setResult(resault);
                System.out.println(results);
                return results;
            };
            Information information = new Information();
            Results apply = function.apply(information);
            System.out.println(apply.getResult());
        }
    }

}
