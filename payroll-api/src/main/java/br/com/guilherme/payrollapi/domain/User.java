package br.com.guilherme.payrollapi.domain;

//lombok permite camuflar os getters e setters
//Mantendo-os disponíveis e reduzindo o código.
//Também permite gerar construtores com todos os argumentos
//assim como sem nenhum argumento.
//Automatiza esse processo de código mais verboso e genérico de classes em JAVA.
//Também automatiza o método equals e hashcode usados para comparação
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private Double hourlyPrice;

}

