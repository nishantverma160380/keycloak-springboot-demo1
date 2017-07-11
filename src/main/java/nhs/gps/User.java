package nhs.gps;

import lombok.Value;

@Value
class Gp {
    private final Long id;
    private final String city;
    private final String name;
    private final String street;
    private final String zip;
    private final String country;
    private final String tel;
    private final String email;
}
