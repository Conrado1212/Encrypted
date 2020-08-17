package stage5.filee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class File3 {

        public static void main(String[] args) {
            List<Integer> year = new ArrayList<>();
            List<Long> population = new ArrayList<>();

            try (Scanner scanner = new Scanner(new File("\u202AC:\\Users\\Konrad\\Downloads\\dataset_91069.txt"))) {
                scanner.nextLine();

                while (scanner.hasNext()) {
                    String[] data = scanner.nextLine().split("\\s+");
                    try {
                        year.add(Integer.parseInt(data[0]));
                        population.add(Long.parseLong(data[1].replace(",", "")));
                    } catch (IndexOutOfBoundsException | NumberFormatException e) {
                        System.out.println("Malformed input");
                        return;
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("No file");
                return;
            }

            long maxDiff = 0;
            int maxDiffIndex = 0;
            for (int i = population.size() - 1; i > 0; i--) {
                long currentDiff = population.get(i) - population.get(i - 1);
                if (currentDiff > maxDiff) {
                    maxDiff = currentDiff;
                    maxDiffIndex = i;
                }
            }

            System.out.println(year.get(maxDiffIndex));
        }
    }

