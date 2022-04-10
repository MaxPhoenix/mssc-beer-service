package com.example.msscbeerservice.web.controller;

import com.example.msscbeerservice.model.BeerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {


    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDTO> getBeerById(@PathVariable("beerId") UUID beerId) {
        //TODO impl
        return ResponseEntity.ok(BeerDTO.builder().build());
    }

    @PostMapping
    public ResponseEntity saveNewBeer() {
        //TODO Impl
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId,
                                         @RequestBody BeerDTO beerDTO) {
        //TODO impl
        return ResponseEntity.noContent().build();
    }
}
