package br.com.guilherme.payrollapi.resources;


import br.com.guilherme.payrollapi.domain.Payroll;
import br.com.guilherme.payrollapi.domain.User;
import br.com.guilherme.payrollapi.feignClients.UserFeign;
import br.com.guilherme.payrollapi.services.PayrollService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {

    private final PayrollService service;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){
        return ResponseEntity.ok().body(service.getPayment(workerId, payment));
    }
}
