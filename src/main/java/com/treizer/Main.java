package com.treizer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.time.LocalDate;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

// @Log
@Slf4j
public class Main {

    // Lombok Spread the exception
    // @SneakyThrows(value = { IOException.class, FileNotFoundException.class })
    @SneakyThrows
    public static void main(String[] args) {
        // Person person = Person.of(1L, "Hugo", "Santana", "hugo@mail.com", 23, 12345,
        // LocalDate.now());
        Person person = new Person(1L, "Hugo", "Santana", "hugo@mail.com", (byte) 23, 12345, LocalDate.now());

        // System.out.println(person);

        // Person person2 = Person.builder()
        // .id(2L).name("Paco")
        // .build();

        PersonDto personDto = new PersonDto(person.getId(), person.getName(), person.getLastName(), person.getEmail(),
                person.getAge(), person.getPhoneNumber(), person.getDateBirth());

        // log.warning(personDto.toString());
        // log.info(personDto.toString());
        // log.info(personDto.toString());

        // @Cleanup // input.close()
        InputStream input = new FileInputStream("Archivo.txt");
        input.close();
    }

}