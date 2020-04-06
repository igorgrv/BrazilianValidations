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
To locate the street, neighborhood and others, I used the"[API  Via Cep](http://viacep.com.br/)".
**How to use?**
It's pretty much simple, we have to:
1. Inserting intIDE the pom.xml the viacep dependency (Downlaod below);
2. Creat the client;
3. Send the ZipCode into the "getEndereco";
4. Request the infos that you need;

```java
public class ZipCode {

	public static void main(String[] args) {
		ViaCEPClient client = new ViaCEPClient();
		try {
			ViaCEPEndereco address = client.getEndereco("05143120");
			System.out.println("State: " + address.getUf());
			System.out.println("Neighborhood: " + address.getBairro());
			System.out.println("Street: " + address.getLogradouro());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
```

## Download
```java
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

<dependency>
	<groupId>com.github.gilberto-torrezan</groupId>
	<artifactId>viacep</artifactId>
	<version>1.2.0</version>
</dependency>
```
