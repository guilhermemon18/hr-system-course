package br.com.guilherme.payrollapi.feignClients;

import br.com.guilherme.payrollapi.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//não necessita mais URL quando se usa o EUREKA SERVER E CLIENT!
//o BALANCEAMENTO DE REQUISIÇÕES É FEITO AUTOMATICAMENTE pegando
// a porta de serviço que estiver disponível com base no nome "user-api"
//que foi definido!
@FeignClient(name = "user-api")
public interface UserFeign {

    @GetMapping(value = "/api/users/{id}")
    ResponseEntity<User> findById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<User>> findAll();
}
