# Java - Exceptions

### Steps:

- Pilha de execução / Call stack ✅
  - Pilha de execução ✅
  - Saída da stack ✅
  - Sobre Stack ✅
  - Depuração ✅
  - Stack de debugger ✅
  - Fotografia da stack ✅
  - O que aprendemos? ✅
    - O que é, para que serve e como funciona a pilha de execução. ✅
    - O que é depuração (debug) e para que serve? ✅
    - Como utilizar o Eclipse e sua perspectiva de debug? ✅
    - Como alternar entre perspectivas do Eclipse. ✅
- Tratamento de exceções ✅
  - Introdução a exceções ✅
  - Sobre exceções ✅
  - Try Catch ✅
  - Sobre os blocos try e catch ✅
  - Variação do Catch ✅
  - Fluxo ✅
  - Multi catch ✅
  - O que aprendemos? ✅
    - O que são exceções, para que servem e porquê utilizá-las. ✅
    - Como analisar o rastro de exceções, ou stacktrace. ✅
    - Tratar exceções com os blocos `try-catch`. ✅
    - Manipular uma exceção lançada no bloco catch. ✅
    - Tratar múltiplas exceções com mais de um bloco catch ou usando Multi-Catch utilizando o pipe (`|`). ✅
- Lançando exceções ✅
  - Revisão ✅
  - Resumindo o conteúdo ✅
  - Lançando exceções ✅
  - Porque a exceção não foi lançada? ✅
  - Sobre o lançamento de exceções ✅
  - O que aprendemos? ✅
    - Como lançar exceções? ✅
    - Como atribuir uma mensagem à exceção? ✅
- Checked e Unchecked ✅
  - Hierarquia de exceções ✅
  - Miguel pede socorro! ✅
  - Entendendo erros ✅
  - Checked e unchecked ✅
  - Miguel pede socorro! Parte 2 ✅
  - Será que o Miguel entendeu a aula? ✅
  - Opcional: Testando erro ✅
  - O que aprendemos? ✅
    - Existe uma hierarquia grande de classes que representam exceções. Por exemplo, `ArithmeticException` é filha 
      de `RuntimeException`, que herda de `Exception`, que, é filha da classe mais ancestral das exceções, `Throwable`. Conhecer bem essa hierarquia significa saber utilizar exceções em sua aplicação. ✅
    - `Throwable` é a classe que precisa ser extendida para ser possível jogar um objeto na pilha (através da 
    palavra reservada `throw`) ✅
    - É na classe `Throwable` que temos praticamente todo o código relacionado às exceções, inclusive `getMessage()` e 
    `printStackTrace()`. O resto da hierarquia apenas possui algumas sobrecargas de construtores para comunicar mensagens específicas
    - A hierarquia iniciada com a classe `Throwable` é dividida em exceções e erros. Exceções são usadas em códigos de 
    aplicação. Erros são usados exclusivamente pela máquina virtual. ✅
    - Classes que herdam de `Error` são usadas para comunicar erros na máquina virtual. Desenvolvedores de aplicação 
    não devem criar erros que herdam de `Error`. ✅
    - `StackOverflowError` é um erro da máquina virtual para informar que a pilha de execução não tem mais memória. ✅
    - Exceções são separadas em duas grandes categorias: aquelas que são obrigatoriamente verificadas pelo compilador 
    e as que não são verificadas. ✅
    - As primeiras são denominadas checked sendo criadas através do pertencimento a uma hierarquia que não passe por 
    `RuntimeException`. ✅
    - As segundas são as unchecked, criadas como descendentes de RuntimeException. ✅