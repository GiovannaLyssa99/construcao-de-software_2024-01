# Pesquisa sobre REST API

## Introdução
As APIs desempenham um papel vital no desenvolvimento de software moderno, facilitando a comunicação entre diferentes sistemas e aplicativos. O REST API (Representational State Transfer Application Programming Interface), é um estilo arquitetural que se tornou uma abordagem dominante na criação de APIs para sistemas distribuídos na web. Vamos abordar alguns de seus conceitos e principais características.

## Definição de Conceitos

### API (Application Programming Interface)
Uma API é um conjunto de definições e protocolos que possibilitam a interação entre diferentes softwares. Elas estabelecem métodos e formatos de dados que os desenvolvedores podem utilizar para acessar e manipular funcionalidades específicas de um sistema ou serviço.

### REST (Representational State Transfer)
REST é um estilo arquitetural que se baseia em um conjunto de princípios fundamentais para o desenvolvimento de sistemas distribuídos na web. Esses princípios incluem a separação clara entre cliente e servidor, a ausência de estado (stateless), capacidade de cache, uma interface uniforme e a organização em camadas.

### REST API
Uma REST API é uma interface que segue os princípios do REST para permitir a comunicação entre sistemas distribuídos. Ela utiliza os métodos padrão do protocolo HTTP (como GET, POST, PUT e DELETE) para operar sobre recursos identificados por URIs (Uniform Resource Identifiers).

## Principais Características

**Arquitetura Cliente-Servidor:** Elas seguem o modelo cliente-servidor, onde o cliente envia requisições e o servidor responde, promovendo uma clara divisão de responsabilidades entre as partes.

**Stateless (Sem Estado):** O servidor não mantém nenhum estado da comunicação com o cliente entre requisições. Cada requisição do cliente deve conter todas as informações necessárias para que o servidor compreenda e processe a solicitação, o que o torna independente do estado do cliente.

**Interface Uniforme:** Utiliza URIs para identificar recursos e métodos HTTP para manipulá-los. Os métodos mais comuns são GET para recuperar recursos, POST para criar recursos, PUT para atualizar recursos e DELETE para remover recursos. Essa uniformidade torna a interface mais consistente e previsível.

**Sistema em Camadas:** Permite a implementação de sistemas distribuídos em camadas, onde cada camada tem uma funcionalidade específica e independente. Isso ajuda na modularidade e na escalabilidade do sistema.

**Cacheável:** As respostas de uma REST API podem ser cacheadas em diferentes pontos da rede (como no cliente ou em servidores intermediários) para melhorar o desempenho e a eficiência da comunicação entre o cliente e o servidor. Isso reduz a latência e a carga nos servidores, proporcionando uma melhor experiência para o usuário.