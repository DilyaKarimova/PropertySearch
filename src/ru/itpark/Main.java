package ru.itpark;

import ru.itpark.comparator.HousePriceAscComparator;
import ru.itpark.comparator.HousePriceDscComparator;
import ru.itpark.domain.House;
import ru.itpark.repository.HouseRepository;
import ru.itpark.service.HouseService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseService service = new HouseService(new HouseRepository());

        service.add(new House("Советский",
                "квартира",
                2,
                4_000_000));
        service.add(new House("Приволжский",
                "дом",
                3,
                8_500_000));
        service.add(new House("Вахитовский",
                "квартира",
                1,
                5_000_000));

        service.add(new House("Вахитовский",
                "квартира",
                3,
                12_000_000));
        service.add(new House("Авиастроительный",
                "квартира",
                2,
                3_800_000));
        service.add(new House("Советский",
                "дом",
                4,
                9_000_000));
        service.add(new House("Кировский",
                "квартира",
                2,
                3_100_000));

        System.out.println(service.getSorted(new HousePriceAscComparator()));
        System.out.println();
        System.out.println(service.getSorted(new HousePriceDscComparator()));
        System.out.println();

        ArrayList<String> districts = new ArrayList<>();
        districts.add("Вахитовский");
        districts.add("Советский");

        System.out.println(service.findByDistrict(districts));

    }
}
