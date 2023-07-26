package hs.example.keycloak.oidc.api.v1.customer;

import jakarta.servlet.http.HttpServletRequest;
import java.security.Principal;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
//@Controller
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerDAO customerDAO;

    @GetMapping(path = "/")
    public String index() {
        return "external";
    }

    @GetMapping(path = "/customers")
    public String customers(HttpServletRequest request, Principal principal, Model model) {
        log.info("@@{}.{}",request, request.getUserPrincipal());
        addCustomers();
        model.addAttribute("customers", customerDAO.findAll());
//        model.addAttribute("username", principal.getName());
        return "customers";
    }

    // add customers for demonstration
    public void addCustomers() {

        Customer customer1 = new Customer();
        customer1.setAddress("1111 foo blvd");
        customer1.setName("Foo Industries");
        customer1.setServiceRendered("Important services");
        customerDAO.save(customer1);

        Customer customer2 = new Customer();
        customer2.setAddress("2222 bar street");
        customer2.setName("Bar LLP");
        customer2.setServiceRendered("Important services");
        customerDAO.save(customer2);

        Customer customer3 = new Customer();
        customer3.setAddress("33 main street");
        customer3.setName("Big LLC");
        customer3.setServiceRendered("Important services");
        customerDAO.save(customer3);
    }
}
