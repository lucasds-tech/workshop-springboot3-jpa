<h1 align="center">Projeto web services com <br>Spring Boot e JPA / Hibernate</h1>

###

<h3 align="left">📑 Sobre</h3>

###

<p align="left">Este projeto envolve a implementação de um modelo de domínio, com a criação de camadas lógicas de resource e service, visando uma arquitetura organizada e eficiente. Foi configurado um banco de dados de teste utilizando o H2, e implementado o tratamento de exceções. Além disso, foi desenvolvido um conjunto de operações CRUD (Create, Retrieve, Update, Delete) para gerenciar os dados de forma eficaz.</p>

###

<h3 align="left">⚙ Linguagens e ferramentas</h3>

###

<div align="left">
  <img src="https://img.shields.io/badge/Spring-6DB33F?logo=spring&logoColor=black&style=for-the-badge" height="30" alt="spring logo"  />
  <img width="12" />
  <img src="https://img.shields.io/badge/PostgreSQL-4169E1?logo=postgresql&logoColor=white&style=for-the-badge" height="30" alt="postgresql logo"  />
  <img width="12" />
  <img src="https://img.shields.io/badge/Apache Maven-C71A36?logo=apachemaven&logoColor=white&style=for-the-badge" height="30" alt="apachemaven logo"  />
  <img width="12" />
  <img src="https://img.shields.io/badge/Postman-FF6C37?logo=postman&logoColor=black&style=for-the-badge" height="30" alt="postman logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/vscode/vscode-original.svg" height="30" alt="vscode logo"  />
</div>

###

<h3 align="left">💻 Funcionamento | Exemplo de uso</h3>
## Instalação

1. Clone o repositorio:

```bash
git clone https://github.com/lucasds-tech/workshop-springboot3-jpa.git
```

2. Instale as dependencias com Maven

## Uso

1. Utilize a aplicação com Postman / Maven 
2. A API estará acessível no local em http://localhost:8080 ou remotamente https://pghero-dpg-cud8jg52ng1s73bee55g-a.onrender.com.

```bash
src/main/rosources/application.properties. (para localhost) spring.profiles.active=test  ||  (para remoto 'RENDER') spring.profiles.active=prod
```



## Endpoints da API 
A API fornece os seguintes terminais:

**GET USERS**
```markdown
GET /users - Recuperar uma lista de todos os usuários.
```
```json
    {
        "id": 1,
        "name": "Lucas Silva",
        "email": "lucas.dasilva@gmail.com",
        "phone": "988888888"
        "password": "123456"
    }
    {
        "id": 2,
        "name": "Daniela Gomes",
        "email": "daniela.gomes@gmail.com",
        "phone": "977777777"
        "password": "123456"
    }
```

**POST USERS**
```markdown
POST /users - Registra um novo usuário no sistema 
```
```json
{
        "name": "Fulano",
        "email": "fulano.exemplo@gmail.com",
        "phone": "966666666"
        "password": "123456"
}
```


###
<p align="left">
  ┌── Aplicação <br>
  │  ├── Camada de recursos <br>
  │  │   ├── Camada de serviços <br>
  │  │   └── Camada de acesso a dados <br>
  │  └── Entidades 
</p>
<div align="left">
  <a href="https://ibb.co/bjqgksTm"><img src="https://i.ibb.co/GfBvqWyp/fim-projeto.png" alt="fim-projeto" border="0" /></a>
</div>

###

<h3 align="left">◽ Modelo de Domínio</h3>

###

<div align="left">
  <a href="https://ibb.co/HLk0YKwL"><img src="https://i.ibb.co/fVPbtX6V/modelo-de-dominio.png" alt="modelo-de-dominio" border="0" /></a>
</div>

###

<h3 align="left">◽ Modelo de instancias</h3>

###

<div align="left">
  <a href="https://imgbb.com/"><img src="https://i.ibb.co/j9MXBbNS/modelo-de-instancias.png" alt="modelo-de-instancias" border="0" /></a>
</div>

###
