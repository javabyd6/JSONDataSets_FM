package pl.sda.json;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author fmucko
 */
@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Data {

    private List<NobelPrize> prizes;
}
