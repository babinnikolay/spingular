package ru.hukola.spingular;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Babin Nikolay
 */
@Service
public class MainService {
    private final List<Product> products = new ArrayList<>();
    {
        products.add(new Product(1l, "new product"));
        products.add(new Product(2l, "new product 2"));
        products.add(new Product(3l, "new product 3"));

    }


    public List<Product> findAll() {
        return new ArrayList<>(products);
    }
}
