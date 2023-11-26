# **PADRÕES DE PROJETOS DE SOFTWARE COM JAVA**

## (ARA1392 / 2023.2 / _Disciplina Digital_ / Turma 9001)

1.  Ref.: 3990966 Pontos: 1,00 / 1,00

    As mensagerias são um ferramental de ampla utilização em ambientes corporativos, e entre os diferentes tipos de EJBs, os MDBs são os componentes responsáveis pelo comportamento assíncrono do sistema, baseado na utilização de mensagerias. Assinale a alternativa correta com relação aos Message Driven Benas, ou MDBs:

    - São definidos pela anotação @Message.
    - ✅ Tratam as mensagens através de seu único método, denominado onMessage.
    - Eles podem guardar informações de estado.
    - Precisam implementar a interface SessionListener.
    - Necessitam de interfaces @Local e @Remote.

2.  Ref.: 3990967 Pontos: 1,00 / 1,00

    Padrões arquiteturais definem os componentes estruturais de um sistema, e a forma de comunicação entre eles ou com outros sistemas, organizando as regras gerais para a concepção de aplicativos com algum perfil funcional específico. Plataformas de objetos distribuídos, como o CORBA, trabalham em um padrão arquitetural denominado:

    - Pipeline
    - PAC
    - Event-Driven
    - ✅ Broker
    - MVC

3.  Ref.: 3990960 Pontos: 1,00 / 1,00

    A arquitetura oferecida pelo JPA modificou a forma do Java lidar com os dados, e o conhecimento acerca de suas características é fundamental para todo programador que utilize a plataforma. Assinale a alternativa INCORRETA acerca do JPA:

    - Trabalha com código anotado Java.
    - Precisa de um arquivo de configuração denominado persistence.xml.
    - Permite mapear os relacionamentos da base de dados.
    - ✅ Com a adoção do JPA eliminamos a necessidade do JDBC.
    - É o mecanismo padrão de ORM do Java.



### 02683 - PADRÕES GOF COMPORTAMENTAIS

4.  Ref.: 6068986 Pontos: 1,00 / 1,00

    "Permitir que um módulo cliente acesse sequencialmente os objetos de uma coleção, sem que esse módulo precise conhecer a representação interna dessa coleção, ou seja, a coleção pode ser uma lista encadeada, um vetor, uma árvore, ou qualquer outra estrutura".

    Assinale a alternativa com o nome do padrão que possui esse propósito:

    - Template Method
    - Mediator
    - ✅ Iterator
    - Command
    - Observer

5.  Ref.: 6068804 Pontos: 1,00 / 1,00

    Na implementação desse padrão, cada objeto de uma estrutura hierárquica deve definir uma operação Accept, que recebe um objeto de uma classe X como parâmetro. A classe X, por sua vez, implementa uma interface genérica Z, definindo uma operação específica de tratamento para cada tipo de objeto que pertença à estrutura hierárquica.

    Assinale a opção com o nome do padrão cuja estrutura de solução foi descrita no enunciado.

    - ✅ Visitor
    - State
    - Strategy
    - Template Method
    - Observer

### 02684 - PADRÕES GOF DE CRIAÇÃO

6.  Ref.: 6041024 Pontos: 0,00 / 1,00

    Analise a estratégia de solução a seguir:

    ''Definir um construtor private e implementar uma operação estática que retorna uma instância criada em uma operação com escopo static e armazenada como um atributo static dentro da própria classe''.

    Assinale a alternativa com o nome do padrão que define essa estratégia:

    - Factory Method 👈🏽❌
    - Builder
    - Singleton ✅
    - Abstract Factory
    - Prototype

7.  Ref.: 6041029 Pontos: 0,00 / 1,00

    Os iteradores de coleção em Java obtidos a partir da interface Collection são implementados com a aplicação de qual padrão de projeto?

    - Builder
    - Factory Method ✅
    - Prototype 👈🏽❌
    - Singleton
    - Abstract Factory

### 02685 - PADRÕES GOF ESTRUTURAIS

8.  Ref.: 6040998 Pontos: 1,00 / 1,00

    Assinale o padrão que utiliza uma fábrica de objetos de modo a gerenciar a instanciação e o compartilhamento de objetos imutáveis utilizados em larga escala em um sistema:

    - Composite
    - Proxy
    - Facade
    - Adapter
    - Flyweight 👈🏽✅

### 02686 - PADRÕES GRASP

9.  Ref.: 6076573 Pontos: 0,00 / 1,00

    Assinale a alternativa com a afirmação CORRETA sobre o padrão Controlador.

    - O módulo Controlador centraliza a interação do usuário com o sistema, capturando os eventos externos e controlando o fluxo de navegação das telas e janelas do sistema.
    - O módulo Controlador coordena e controla os módulos responsáveis pela produção da resposta a eventos lógicos de sistema gerados pela camada de interface com o usuário. ✅
    - O módulo Controlador centraliza o código relacionado à lógica de negócio do sistema ou de um caso de uso.
    - Em uma aplicação Java web, o módulo controlador pode ser implementado como um servlet. 👈🏽❌
    - O padrão Controlador proposto pelo GRASP equivale ao padrão GoF Strategy.

10. Ref.: 6090104 Pontos: 1,00 / 1,00

    Uma classe X acessa diretamente os atributos públicos de uma classe Y. Que tipo de acoplamento existe entre X e Y?

    - Acoplamento de Estrutura
    - Acoplamento de Conteúdo 👈🏽✅
    - Acoplamento de Dados
    - Acoplamento Global
    - Acoplamento Externo
