package stage2.strings;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class string3 {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();

        String[] line = date.split("-");
        System.out.println(line[1] + "/" + line[2] + "/" + line[0]);

    }
}

