## [**02684] - PADRÕES GOF DE CRIAÇÃO**

1. A classe java.awt.Toolkit é um exemplo da aplicação de que padrão de projeto?
    - Builder
    - Abstract Factory
    - Prototype
    - Singleton
    - Factory Method
    
    > 💬 O padrão Abstract Factory é usado para criar famílias de objetos relacionados sem especificar suas classes concretas. A classe java.awt.Toolkit fornece uma interface para criar vários objetos relacionados, como Image, Font, Color, etc., sem a necessidade de especificar as classes concretas desses objetos. Em vez disso, ele utiliza uma fábrica abstrata para criar instâncias dos objetos apropriados, seguindo o conceito do padrão Abstract Factory. Desculpe pela confusão anterior e obrigado por esclarecer.
    > 
2. Analise o propósito a seguir:
    
    ''Implementar a instanciação de objetos utilizando uma estrutura de herança, em que a superclasse define uma operação de criação de um produto genérico, e cada subclasse define a implementação dessa operação, criando um produto específico derivado do produto genérico definido na superclasse''.
    
    Assinale a alternativa com o nome do padrão que possui esse propósito:
    
    - Abstract Factory
    - Factory Method
    - Builder
    - Prototype
    - Singleton

---

## [**02685] - PADRÕES GOF ESTRUTURAIS**

1. Você está desenvolvendo um sistema e percebe que está instanciando uma grande quantidade de objetos cujos atributos não mudam de valor durante toda a execução do programa. Muitos desses objetos instanciados são réplicas, o que gera uma utilização muito ineficiente da memória. Assinale a alternativa com o nome do padrão que poderia ser aplicado nesse cenário:
    - Flyweight
    - Decorator
    - Bridge
    - Singleton
    - Composite
    
    > 💬 O padrão que pode ser aplicado nesse cenário para economizar memória ao lidar com objetos que possuem atributos inalteráveis e muitas réplicas é o padrão Flyweight. O padrão Flyweight é projetado para minimizar o uso de memória ou recursos, compartilhando objetos que são semelhantes em vez de criar novas instâncias para cada ocorrência com os mesmos atributos imutáveis. Isso é útil quando você precisa lidar com uma grande quantidade de objetos com características comuns.
    > 
2. Assinale a alternativa com dois padrões que possuem uma estrutura de solução muito parecida, porém, com propósitos distintos.
    - Proxy e Composite.
    - Adapter e Composite.
    - Composite e Decorator.
    - Proxy e Adapter.
    - Adapter e Decorator.
    
    > 💬 Ambos os padrões, Composite e Decorator, possuem estruturas de solução muito parecidas, mas têm propósitos distintos. O padrão Composite é usado para compor objetos em estruturas de árvore para representar hierarquias de parte-todo, enquanto o padrão Decorator é usado para adicionar comportamentos ou responsabilidades adicionais a objetos individuais de forma flexível, sem alterar sua estrutura básica.
    > 

---

## [**02683] - PADRÕES GOF COMPORTAMENTAIS**

1. Assinale a alternativa que expressa a intenção do padrão de projeto Template Method:
    - Implementar a estrutura de um algoritmo genérico em uma superclasse, considerando que os passos comuns são implementados na própria superclasse, enquanto os passos específicos são implementados nas suas subclasses.
    - Encapsular uma família de algoritmos em objetos, permitindo que os módulos clientes possam utilizar esses algoritmos de forma intercambiável.
    - Encapsular uma requisição em um objeto, permitindo o registro do histórico de requisições disparadas pelos módulos cliente e a criação de filas de requisições.
    - Permite capturar o estado interno de um objeto, permitindo que o seu estado seja restaurado posteriormente, sem quebrar o encapsulamento desse objeto.
    - Definir uma relação de dependência entre objetos, de modo a garantir que modificações no estado do objeto detentor da informação sejam notificadas automaticamente para os objetos inscritos previamente como interessados em receber essas notificações.
    
    > 💬 Este padrão permite definir a estrutura geral de um algoritmo em uma superclasse e delegar a implementação de partes específicas desse algoritmo para subclasses. Isso permite reutilizar o código comum e personalizar o comportamento específico em cada subclasse.
    > 
