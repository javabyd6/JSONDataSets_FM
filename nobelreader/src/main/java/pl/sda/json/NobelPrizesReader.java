package pl.sda.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author fmucko
 */
public class NobelPrizesReader {

    public static Data readNobels(String pathName) {
        File nobelFile = new File(pathName);
        Data data = new Data();
        ObjectMapper mapper = new ObjectMapper();
        try {
            data = mapper.readValue(nobelFile, Data.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }

    public static void main(String[] args) throws IOException {

        Data data = readNobels("prize.json");
        List<NobelPrize> nobelPrizes = new ArrayList<>();
        nobelPrizes = data
                .getPrizes()
                .stream()
                .filter(prize->prize.getCategory().equals("physics"))
                .collect(Collectors.toList());

        for (NobelPrize nobelPrize : nobelPrizes) {
            nobelPrize.readPrizes();
        }

    }

}
