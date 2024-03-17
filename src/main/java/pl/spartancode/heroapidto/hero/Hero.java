package pl.spartancode.heroapidto.hero;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
public class Hero {
    private Long id;
    private String name;
    private int level;
}
