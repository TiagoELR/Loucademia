package com.mycompany.loucademia.domain.acesso;

import com.mycompany.loucademia.domain.aluno.Aluno;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Acesso.class)
public abstract class Acesso_ {

	public static volatile SingularAttribute<Acesso, Aluno> aluno;
	public static volatile SingularAttribute<Acesso, LocalDateTime> entrada;
	public static volatile SingularAttribute<Acesso, LocalDateTime> saida;
	public static volatile SingularAttribute<Acesso, Integer> id;

	public static final String ALUNO = "aluno";
	public static final String ENTRADA = "entrada";
	public static final String SAIDA = "saida";
	public static final String ID = "id";

}

