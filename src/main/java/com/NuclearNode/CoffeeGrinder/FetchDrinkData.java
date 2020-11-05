package com.NuclearNode.CoffeeGrinder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FetchDrinkData extends JpaRepository<DrinkModel, Integer> {

    @Override
    List<DrinkModel> findAll();
}
