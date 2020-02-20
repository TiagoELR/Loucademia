package com.mycompany.loucademia.domain.aluno;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Telefone.class)
public abstract class Telefone_ {

	public static volatile SingularAttribute<Telefone, Integer> numeroCelular;
	public static volatile SingularAttribute<Telefone, Integer> numeroFixo;
	public static volatile SingularAttribute<Telefone, Integer> dddFixo;
	public static volatile SingularAttribute<Telefone, Integer> dddCelular;

	public static final String NUMERO_CELULAR = "numeroCelular";
	public static final String NUMERO_FIXO = "numeroFixo";
	public static final String DDD_FIXO = "dddFixo";
	public static final String DDD_CELULAR = "dddCelular";

}

