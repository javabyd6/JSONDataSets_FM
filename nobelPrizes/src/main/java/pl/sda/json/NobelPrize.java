package pl.sda.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fmucko
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NobelPrize {

    private String year;
    private String category;
    private String overallMotivation;
    private Laureate[] laureates;

    public void readPrizes(){
        System.out.println("Year:               " + year);
        System.out.println("Category:           " + category);
        System.out.println("Overall Motivation: " + overallMotivation);
        this.readLaureates();
    }

    private void readLaureates(){
        for (Laureate laureate : laureates) {
            laureate.readLaureate();
        }

    }


}
