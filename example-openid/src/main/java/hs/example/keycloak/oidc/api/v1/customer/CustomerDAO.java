package hs.example.keycloak.oidc.api.v1.customer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
