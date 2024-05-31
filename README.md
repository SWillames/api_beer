# API Beer

API Beer é um projeto para gerenciar informações sobre cervejas.

## Descrição

Este projeto é uma API construída em Java para gerenciar um banco de dados de cervejas, permitindo operações como criação, leitura, atualização e exclusão de registros.

## Instalação

### Pré-requisitos

- Java 11 ou superior
- Maven

### Passos para instalação

1. Clone o repositório:
    ```sh
    git clone https://github.com/SWillames/api_beer.git
    ```
2. Navegue até o diretório do projeto:
    ```sh
    cd api_beer
    ```
3. Compile o projeto com Maven:
    ```sh
    mvn clean install
    ```

## Uso

Para iniciar a aplicação, execute o seguinte comando:
```sh
mvn spring-boot:run
```
A API estará disponível em `http://localhost:8080`.

## Endpoints

- `GET /beers` - Lista todas as cervejas
- `GET /beers/{id}` - Retorna os detalhes de uma cerveja específica
- `POST /beers` - Adiciona uma nova cerveja
- `PUT /beers/{id}` - Atualiza as informações de uma cerveja existente
- `DELETE /beers/{id}` - Remove uma cerveja do banco de dados

## Contribuição

1. Faça um fork do projeto
2. Crie uma nova branch:
    ```sh
    git checkout -b feature/minha-feature
    ```
3. Faça as modificações e commit:
    ```sh
    git commit -m 'Adiciona minha feature'
    ```
4. Envie para o repositório remoto:
    ```sh
    git push origin feature/minha-feature
    ```
5. Abra um Pull Request

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](https://choosealicense.com/licenses/mit/) para mais detalhes.

## Contato

SWillames - [Seu LinkedIn](https://www.linkedin.com/in/seulinkedin/)
