package nhs.gps;

import org.keycloak.KeycloakSecurityContext;
import org.keycloak.representations.IDToken;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@Component
class UserRepository {

    private User user;

    User getUser(HttpServletRequest req) {

        KeycloakSecurityContext session = (KeycloakSecurityContext) req.getAttribute(KeycloakSecurityContext.class.getName());
        IDToken idToken = session.getIdToken();
        /*AccessToken accessToken = session.getToken();
        accessToken.getAuthorization();*/
        Map<String, Object> otherClaims = idToken.getOtherClaims();
        String nhsNo ="";
        if (otherClaims.containsKey("nhsNumber")) {
            nhsNo = String.valueOf(otherClaims.get("nhsNumber"));
        }
        user = new User(idToken.getId(),idToken.getEmail(),idToken.getPreferredUsername(),idToken.getName(),idToken.getGivenName(),idToken.getFamilyName(),nhsNo);
        return user;
    }

}