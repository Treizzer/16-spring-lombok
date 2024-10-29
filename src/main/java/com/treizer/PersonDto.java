package com.treizer;

import java.time.LocalDate;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.Value;

// Generate: specify the attributes as PRIVATE and finals, Getters, AllArgsConstructor, ToString, Equals and hashCode
@Value // To Immutable Classes (as DTOs)
// Forces you to send values to attributes marked as final and NonNull
@RequiredArgsConstructor
@ToString(includeFieldNames = false)
public class PersonDto {

    // private final Long id;
    Long id;

    @NonNull // Never can being null
    String name;
    String lastName;
    String email;
    Byte age;
    Integer phoneNumber;
    LocalDate dateBirth;

}
