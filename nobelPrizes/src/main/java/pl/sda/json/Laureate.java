package pl.sda.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fmucko
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laureate {
    private String id;
    private String firstname;
    private String surname;
    private String motivation;
    private String share;

    public void readLaureate() {
        System.out.println("    ID:         " + id);
        System.out.println("    Fist name:  " + firstname);
        System.out.println("    Surname:    " + surname);
        System.out.println("    Motivation: " + motivation);
        System.out.println("    Share:      " + share);
        System.out.println();
    }
}
