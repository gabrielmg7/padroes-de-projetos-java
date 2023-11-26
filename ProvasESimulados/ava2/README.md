# **PADRÕES DE PROJETOS DE SOFTWARE COM JAVA**

## (ARA1392 / 2023.2 / _Disciplina Digital_ / Turma 9001)

### GABARITO AVALIANDO O APRENDIZADO 2

1.  Você precisa implementar um módulo que leia um arquivo RTF (Rich Text Format) e converta seu conteúdo em diferentes formatos (ASCII, TeX, HTML etc.). Sabendo que o arquivo é composto por diferentes partes (texto, formatação, figuras etc.), qual dos padrões seria mais indicado para isolar o conversor das diferentes formas de representação do conteúdo gerado?

    - Singleton
    - Prototype
    - Abstract Factory
    - Builder 👈🏽✅
    - Factory Method

2.  Conseguir adicionar um novo fornecedor externo de um serviço já utilizado por um sistema, apenas adicionando um módulo que seja capaz de converter uma requisição de uma interface conhecida pelo sistema para a interface proprietária fornecida pelo componente externo é um dos efeitos obtidos com a aplicação de qual padrão?

    - Facade
    - Flyweight
    - Bridge
    - Adapter 👈🏽✅
    - Proxy

    > **Comentário**:
    > O padrão Adapter é utilizado quando se deseja integrar um novo componente externo, que possui uma interface incompatível com a interface esperada pelo sistema. Ele permite que objetos com interfaces incompatíveis possam trabalhar juntos através de um adaptador, convertendo a interface do novo componente externo para uma interface compatível com o sistema.

3.  "Esse padrão encapsula uma requisição em um objeto, desacoplando o requisitante e o objeto executor. Esse encapsulamento permite registrar o histórico de requisições, reproduzir essas requisições em outro ambiente, bem como implementar operações de desfazer ou refazer o processamento associado à requisição".

    Assinale a alternativa com o nome do padrão que possui esse propósito:

    - Mediator
    - Command 👈🏽✅
    - Template Method
    - Iterator
    - Chain of Responsibility

    > O padrão Command encapsula uma solicitação como um objeto, permitindo que você parametrize clientes com operações, enfileire solicitações e suporte operações desfazer (undo) e refazer (redo). Isso permite que você defina e controle operações sem saber necessariamente a ação ou o destinatário específico dessa ação no momento em que o comando é emitido. Ao encapsular solicitações como objetos, o padrão Command permite a manipulação dessas solicitações, incluindo a possibilidade de registrar histórico de requisições, reexecutar solicitações em diferentes ambientes (através de serialização, por exemplo) e implementar facilmente operações de desfazer e refazer.

4.  "Ao invés de colocarmos o cálculo do frete de um pedido na classe Pedido, optamos por criar uma hierarquia de classes para encapsular os diferentes algoritmos de cálculo de frete que temos no sistema".

    Assinale a alternativa com o nome do padrão GRASP que recomenda a criação de classes que não representam diretamente elementos concretos encontrados no domínio no negócio, seguindo uma decomposição de responsabilidades por comportamento e não por representação, como a descrita no cálculo do frete.

    - Indireção.
    - Especialista na Informação.
    - Polimorfismo.
    - Invenção Pura. 👈🏽✅
    - Acoplamento Baixo.

    > **Comentário**:
    > O Controlador é responsável por manipular o fluxo de interação e coordenação entre as entidades e a lógica de negócio do sistema. Ele não representa diretamente um elemento concreto do domínio, mas gerencia o fluxo e as interações entre os objetos, distribuindo responsabilidades e coordenando as ações.

No exemplo do cálculo do frete, um Controlador poderia ser responsável por receber as requisições relacionadas ao cálculo de frete, coordenar a interação entre os objetos envolvidos (como os dados do pedido, informações sobre o cliente, cálculos específicos de frete) e invocar a lógica de negócio apropriada para realizar o cálculo de maneira eficaz e coordenada.

5.  O ferramental do JPA oferece diversos componentes, com finalidades específicas, no âmbito da persistência de dados, oferecendo um caminho comum para o mapeamento objeto-relacional. Qual componente, oferecido pelo JPA, é responsável pelo manuseio das diversas entidades?

    - Column
    - EntityManager 👈🏽✅
    - EntityManagerFactory
    - Transaction
    - Entity

    > **Comentário**:
    > O EntityManager é uma interface que gerencia o ciclo de vida das entidades no contexto de persistência. Ele é usado para realizar operações de persistência, consultas e transações no banco de dados. O EntityManager é capaz de realizar várias tarefas, como persistir entidades, recuperar entidades do banco de dados, remover entidades, executar consultas, controlar o contexto de persistência e gerenciar transações. Por meio do EntityManager, é possível realizar operações CRUD (Create, Read, Update, Delete) em entidades mapeadas, além de controlar a persistência, a sincronização de dados com o banco de dados e o gerenciamento de transações no contexto da aplicação.

