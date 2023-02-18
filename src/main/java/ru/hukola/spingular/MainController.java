package ru.hukola.spingular;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Babin Nikolay
 */
@RestController
@AllArgsConstructor
public class MainController {
    private final MainService mainService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/products")
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok(mainService.findAll());
    }

}
