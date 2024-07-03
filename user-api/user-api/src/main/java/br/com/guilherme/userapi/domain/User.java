package br.com.guilherme.userapi.domain;

//lombok permite camuflar os getters e setters
//Mantendo-os disponíveis e reduzindo o código.
//Também permite gerar construtores com todos os argumentos
//assim como sem nenhum argumento.
//Automatiza esse processo de código mais verboso e genérico de classes em JAVA.
//Também automatiza o método equals e hashcode usados para comparação
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "TB_USER")
public class User {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private Double hourlyPrice;

}

