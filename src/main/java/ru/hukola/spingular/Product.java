package ru.hukola.spingular;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Babin Nikolay
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    private long id;
    private String description;
}
