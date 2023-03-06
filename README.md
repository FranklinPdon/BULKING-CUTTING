# BULKING-CUTTING
App

Uma API para controle de calorias consumidas e gastas

## Endpoints
*  Dados

    - cadastrar

    - mostrar

    - alterar

* Registro Calórico

  - Cadastrar

  - apagar

  - listar todas

  - Alterar

  - mostrar detalhes

  -----------  


## Cadastrar Dados /Altera Dados


  `POST`   /cuttingbulking/api/dados

  `PUT`   /cuttingbulking/api/dados/{id}

  

  **Campos da requisição**

 | Campo  | Tipo | Obrigatório  | Descrição|
| ------------- | ------------- | ------------- | ------------- | 
| nome  | String  | sim  | O nome do Usuário   |
| idade  | int  | sim  | a idade do usuário  |
| sexo_id  | int | sim  | o id previamente  cadastrado no sistema  |
|objetivo|int|sim|o id previamente  cadastrado no sistema  |
| peso  | float  | sim  | o peso do usuário(kg) |
| altura  | int  | sim  | a altura em cm   |

  **Exemplo de corpo de requisição**

```JS

{
 nome: "Fred Franklin ford",
 idade:32,
 sexo_id: 2,
 objetivo_id:1,
 peso:88.8,
 altura:188
}
```
**Respostas**

| código| descrição
|-------|----------
| 201   | dados cadastrados com sucesso
| 400   | campos inválidos

# Mostrar Detalhes Dados/GETALL


  `GET-ID`   /cuttingbulking/api/dados/{id}

  `GET-ALL`   /cuttingbulking/api/dados/

  


  **Exemplo de corpo de requisição**

```JS

{
 nome: "Fred Franklin ford",
 idade:32,
  sexo{
        sexo_id: 2,
        nome:"Masculino"
      }
  objetivo{
        sexo_id: 1,
        nome:"Perda de Peso"
        valor:"5"
      }
 sexo_id:2,
 objetivo_id:1,      
 peso:88.8,
 altura:188
}
```
**Respostas**

| código| descrição
|-------|----------
| 200   | dados retornados
| 404   | não existe dados para id informado


------------------------------------------------------------

## Cadastrar Registro Calórico/Altera Registro Calórico


  `POST`   /cuttingbulking/api/registrocalorico

  `PUT`   /cuttingbulking/api/registrocalorico/{id}



  

  **Campos da requisição**

 | Campo  | Tipo | Obrigatório  | Descrição|
| ------------- | ------------- | ------------- | ------------- | 
| tipo  | int  | sim  | o id previamente  cadastrado no sistema   |
| descrição  | String  | sim  | descrição ref. tipo  |
| data | date | sim  | data do registro  |
|Calorias|float|sim| quantidade de calorias  |


  **Exemplo de corpo de requisição**

```JS

{
 tipo_id: 1,
 descrição:"Natação",
 data: 2023-06-03 11:59:32,
 caloria:128.85,
 
}
```
**Respostas**

`POST`

| código| descrição
|-------|----------
| 201   | registro calórico cadastrados com sucesso
| 400   | campos inválidos

`PUT`

| código| descrição
|-------|----------
| 201   | registro calórico  cadastrados com sucesso
| 400   | campos inválidos

# Mostrar Detalhes Registro Calórico /GETALL


  `GET`   /cuttingbulking/api/registrocalorico/{id}

  `GETALL`   /cuttingbulking/api/registrocalorico/

  


  **Exemplo de corpo de requisição**

```JS

{
  tipo{
    tipo_id:1
    nome:"Atividade"
  }
 tipo_id: 1,
 descrição:"Natação",
 data: 2023-06-03 11:59:32,
 caloria:128.85,
 
}
```
**Respostas**

| código| descrição
|-------|----------
| 200   | Registro Cálorico retornados
| 404   | não existe dados para id informado



# Apaga Registro Calórico



`DELETE`   /cuttingbulking/api/registrocalorico/{id}


| código| descrição
|-------|----------
| 200   | Registro Cálorico retornados
| 404   | não existe dados para id informado



# Filtros Registros Calóricos

 **Filtro por Tipos de Atividades**

`GET`   /cuttingbulking/api/registrocalorico?tipo={id}


----------------------------------------------------------------

**Filtro por datas**
`GET`   /cuttingbulking/api/registrocalorico?data="today"

`GET`   /cuttingbulking/api/registrocalorico?data="yesterday"

`GET`   /cuttingbulking/api/registrocalorico?data="week"

`GET`   /cuttingbulking/api/registrocalorico?data="month"

`GET`   /cuttingbulking/api/registrocalorico?data="year"


     