6.  Analise o propósito a seguir:

    ''Permitir a criação de uma família de objetos relacionados ou dependentes, de forma que o módulo cliente não precise conhecer os objetos específicos das diferentes famílias, lidando apenas com as interfaces genéricas dos produtos dessas famílias''.

    Assinale a alternativa com o nome do padrão que possui esse propósito:

    - Prototype
    - Builder
    - Abstract Factory 👈🏽✅
    - Factory Method
    - Singleton

7.  Que padrão pode ser utilizado na implementação de uma estrutura hierárquica de diretório, em que existam pastas que podem conter pastas ou arquivos, sendo que algumas operações com as pastas devem ser aplicadas de forma recursiva aos elementos que fazem parte dela, isto é, outras pastas e arquivos?

    - Facade
    - Adapter
    - Composite 👈🏽✅
    - Flyweight
    - Proxy

    > **Comentário**:
    > O padrão Composite permite que você trate objetos individuais e composições de objetos de maneira uniforme através de uma mesma interface. Isso significa que tanto objetos individuais (como arquivos) quanto composições desses objetos (como pastas que contêm arquivos ou outras pastas) são tratados da mesma maneira. No contexto de uma estrutura hierárquica de diretórios, o padrão Composite permite que pastas e arquivos sejam representados através de uma interface comum. As pastas podem conter outras pastas ou arquivos, e operações podem ser aplicadas de forma recursiva, percorrendo toda a hierarquia de diretórios e afetando tanto os elementos individuais quanto suas composições. Por exemplo, ao executar uma operação como "deletar" ou "listar", o padrão Composite permite aplicar essa operação em uma pasta, que por sua vez pode ser uma composição de pastas e arquivos, fazendo com que a operação seja aplicada recursivamente a todos os elementos da hierarquia de diretórios, independente se são pastas ou arquivos.


8.  Esse padrão define uma estrutura similar à de um esquema Publisher-Subscriber, pois existe um Publisher detentor de um conjunto de informações e registra um conjunto de objetos interessados em receber notificações de modificação desse conjunto de informações, ou seja, do estado do Publisher. Ao ter o seu estado interno modificado, o Publisher notifica os Subscribers que, por sua vez, executam algum procedimento específico de tratamento dessa modificação. Assinale a opção com o padrão correspondente à descrição acima:

    - Visitor
    - Template Method
    - Observer 👈🏽✅
    - Strategy
    - State

    > **Comentário**:
    > No padrão Observer, há um objeto chamado Publisher (também conhecido como Subject ou Observable) que mantém uma lista de objetos interessados, os Subscribers (também chamados de Observers). Quando o estado do Publisher é modificado, ele notifica automaticamente todos os seus Subscribers sobre essa modificação.

9.  Um módulo A contém operações como conversão de medidas, formatação de valores monetários, remoção de espaços duplicados em strings e envio/recepção de arquivos FTP.

    O módulo A possui coesão:

    - Sequencial.
    - Procedural.
    - Funcional.
    - Coincidente.
    - Temporal.

    > **Comentário**:
    > A coesão coincidente é um dos níveis mais baixos de coesão. Neste tipo de coesão, os elementos de um módulo estão juntos apenas por coincidência ou circunstância, sem relação lógica ou funcional direta entre eles. Cada parte do módulo pode realizar tarefas completamente diferentes e não necessariamente relacionadas. No caso do módulo descrito inicialmente, com operações de conversão de medidas, formatação de valores monetários, manipulação de strings e operações de FTP, se essas funcionalidades estiverem agrupadas juntas sem uma relação lógica ou funcional clara entre elas, poderia ser considerado um exemplo de baixa coesão coincidente.

10. Uma mudança essencial no modelo de programação Java, com a evolução do JEE, foi o uso de anotações nas diversas tarefas de configuração dos EJBs do aplicativo. Para que serve a anotação Local no ambiente de criação de EJBs?

    - Definir a interface de acesso às entidades do JPA.
    - Definir um contexto de persistência local para o Session Bean.
    - Definir a interface de acesso local ao pool de EJBs.
    - Definir um Stateful Session Bean.
    - Definir um Stateless Session Bean.
