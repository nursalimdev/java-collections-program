package nursalim.dev.collection.program.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CommonCsvApp {
    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = CommonCsvApp.class.getResourceAsStream("/MOCK_DATA.csv");
        InputStreamReader reader = new InputStreamReader(resourceAsStream);

        CSVParser records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader);
        for (CSVRecord record: records) {
            String id = record.get("id");
            String firstName = record.get("first_name");
            String lastName = record.get("last_name");
            String email = record.get("email");
            String gender = record.get("gender");
            String ipAddress = record.get("ip_address");

            System.out.println(id + " - " + firstName + " - " + lastName + " - " + email + " - " + gender + " - " + ipAddress);
        }

    }
}
