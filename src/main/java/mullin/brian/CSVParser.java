package mullin.brian; /**
 * Created by brianmullin on 5/20/17.
 */
import java.util.ArrayList;


public class CSVParser {

    public static ArrayList<DriversLicense> deserializeFromCSV(String csvString){

        ArrayList<DriversLicense> result = new ArrayList<DriversLicense>();
        String[] lines = csvString.split("\n");

        for(int i = 1; i < lines.length; i++){

            String[] entry = lines[i].split(",");

            result.add(new DriversLicense(entry[0], entry[1], entry[2], entry[3], entry[4], entry[5]
                    ,entry[6], entry[7], entry[8], entry[9], entry[10], entry[11], entry[12]));

        }
        return result;
    }

}
