package ru.hukola.spingular;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Babin Nikolay
 */
@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class MainController {
    private final MainService mainService;


    @GetMapping("/products")
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok(mainService.findAll());
    }

    @PostMapping("/products")
    public ResponseEntity<Product> create(@RequestBody Product product) {
        return ResponseEntity.ok(mainService.create(product));
    }
}
