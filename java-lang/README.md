# Java.lang - classe Object e String

### Steps:

- Organizando as classes com Pacotes ✅
  - Criação de pacotes ✅
  - Sobre FQN ✅
  - Sobre pacotes ✅
  - Importando pacotes ✅
  - O melhor pacote ✅
  - Como compilar? ✅
  - Gerenciando pacotes com Eclipse ✅
  - Estrutura correta ✅
  - Você domina packages? ✅
  - O que aprendemos? ✅
    - packages servem para organizar o nosso código ✅
    - packages fazem parte do FQN (Full Qualified Name) da classe ✅
    - o nome completo da classe (FQN) é composto de: `PACKAGE.NOME_SIMPLES_CLASSE` ✅
    - a definição do package deve ser a primeira declaração no código fonte ✅
    - para facilitar o uso de classes de outros packages podemos importá-los ✅
    - os `imports` ficam logo após da declaração do `package` ✅
      - a nomenclatura padrão é usar o nome do domínio na web ao contrário com o nome do projeto, por exemplo:
      ```
      br.com.caelum.geradornotas 
      br.com.alura.gnarus 
      br.gov.rj.notas 
      de.adidas.lager
      ```
- Todos os modificadores de acesso ✅
  - Revisitando modificadores de acesso ✅
  - Sobre modificadores ✅
  - Qual modificador? ✅
  - Qual modificador? #2 ✅
  - O que aprendemos? ✅
    - existem 3 palavras chaves relacionado com a visibilidade: `private`, `protected`, `public` ✅
    - existem 4 níveis de visibilidade (de menor para maior):
      - `private` (visível apenas na classe)
      - `<<package private>>` (visível na classe E em qualquer outro membro do mesmo pacote, podendo ser chamado default)
      - `protected` (visível na classe E em qualquer outro membro do mesmo pacote E para qualquer filho)
      - `public` (visível em qualquer pacote)
    - os modificadores podem ser usados na definição da classe, atributo, construtor e método ✅
- Distribuição do seu código ✅
  - Conhecendo o Javadoc ✅
  - Qual comentário? ✅
  - Sobre o javadoc ✅
  - Para saber mais: Todas as tags ✅
  - Criando uma biblioteca com JAR ✅
  - O que é um JAR? ✅
  - JAR executável (Opcional) ✅
  - Para saber mais: Maven ✅
  - O que aprendemos? ✅
    - quais comentários e tags (anotações) a usar para definir o javadoc ✅
    - como gerar o javadoc no Eclipse ✅
    - que javadoc é uma documentação para desenvolvedores ✅
    - que as classes, Java padrão também usam javadoc ✅
    - como criar nossa própria biblioteca através do JAR (J*ava *ARchive) ✅
    - como importar a biblioteca no novo projeto ✅
    - como criar um JAR executável ✅
- O pacote java.lang ✅
  - Conhecendo java.lang ✅
  - Sobre java.lang ✅
  - Exceções do java.lang ✅
  - String e a imutabilidade ✅
  - A classe String ✅
  - Metodos da classe String ✅
  - A interface CharSequence ✅
  - O que aprendemos? ✅
    - o package `java.lang` é o único pacote que não precisa ser importado ✅
    - nele tem classes fundamentais que qualquer aplicação precisa, como a classe `String` e `System` ✅
    - objetos da classe `String` são imutáveis e usamos uma sintaxe literal para criar (object literal) ✅
    - qualquer método de alteração da classe `String` devolve uma nova `String` que representa a alteração ✅
    - a classe `String` é uma `CharSequence` ✅
    - se precisamos concatenar muitas `String` devemos usar a classe StringBuilder ✅
    - vimos vários métodos da classe String como `trim`, `charAt`, `contains`, `isEmpty`, `length`, `indexOf`, `replace` ✅
- A classe Object ✅
  - Analisando o sysout ✅
  - Entendendo o código ✅
  - Mais uma dúvida ✅
  - Usando a classe Object ✅
  - Sobre Object ✅
  - O método toString() ✅
  - Objetivo do toString() ✅
  - Revisão e Conclusão ✅