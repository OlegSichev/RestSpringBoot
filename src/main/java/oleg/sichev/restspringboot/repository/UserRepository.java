package oleg.sichev.restspringboot.repository;

import oleg.sichev.restspringboot.service.Authorities;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(@RequestParam String user, @RequestParam String password) {
        List<Authorities> list = new ArrayList<>();
        if (user.equals("admin") && password.equals("1234")) {
            Collections.addAll(list, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("user") && password.equals("3652")) {
            Collections.addAll(list, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        }
        return list;
    }
}