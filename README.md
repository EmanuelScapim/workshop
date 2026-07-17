# SOBRE O PROJETO

Este é um projeto de back-end que construí usando Spring Boot para simular o motor de uma loja virtual: usuários, produtos, categorias, pedidos, itens de pedido e pagamentos, tudo conversando entre si através de relacionamentos JPA bem pensados.

A ideia por trás dele não foi reinventar o e-commerce, mas sim praticar (e deixar registrado) uma arquitetura em camadas limpa e organizada — aquele modelo clássico e eficiente Resource → Service → Repository → Entity que a gente vê tanto no dia a dia com Spring Boot.

# COMO O PROJETO ESTÁ ORGANIZADO
```
src/main/java/com/projeto/workshop/
├── entities/          → Entidades JPA (User, Product, Category, Order, OrderItem, Payment)
│   ├── enums/         → Enum de status do pedido (OrderStatus)
│   └── pk/            → Chave composta do OrderItem
├── repositories/       → Interfaces JpaRepository para acesso ao banco
├── resources/          → Controllers REST (endpoints da API)
│   └── exceptions/     → Tratamento centralizado de erros
├── services/            → Regras de negócio
│   └── exceptions/      → Exceções customizadas (recurso não encontrado, violação de integridade, etc.)
└── config/             → Configurações auxiliares (como o carregamento de dados de teste)
```

## TRATAMENTO DE EXCEÇÕES
O projeto tem um handler global de exceções, então os erros da API saem padronizados e com mensagens claras — seja quando um recurso não é encontrado, seja quando alguma regra do banco de dados é violada.
