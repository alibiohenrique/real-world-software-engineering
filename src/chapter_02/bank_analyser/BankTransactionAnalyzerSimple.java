package chapter_02.bank_analyser;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankTransactionAnalyzerSimple {
    private static final String RESOURCES = "src/chapter_01/bank_analyser/resources/";

    public static void main(final String[] args) throws Exception {

        final Path path = Paths.get(RESOURCES + "transactions.csv");
        final List<String> lines = Files.readAllLines(path);
        double total = 0d;
        for (final String line : lines) {
            final String[] columns = line.split(",");
            final double amount = Double.parseDouble(columns[1]);
            total += amount;
        }
        System.out.println("The total amount for all transactions is " + total);
    }
}
