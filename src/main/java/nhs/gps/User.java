package nhs.gps;

import lombok.Value;

@Value
class User {
    private final String id;
    private final String email;
    private final String username;
    private final String fullName;
    private final String first;
    private final String last;
    private final String nhsNo;
}