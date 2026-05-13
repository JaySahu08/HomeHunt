package E_CommerceWebApplication.E_CommerceApplication.Controller;

import E_CommerceWebApplication.E_CommerceApplication.Service.CustomerService;
import E_CommerceWebApplication.E_CommerceApplication.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/register")
    public Customer register(@RequestBody Customer customer) {

        customerService.register(customer);
        return customer;
    }

}
