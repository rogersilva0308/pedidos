Layered Architecture

Detalhamendo os papéis:

. Model > Representa as entidades do domínio (ex.: User, Product). Normalmente mapeadas para tabelas do banco.
. Repository > Responsável pelo acesso aos dados (CRUD). Abstrai o banco de dados e evita SQL espalhado pela aplicação.
. Service > Onde fica a lógica de negócio: regras, validações, transações e orquestração entre repositórios.
. DTO (Data Transfer Object) > Usado para transportar dados entre camadas, evitando expor diretamente o Model (boa prática para segurança e desacoplamento).
. Controller > Ponto de entrada das requisições externas (ex.: HTTP/REST). Recebe a request, chama o Service e devolve a resposta.