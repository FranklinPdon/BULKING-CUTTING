# BULKING-CUTTING
App

Uma API para controle de calorias consumidas e gastas

## Endpoints
*  Dados

    - cadastrar

    - mostrar

    - alterar

* Registro de Calórico

  - Cadastrar

  - apagar

  - listar todas

  - Alterar

  - mostrar detalhes

  -----------  


## Cadastrar Dados


  `POST`   /cuttingbulking/api/dados

  

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

# Mostrar Detalhes Dados


  `GET`   /cuttingbulking/api/dados/{id}

  


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





     
