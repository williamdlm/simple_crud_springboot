## Nome do Projeto: CRUD com Spring Boot e H2

Este é um projeto de exemplo para demonstrar a implementação de um CRUD (Create, Read, Update, Delete) utilizando Spring Boot, H2 (banco de dados em memória), JPA e Spring Web. O projeto consiste em duas entidades principais: Pessoa (Person) e Veículo (Vehicle).

### Entidades:

#### Pessoa (Person):

A entidade Pessoa representa um indivíduo e possui os seguintes atributos:

- **id**: Identificador único da pessoa.
- **name**: Nome da pessoa.
- **vehicle**: Lista de veículos associados à pessoa.

#### Veículo (Vehicle):

A entidade Veículo representa um veículo e possui os seguintes atributos:

- **id**: Identificador único do veículo.
- **model**: Modelo do veículo.
- **owner**: Proprietário do veículo.

### Operações disponíveis:

#### Pessoa (Person):

- **GET /people**: Retorna todas as pessoas cadastradas.
- **GET /people/{id}**: Retorna uma pessoa específica pelo seu ID.
- **POST /people**: Cria uma nova pessoa.
- **DELETE /people/{id}**: Deleta uma pessoa pelo seu ID.

#### Veículo (Vehicle):

- **GET /vehicles**: Retorna todos os veículos cadastrados.
- **GET /vehicles/{id}**: Retorna um veículo específico pelo seu ID.
- **POST /vehicles**: Cria um novo veículo.

### Tecnologias Utilizadas:

- **Spring Boot**: Framework para criação de aplicativos Java.
- **H2**: Banco de dados em memória para desenvolvimento e testes.
- **JPA (Java Persistence API)**: Especificação de interface Java para gerenciamento de dados relacionais.
- **Spring Web**: Componente do Spring Framework para desenvolvimento de aplicativos web.

### Como Executar:

1. Clone o repositório do projeto.
2. Certifique-se de ter o Java JDK e o Maven instalados.
3. Navegue até o diretório raiz do projeto no terminal.
4. Execute o comando `mvn spring-boot:run`.
5. O servidor estará em execução e as operações podem ser acessadas através dos endpoints mencionados anteriormente.

### Observações:

- Este projeto utiliza um banco de dados H2 em memória para fins de desenvolvimento e testes. Os dados serão perdidos quando a aplicação for desligada.
- Para ambiente de produção, é recomendável configurar um banco de dados persistente como MySQL, PostgreSQL, etc.

Este é um exemplo básico de implementação de CRUD utilizando Spring Boot. Sinta-se à vontade para expandir e personalizar conforme necessário. Qualquer dúvida ou problema, não hesite em contatar.
