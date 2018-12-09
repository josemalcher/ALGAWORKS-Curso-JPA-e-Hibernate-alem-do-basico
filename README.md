# Curso JPA e Hibernate além do básico - um projeto completo


---

## <a name="indice">Índice</a>

- [1. Introdução](#parte1)   
- [2. Iniciando com JPA 2](#parte2)   
- [3. Preparando o ambiente](#parte3)   
- [4. Mapeamento Objeto-Relacional](#parte4)   
- [5. Conceitos e mapeamentos avançados - parte 1](#parte5)   
- [6. Trabalhando com consultas](#parte6)   
- [7. Conhecendo mais sobre o Entity Manager](#parte7)   
- [8. Consultas com Criteria](#parte8)   
- [9. Gravação e exclusão em cascata](#parte9)   
- [10. Conceitos e mapeamentos avançados - parte 2](#parte10)   
- [11. Outros detalhes importantes](#parte11)   


---

## <a name="parte1">1. Introdução</a>

#### v1.3-instalando-o-mysql-v1

- https://dev.mysql.com/downloads/

#### v1.5-criando-primeiras-tabelas-no-mysql-v1

```sql
# algawork_jpahibernate_cadclientes

CREATE TABLE cliente (
  codigo BIGINT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  idade INTEGER,
  sexo VARCHAR(1) NOT NULL,
  profissao VARCHAR(30),
  PRIMARY KEY (codigo)
);

insert into cliente(nome, idade, sexo, profissao) values("Jose", 34, "M", "Analista de sistemas");
insert into cliente(nome, idade, sexo, profissao) values("Maria", 24, "F", "Analista contabil");
insert into cliente(nome, idade, sexo, profissao) values("Marcia", 26, "F", "Administradora");
insert into cliente(nome, idade, sexo, profissao) values("Caio", 46, "M", "Engenheiro");
```

#### v1.6-mapeamento-objeto-relacional-v1

![Mapeamento obj relacional](imgs/map-obj-rel.png)

#### v1.7-relacionamento-entre-tabelas-v1

```sql
CREATE TABLE conta_corrente (
  codigo BIGINT NOT NULL AUTO_INCREMENT,
  numero VARCHAR(12) NOT NULL,
  saldo DECIMAL,
  codigo_cliente BIGINT NOT NULL,
  PRIMARY KEY (codigo),
  FOREIGN KEY (codigo_cliente) REFERENCES cliente (codigo)
);

insert into conta_corrente(numero, saldo, codigo_cliente) values( 448888, 120.00, 2);

select cli.nome,cc.saldo
from cliente cli, conta_corrente cc
where cli.codigo = cc.codigo_cliente

```

#### v1.8-instalando-e-configurando-o-eclipse-v1
 
- https://www.eclipse.org/downloads/

#### v1.9-download-e-configuracao-do-hibernate-v1

- http://hibernate.org/
 
#### v1.10-download-e-configuracao-do-driver-mysql-v1

- https://dev.mysql.com/downloads/connector/j/5.1.html

[Voltar ao Índice](#indice)

---

## <a name="parte2">2. Iniciando com JPA 2</a>


[Voltar ao Índice](#indice)

---

## <a name="parte3">3. Preparando o ambiente</a>


[Voltar ao Índice](#indice)

---

## <a name="parte4">4. Mapeamento Objeto-Relacional</a>


[Voltar ao Índice](#indice)

---

## <a name="parte5">5. Conceitos e mapeamentos avançados - parte 1</a>


[Voltar ao Índice](#indice)

---

## <a name="parte6">6. Trabalhando com consultas</a>


[Voltar ao Índice](#indice)

---

## <a name="parte7">7. Conhecendo mais sobre o Entity Manager</a>


[Voltar ao Índice](#indice)

---

## <a name="parte8">8. Consultas com Criteria</a>


[Voltar ao Índice](#indice)

---

## <a name="parte9">9. Gravação e exclusão em cascata</a>


[Voltar ao Índice](#indice)

---

## <a name="parte10">10. Conceitos e mapeamentos avançados - parte 2</a>


[Voltar ao Índice](#indice)

---

## <a name="parte11">11. Outros detalhes importantes</a>


[Voltar ao Índice](#indice)

---

