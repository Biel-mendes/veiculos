# Java: aplicando a Orientação a Objetos

Redigido por: Gabriel Mendes da Costas Portas.

# Introdução

Este é o segundo curso da formação de java focada em conhecer a linguagem e dominar os conceitos de orientação a objeto, seja muito bem vindo e espero que esse documento seja útil para você de alguma forma. Este documento trata-se da serie de cursos do Alura que estou fazendo sobre java.

# Orientação a Objetos

É um paradigma de linguagem, ou seja, como uma linguagem estrutura seus programas, no caso da programação orientada a objetos sua estrutura gira em torno de objetos que são instancias de classes, “o que raios isso quer dizer?” você me pergunta, bom isso significa que podemos fazer abstrações do mundo real, pense na classe “veículo” um objeto que poderia ser instanciado por essa classe seria o “carro”. Essa é a maior vantagem da POO(programação orientada a objetos), ela permite fazer abstrações de processos reais criando algo genérico como classe e especificando elas com objetos.       

## Abstração

É um dos pilares da POO consiste em abstrair processos do mundo real pegando as características mais relevantes para aquele processo possa ser simulado dentro do sistema.  

### Classe

É a forma genérica de como podemos referenciar uma entidade, nela passamos os atributos que são as características genéricas de algo e podemos passar também métodos que são as ações, também genéricas, que aquela entidade realiza. 

**Código:**

```java
public class Carro{
	//Atributos
	String marca;
	String modelo;
	int ano;
	//Métodos
	void acelerar(){
		//lógica do método
	}
	void freia(){
		//lógica do método
	}
}
```

**Diagrama:**

| Classe | CARRO |
| --- | --- |
| Atributo | -  marca |
| Atributo | - modelo |
| Atributo | - ano |
| Método | + acelerar( ) |
| Método | + freia( ) |

### Objetos

É uma instancia da classe, se a classe é uma entidade genérica, o objeto é a “entidade” especifica.

**Código:**

```java
Carro meuCarro = new Carro();
//Especificando os atributos
meuCarro.marca = "Toyota";
meuCarro.modelo = "Corolla";
meuCarro.ano = 2009;
//Usando os métodos da classe
meuCarro.acelera();
meuCarro.freia(); 
```

**Diagrama:**

| Objeto | meuCarro |
| --- | --- |
| Marca | Toyota |
| Modelo | Corolla |
| Ano | 2009 |

## Encapsulamento

É um conceito usado para restringir o acesso a edição, visualização e uso de um atributo de classe ou método. Isso protege a classe de receber dados que podem atrapalhar seu funcionamento ideal. 

### Modificadores de acesso

Para conseguirmos aplicar o encapsulamento, podemos utilizar os modificadores public, private e default. Esses modificadores são palavras reservadas do java que são usadas antes de declarar um atributo/método: `*public* void acelera();` , `*private* String modelo;` e se não colocarmos nada por padrão será default.

- public → permite que os atributos/métodos de uma classe possam ser acessados por qualquer outra mesmo estando em pacotes diferentes.
- private → nega todo tipo de acesso aos atributos/métodos de uma classe, não pode ser acessada por nem uma outra
- default → se assemelha com a public, porém permite acesso somente as classes presentes no mesmo pacote.

### Getters/Setters

São formas de modificar ou visualizar atributos privados de uma classe, por exemplo, quero que um atributo privado possa ser apenas visualizado mas não modificado tipo o painel de quilometragem de um carro, ou uma senha seja escolhida mas não visualizada. para isso usamos os getters(visualizar) e os setters(atribuir/modificar) são usados.

### Package

Usamos para agrupar classe relacionadas com uma funcionalidade, organizando o código e facilitando achar funcionalidades especificas.  

## Herança

É um conceito fundamental para orientação a objetos, com ela classes podem herdar atributos ou métodos de outras classes. Para te ajudar na compreensão pense em uma classe chamada veículos nela há, de forma genérica, todas as características de um veículo, agora pense em duas classe, uma chamada carro e outra chamada moto, elas tem características próprias, porém também tem as características da classe veículo, mas não são iguais.
Com esse exemplo note que uma classe pode ser herdada por varias outras, mas ela nunca pode herdar mais de uma classe.

```java
public class Veiculo{
    String modelo;
    String marca; 
    
    void acelerar();
    void freia();
}

public class Carro extends veículo{
    String portas;
}

public class Moto extends Veiculo{
    void empina();
}
```

No exemplo perceba que moto e carro tem tudo que veículo tem, mas atributos ou métodos amais e são diferentes uma das outras.

### Sobrescrita de Métodos

Uma característica muito útil da herança é a possibilidade de reescrever métodos, no exemplo a cima temos dois métodos um de acelerar e um de freia, esses métodos dentro das subclasses(classes que herdam) podem ter comportamentos diferentes, seguindo o exemplo uma moto acelera e freia de maneiras diferentes das de um carro. 

```java
public class Moto extends Veiculo{
    void empina();
    
    @override
    public void acelerar(){
	    //lógica de aceleração da moto
    }
    @override
    public void freia(){
	    //lógica de frenagem da moto
    }
}
```

Perceba que usando o “@override” podemos reescrever métodos da superclasse(classe que é herdada por outras).

obs: @override não é obrigatório, mas é boa prática.

### Interface

Quando temos métodos que são comuns em diversas outras classes podemos juntar esses métodos em uma interface, note que uma interface não é uma classe, não possui atributos, apenas declaração de métodos que podem ser herdados por uma classe.
No exemplo temos métodos `acelerar()` e `freia()` esses métodos são comum a todos os veículos que tem uma maneira individual de realiza-los.

 

```java
public interface Automovel {
    void acelerar();
    void freia();
}
public class Veiculo{
    String modelo;
    String marca;
}
public class Carro extends Veiculo implements Automovel{
    String portas;   
     @override
    public void acelerar(){
	    //lógica de aceleração do carro
    }
    @override
    public void freia(){
	    //lógica de frenagem do carro
}
public class Moto extends Veiculo implements Automovel{
    void empina();
     @override
    public void acelerar(){
	    //lógica de aceleração da moto
    }
    @override
    public void freia(){
	    //lógica de frenagem da moto
    }    
}
```

Uma observação importante é que, uma classe consegue ter varias herdar varias interfaces porém apenas uma classe como visto anteriormente. Herdando varias interface `public class Carro extends Veiculo implements Automovel, Abastecimento` 

## Polimorfismo

Permite que um método tenha diferentes comportamentos a depender do objeto que o tenha chamado. A sobrescrita de métodos é uma forma de aplicar o polimorfismo.
