package ru.itpark.repository;

import ru.itpark.domain.House;

import java.util.ArrayList;
import java.util.List;

public class HouseRepository {
    private List<House> items = new ArrayList<>();

    public void add(House item) {
        items.add(item);
    }

    public List<House> getAll() {
        return items;
    }

    public List<House> findByDistrict(List<String> districts) {
        List<House> result = new ArrayList<>();
        for (House house : items) {
            if (districts.contains(house.getDistrict())) {
                result.add(house);
            }

        }
        return result;
    }

}
