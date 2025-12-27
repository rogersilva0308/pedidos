Critérios de Aceitação:
. Deve ser possível salvar um novo usuário com os campos: nome e email.
. Deve ser possível buscar um usuário pelo ID.
. Deve ser possível listar todos os usuários.
. Apenas o nome do usuário pode ser atualizado.
. Não deve ser possível deletar um usuário.

Refinamento Técnico:
. Criar um Model para o Usuário.
. Criar um Repository para o Usuário.
. Criar um Service para o Usuário e implementar a lógica de negócio.
. Criar um Controller para o Usuário.
. Criar a rota de delete retornando um erro 405 (Method Not Allowed).