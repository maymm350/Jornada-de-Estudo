# Jornada de Estudo - Desenvolvimento Java Backend

Este repositório registra a evolução técnica em Java, com foco na construção de sistemas robustos e escaláveis para o setor financeiro e de tecnologia.

## Primeira Conquista: Motor de Análise de Risco

Aplicação de conceitos fundamentais de lógica de programação para resolver um problema de backend: a classificação automática de perfis para análise de crédito.

### O que foi aprendido e aplicado:
* Variáveis e Tipos Primitivos: Uso de int para idade e double para valores monetários.
* Estruturas Condicionais (if, else if, else): Criação de um fluxo de decisão para categorizar perfis.
* Operadores Lógicos (&&): Implementação de regras compostas para validação de requisitos.
* Visão de Engenharia: Foco na resolução de problemas práticos e na eficiência da lógica aplicada.

### Lógica do Código:
O sistema processa a idade e a renda para determinar a elegibilidade e a categoria de juros:
1. Alta Renda (> 5000): Categoria A (Juros Baixos).
2. Renda Média (2000 a 5000): Categoria B (Juros Médios).
3. Critérios não atendidos: Solicitação Recusada por política de risco.

---

## Segunda Conquista: Calculador de Solvência Financeira

Evolução da lógica para incluir cálculos aritméticos e validações de margem consignável, simulando um motor de aprovação de crédito.

### O que foi aprendido e aplicado:
* Operadores Aritméticos: Uso de divisão e multiplicação para cálculos de parcelas e limites percentuais.
* Lógica de Comparação: Validação de margem de segurança (regra dos 30%).
* Formatação de Dados: Apresentação de valores monetários.

### Lógica do Código:
O sistema calcula o valor da parcela mensal e verifica se ela compromete mais de 30% da renda informada:
1. Cálculo da Parcela: Empréstimo / Prazo.
2. Cálculo do Limite: Renda * 0.3.
3. Validação: Se Parcela <= Limite, o crédito é aprovado.

---

## Terceira Conquista: Sistema de Combate RPG (POO)

Aplicação de Programação Orientada a Objetos (POO) para criar um sistema de combate dinâmico, gerenciando estados e interações entre múltiplos objetos.

### O que foi aprendido e aplicado:
* Interação entre Objetos: Métodos que recebem outros objetos como parâmetro.
* Gerenciamento de Estados: Uso de variáveis booleanas para controlar ações e estados de objetos.
* Encapsulamento de Lógica: Centralização de regras de negócio dentro da classe.
* Math Class: Uso de funções matemáticas para garantia de integridade dos dados.

### Lógica do Código:
O sistema simula um duelo entre entidades com as seguintes mecânicas:
1. Ataque Dinâmico: O dano é calculado com base no estado do alvo.
2. Sistema de Defesa: Redução de dano baseada em estado booleano.
3. Gerenciamento de Vida: Sistema de cura com travas de limite máximo.

---

## Quarta Conquista: Encapsulamento e Proteção de Dados

Implementação de modificadores de acesso e métodos de interface para garantir a integridade dos dados e a segurança das operações financeiras.

### O que foi aprendido e aplicado:
* Modificadores de Acesso: Uso do private para impedir o acesso direto e não autorizado aos atributos da classe.
* Métodos de Acesso (Getters): Criação de interfaces seguras para leitura de estados internos.
* Validação de Entrada: Implementação de lógica de proteção em métodos de alteração (depósito e saque).
* Segurança de Negócio: Garantia de que operações críticas só ocorram sob condições validadas.

### Lógica do Código:
A classe protege o saldo do cliente e gerencia as transações:
1. Depósito Protegido: Apenas valores positivos são aceitos.
2. Saque Validado: Exige valor positivo e saldo suficiente disponível.
3. Acesso Controlado: Saldo consultado via método específico.

---

## Quinta Conquista: Interação entre Objetos e Transferência

Desenvolvimento de lógica para transações entre diferentes instâncias de classes, simulando um fluxo real de transferência de valores em sistemas financeiros.

### O que foi aprendido e aplicado:
* Instanciação Múltipla: Criação e gerenciamento de múltiplos objetos a partir do mesmo molde.
* Orquestração de Métodos: Uso coordenado de métodos de diferentes objetos para realizar uma tarefa composta.
* Lógica de Transação: Sequenciamento de ações (saque seguido de depósito) para garantir a consistência da operação.

### Lógica do Código:
O sistema realiza a transferência de valores entre contas:
1. Origem: Executa a ação de saque após validação.
2. Destino: Recebe o valor através da ação de depósito.
3. Independência: Cada conta mantém seu estado e saldo de forma isolada.

---

## Sexta Conquista: Construtores e Regras de Inicializacao

Implementação de construtores para inicializacao de objetos com dados obrigatorios e aplicacao de regras de negocio no momento da criacao da conta.

### O que foi aprendido e aplicado:
* Construtores em Java: Metodos especiais executados no momento da instanciacao do objeto.
* Parametros de Inicializacao: Passagem de dados essenciais (titular, saldo inicial, idade) na criacao.
* Validacao Previa (Regras de Negocio): Aplicacao de estruturas condicionais dentro do construtor para bloquear criacoes invalidas (ex: restricao de idade minima).

### Lógica do Código:
O construtor valida as condicoes antes de instanciar o objeto:
1. Validacao de Idade: Verifica se o titular possui idade minima de 18 anos.
2. Inicializacao de Atributos: Atribui os valores iniciais de titular e saldo apenas se a validacao for atendida.
3. Seguranca Estrutural: Impede a existencia de objetos com estados invalidos no sistema.

---
*Repositório mantido para fins de registro de aprendizado e evolução técnica.*
