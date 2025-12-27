Story: Criar serviço de para salvar dados de Produtos

Eu como dono do produto, quero que seja possível salvar os dados de produtos no sistema e buscar esses dados posteriormente.

Critérios de Aceitação:
Deve ser possível salvar um novo produto com os campos: nome e preço.
Deve ser possível buscar um produto pelo ID.
Deve ser possível listar todos os produtos.
Apenas o nome do produto pode ser atualizado.
Não deve ser possível deletar um produto.

Refinamento Técnico:
Criar um Model para o Produto.
Criar um Repository para o Produto.
Criar um Service para o Produto e implementar a lógica de negócio.
Criar um Controller para o Produto.