package com.mycompany.loucademia.domain.aluno;

import com.mycompany.loucademia.domain.aluno.Aluno.Sexo;
import com.mycompany.loucademia.domain.aluno.Aluno.Situacao;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Aluno.class)
public abstract class Aluno_ {

	public static volatile SingularAttribute<Aluno, Situacao> situacao;
	public static volatile SingularAttribute<Aluno, Telefone> telefone;
	public static volatile SingularAttribute<Aluno, Endereco> endereco;
	public static volatile SingularAttribute<Aluno, Integer> rg;
	public static volatile SingularAttribute<Aluno, String> matricula;
	public static volatile SingularAttribute<Aluno, String> nome;
	public static volatile SingularAttribute<Aluno, Sexo> sexo;
	public static volatile SingularAttribute<Aluno, LocalDate> dataNascimento;
	public static volatile SingularAttribute<Aluno, String> email;

	public static final String SITUACAO = "situacao";
	public static final String TELEFONE = "telefone";
	public static final String ENDERECO = "endereco";
	public static final String RG = "rg";
	public static final String MATRICULA = "matricula";
	public static final String NOME = "nome";
	public static final String SEXO = "sexo";
	public static final String DATA_NASCIMENTO = "dataNascimento";
	public static final String EMAIL = "email";

}

