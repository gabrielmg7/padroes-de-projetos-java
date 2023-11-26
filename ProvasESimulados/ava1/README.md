# **PADRÕES DE PROJETOS DE SOFTWARE COM JAVA**

## (ARA1392 / 2023.2 / _Disciplina Digital_ / Turma 9001)

### GABARITO - AVALIANDO O APRENDIZADO 1

1. A classe java.awt.Toolkit é um exemplo da aplicação de que padrão de projeto?

    - Singleton
    - Factory Methodsss
    - Builder
    - Abstract Factory 👈🏽✅
    - Prototype



2. Sobre o padrão Composite, assinale a alternativa correta:

    - Esse padrão é utilizado na composição de adaptadores para serviços implementados por componentes de terceiros.
    - Esse padrão é apropriado para situações em que operações sobre o todo não devam ser aplicadas de forma recursiva às suas partes.
    - O conceito de polimorfismo não está presente na solução proposta pelo padrão.
    - Esse padrão permite manipular agregados e seus elementos com uma interface uniforme, isto é, com as mesmas operações.
    - Esse padrão é orientado para construção e manipulação de grafos cíclicos de objetos.

3.  Você está desenvolvendo um sistema que produz informações guardadas em um ou mais objetos que só devem ser armazenados em um banco de dados após o processamento ser concluído. Entretanto, esses dados estão vinculados a uma sessão de usuário, que pode ser interrompida em função de problemas de conexão. Esse padrão oferece uma solução que permite que um objeto A capture e salve todo o estado de um objeto B da sessão, sem que A tenha que quebrar o encapsulamento de B, tornando possível a restauração do estado do objeto B, a partir de um estado capturado anteriormente por A.

    Assinale a alternativa com o nome do padrão que corresponde a essa estratégia de solução:

    - Command
    - Memento 👈🏽✅
    - Observer
    - Mediator
    - Strategy

4. Assinale a alternativa que apresenta os níveis de acoplamento entre módulos ordenados do mais baixo para o mais alto:

    - Estrutura - Dados - Controle - Conteúdo - Global - Externo
    - Dados - Controle - Estrutura - Externo - Conteúdo - Global
    - Dados - Estrutura - Controle - Externo - Global - Conteúdo 👈🏽✅
    - Dados - Estrutura - Externo - Controle - Conteúdo - Global
    - Estrutura - Dados - Controle - Global - Externo - Conteúdo

    > **Cometário**: 
    > O nível de acoplamento está relacionado à forma com que uma relação de dependência é estabelecida entre dois módulos. Do nível mais baixo para o mais alto há: acoplamento de dados, quando um módulo se comunica com outro passando apenas os dados dos quais o módulo chamado precisa para cumprir a sua responsabilidade. Seguido de acoplamento de estrutura que utiliza apenas um pequeno subconjunto de dados da estrutura quando um módulo chamador passa uma estrutura de dados para um módulo chamado. Depois, o acoplamento de controle que ocorre quando um módulo controla a lógica interna de outro módulo por meio da passagem de alguma informação de controle. O acoplamento externo ocorre quando módulos compartilham alguma parte do ambiente externo ao software. Já o acoplamento global ocorre quando há comunicação por meio de recursos como variáveis globais. Por fim, o acoplamento de conteúdo que ocorre quando um módulo utiliza aspectos de implementação de outro módulo.

5. Uma mudança essencial no modelo de programação Java, com a evolução do JEE, foi o uso de anotações nas diversas tarefas de configuração dos EJBs do aplicativo. Para que serve a anotação Local no ambiente de criação de EJBs?

    - Definir um Stateful Session Bean.
    - Definir um contexto de persistência local para o Session Bean. 👈🏽❌
    - Definir um Stateless Session Bean.
    - Definir a interface de acesso local ao pool de EJBs. ✅
    - Definir a interface de acesso às entidades do JPA.

6. Analise o propósito a seguir:

    ''Implementar a instanciação de objetos utilizando uma estrutura de herança, em que a superclasse define uma operação de criação de um produto genérico, e cada subclasse define a implementação dessa operação, criando um produto específico derivado do produto genérico definido na superclasse''.

    Assinale a alternativa com o nome do padrão que possui esse propósito:

    - Singleton
    - Prototype
    - Builder
    - Abstract Factory
    - Factory Method 👈🏽✅



7. Implementar um componente para cada fornecedor de um determinado serviço, supondo que possamos ter diferentes fornecedores com APIs proprietárias para esse serviço utilizado pelo nosso sistema, de modo que esse componente converta uma requisição genérica do serviço utilizado pelos módulos clientes do sistema em chamadas específicas da API do fornecedor externo. Essa descrição corresponde à estrutura de solução de qual padrão?

    - Adapter 👈🏽✅
    - Facade
    - Prototype
    - Flyweight
    - Composite


8. "Na implementação de um processo complexo, um módulo A chama operações de um módulo B e de um módulo C. B, por sua vez, chama operações de C e de D. O módulo C chama operações de A e de E. O módulo D chama operações dos módulos B e C".

    Esse cenário ilustra uma interação entre objetos no estilo muitos para muitos. Para simplificar esse processo, define-se um objeto que centraliza todas as interações entre esses objetos, de modo que eles passam a se comunicar apenas com esse elemento central. Dessa forma, o elemento central X passa a receber uma notificação de A, para então chamar operações de B e C. Da mesma maneira, a partir de uma notificação enviada por B, X chama operações de C e de D.

    Essa descrição corresponde à estrutura de solução de qual padrão?

    - Chain of Responsibility
    - Template Method
    - Strategy
    - Mediator
    - Visitor

9. Assinale a alternativa que contém tipos de coesão de um módulo em ordem do tipo de coesão mais baixa para a mais alta:

    - Procedural - Sequencial - Comunicação
    - Procedural - Lógica - Funcional
    - Lógica - Coincidente - Sequencial
    - Coincidente - Temporal - Sequencial 👈🏽✅
    - Temporal - Lógica - Procedural

    > Comentário:
    > A coesão de um módulo é classificada de acordo com o critério utilizado para reunir o conjunto dos elementos que o compõem. Em ordem de um nível baixo para o mais alto temos: coesão Coincidente onde os elementos estão agrupados em um módulo de forma arbitrária. Seguido da Temporal quando todas as operações são executadas na inicialização do sistema. E a Sequencial, onde resultados de um passo são utilizados como entrada para o passo seguinte.

10. Ao trabalhar com um aplicativo corporativo, segundo a arquitetura MVC, as camadas Model e Controller são definidas ao nível do projeto interno com o terminador "ejb", e o NetBeans oferece ferramentas de automatização para a geração dos componentes necessários, com utilização de duas tecnologias específicas. Quais são as tecnologias utilizadas para as duas camadas citadas, respectivamente?

    - JSP e Servlet
    - JPA e EJB 👈🏽✅
    - EJB e Servlet
    - Servlet e JPA
    - JPA e JSP