2. "Seja um cenário em que existem vários objetos capazes de realizar o processamento associado a uma requisição. Esses objetos são organizados em uma lista encadeada de modo que a requisição vai sendo passada do primeiro objeto receptor da requisição para o próximo da lista, e assim sucessivamente, até que o resultado desejado seja atingido".
    
    Assinale a alternativa com o nome do padrão com esse propósito:
    
    - Mediator
    - Chain of Responsibility
    - Strategy
    - Command
    - Iterator
    
    > 💬 O Chain of Responsibility é usado quando você tem vários objetos que podem processar uma requisição e esses objetos são organizados em uma lista encadeada. A requisição é passada do primeiro objeto receptor da requisição para o próximo na lista, e assim por diante, até que o resultado desejado seja atingido ou até que nenhum objeto na cadeia seja capaz de processar a requisição. É uma forma de desacoplar remetentes e destinatários, permitindo que mais de um objeto tenha a chance de processar a requisição.
    > 

---

## [**02686] - PADRÕES GRASP**

1. Um módulo A contém operações como conversão de medidas, formatação de valores monetários, remoção de espaços duplicados em strings e envio/recepção de arquivos FTP.
    
    O módulo A possui coesão:
    
    - Temporal.
    - Coincidente.
    - Funcional.
    - Sequencial.
    - Procedural.
    
    > 💬 A coesão coincidente ocorre quando um módulo contém operações que não estão diretamente relacionadas, mas foram agrupadas por uma coincidência, como estar no mesmo módulo ou classe, por exemplo. No caso descrito, as operações de conversão de medidas, formatação de valores monetários, remoção de espaços duplicados em strings e envio/recepção de arquivos FTP não estão diretamente relacionadas por uma funcionalidade comum, mas foram agrupadas juntas em um único módulo por conveniência ou coincidência. Isso resulta em uma baixa coesão.
    > 
2. "Ao invés de colocarmos o cálculo do frete de um pedido na classe Pedido, optamos por criar uma hierarquia de classes para encapsular os diferentes algoritmos de cálculo de frete que temos no sistema".
    
    Assinale a alternativa com o nome do padrão GRASP que recomenda a criação de classes que não representam diretamente elementos concretos encontrados no domínio no negócio, seguindo uma decomposição de responsabilidades por comportamento e não por representação, como a descrita no cálculo do frete.
    
    - Acoplamento Baixo.
    - Especialista na Informação.
    - Invenção Pura.
    - Indireção.
    - Polimorfismo.
    
    > 💬 O princípio da Invenção Pura sugere que, em vez de colocar a responsabilidade em uma classe que não é naturalmente especialista em uma determinada funcionalidade (como a classe Pedido no caso do cálculo de frete), você deve criar uma nova classe que seja especializada na tarefa específica (no caso, cálculo de frete) e atribuir essa responsabilidade a essa nova classe especializada. Isso ajuda a manter a coesão e o baixo acoplamento em seu sistema.
    > 

---

## TECNOLOGIAS JPA E JEE

1. A arquitetura MVC (Model, View e Controller) é utilizada de forma ampla, na criação de sistemas cadastrais, e caracteriza-se pela divisão do sistema em três camadas, com objetivos específicos. Considerando a divisão utilizada pelo MVC, a interface de usuário e o componente DAO estariam, respectivamente, nas camadas:
    - View e Model
    - Model e Controller
    - Controller e Model
    - Model e View
    - View e Controller
    
    > 💬 Na arquitetura MVC (Model-View-Controller), a divisão é a seguinte:
    > 
    > 
    > Model: Lida com a lógica de negócios e a manipulação de dados.
    > View: Trata da interface de usuário (UI) e da apresentação dos dados.
    > Controller: Controla o fluxo da aplicação e atua como intermediário entre o Model e a View.
    > 
2. Ao trabalhar com um aplicativo corporativo, segundo a arquitetura MVC, ocorre uma divisão natural das camadas, em termos dos projetos internos, ficando a camada View sob responsabilidade do projeto com terminador "war". A interface padrão, conforme o próprio terminador indica, é um aplicativo Java Web, sendo comum a implementação de um padrão de desenvolvimento para centralizar o tratamento das requisições, bem como redirecionar para a visualização correta, após efetuar as chamadas para a camada Controller. De qual padrão estamos falando, e qual o componente deve implementá-lo?
    - Padrão de desenvolvimento Service Locator e componente do tipo JNDI
    - Padrão de desenvolvimento Front Controller e componente do tipo Servlet
    - Padrão de desenvolvimento Flyweight e componente do tipo EJB
    - Padrão de desenvolvimento DAO e componente do tipo JPA
    - Padrão de desenvolvimento Facade e componente do tipo EJB
    
    > 💬 O componente que geralmente implementa o Front Controller em aplicativos Java Web é do tipo Servlet. O Servlet atua como um controlador central que recebe todas as solicitações, decide qual Controller deve lidar com a solicitação e, em seguida, encaminha a solicitação para o Controller apropriado. Isso é uma prática comum em aplicativos da web baseados em Java EE (Enterprise Edition). Portanto, a resposta correta é:
    >