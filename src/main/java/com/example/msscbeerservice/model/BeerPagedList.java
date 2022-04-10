package com.example.msscbeerservice.model;

import org.springframework.data.domain.PageImpl;

import java.util.List;

public class BeerPagedList extends PageImpl<BeerDTO> {

    public BeerPagedList(List<BeerDTO> content) {
        super(content);
    }
}
