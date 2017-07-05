package nhs.gps;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
class GpRepository {

    private static List<Gp> gps = Arrays.asList(
        new Gp(1L,"Leeds","Medical Practice 1","Morley Health Centre Corporation Street Morley","LS27 9NB","UK","0113 2954060","practice1@nhs.net"),
        new Gp(1L,"Leeds","Medical Practice 2","The Abbey Medical Centre Norman Street Leeds","LS5 3JN","UK","0113 2951844","practice2@nhs.net"),
        new Gp(1L,"Leeds","Medical Practice 3","Moor Grange Surgery 60 Moor Grange View","LS16 5BJ","UK","0113 2954880","practice3@nhs.net"),
        new Gp(1L,"Bradford","Medical Practice 4","Adwalton House Surgery 1 - 3 Wakefield Road Drighlington","BD11 1DH","UK","0113 285 3222","practice4@nhs.net"),
        new Gp(1L,"Leeds","Beech Tree Medical Centre","178 Henconner Lane Bramley","LS13 4JH","UK","0113 263 0112","medicalCentre@nhs.net")
  );

    List<Gp> findAll() {
        return gps;
    }

    Gp findOne(Long id) {
        return gps.stream().filter(gp -> gp.getId().equals(id)).findFirst().get();
    }
}
