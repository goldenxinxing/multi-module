package org.example.submodule.one;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class UserEntity {
    private String name;
    private int age;
    private String address;
}
