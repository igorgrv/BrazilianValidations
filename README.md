# Brazilian validations
**All the credits for the [Alura's course](https://www.alura.com.br/planos-cursos-online)**

## About the project

This project aims to **validate/format Brazilian standards**, such as:
* Dates
* Currency
* Numbers in full (155 = one hundred and fifty-five)
* Documents (CPF and CNPJ)
* Zip Code

### Zip Code
To locate the street, neighborhood and others, the "[API  Via Cep](http://viacep.com.br/)" was used, which was consumed via REST, using JAX-RS and Jersey.



## Download
```
<!-- https://github.com/caelum/caelum-stella/wiki/Download -->
<dependency>
	<groupId>br.com.caelum.stella</groupId>
	<artifactId>caelum-stella-core</artifactId>
	<version>2.1.2</version>
</dependency>
	
<!-- https://mvnrepository.com/artifact/org.javamoney/moneta -->
<dependency>
	<groupId>org.javamoney</groupId>
	<artifactId>moneta</artifactId>
	<version>1.3</version>
	<type>pom</type>
</dependency>
```
