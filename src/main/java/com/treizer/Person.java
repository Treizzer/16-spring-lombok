package com.treizer;

import java.time.LocalDate;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

// This doesn't implements FieldDefaults
// @Data
// @Getter(value = AccessLevel.PROTECTED)
@Getter
@Setter
// @ToString(exclude = { "name", "age" })
// @ToString(includeFieldNames = false)
// @ToString(of = { "id", "name" })
// @ToString(callSuper = true) // Inheritance
@ToString
@NoArgsConstructor
// @AllArgsConstructor(access = AccessLevel.PRIVATE)
// @AllArgsConstructor(staticName = "of") // Look Main
@AllArgsConstructor
// Define the attributes as Private, Protected or Public.
// makeFinal only works if no user NoArgsConstructor
// @FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
// (exclude = {"name"}, of = {"id", "name"}, )
// @EqualsAndHashCode(doNotUseGetters = true)
@EqualsAndHashCode
// (access = AccessLevel.PRIVATE, )
// @Builder(buildMethodName = "create")
// @Builder(builderClassName = "personConstructor")
@Builder
public class Person {

    // @Setter // You can typed one by one
    Long id;
    // public String name; // Major priority
    String name;
    String lastName;
    String email;
    Byte age;
    Integer phoneNumber;
    LocalDate dateBirth;

}
