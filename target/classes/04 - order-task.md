Story: Criar serviço para salvar dados de Pedidos

Eu como dono do produto, quero que seja possível salvar os dados dos pedidos realizados, relacionando o usuário com os produtos que ele comprou, para que seja possível rastrear e consultar as compras realizadas.

Critérios de Aceitação:
. Deve ser possível salvar um novo pedido com os campos: usuário (ID do usuário) e produtos (lista de IDs dos produtos comprados), e opcionalmente data do pedido.
. Deve ser possível buscar um pedido pelo ID.
. Deve ser possível listar todos os pedidos.
. Não deve ser possível atualizar nenhum campo do pedido.
. Não deve ser possível deletar um pedido, devendo a rota de delete retornar um erro 405 (Method Not Allowed).

Refinamento Técnico:
. Criar um Model para o Pedido, relacionando o usuário com os produtos comprados.
. Criar um Repository para o Pedido.
. Criar um Service para o Pedido e implementar a lógica de negócio.
. Criar um Controller para o Pedido.
. Criar a rota de delete retornando um erro 405 (Method Not Allowed).
.
. Deve ser alterado o delete do produto que hoje não permite deletar nenhum produto para retornar erro somente se o produto estiver associado a um pedido.