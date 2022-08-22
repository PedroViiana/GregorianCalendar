# GregorianCalendar

A classe GregorianCalendar (que pertence ao pacote java.util) descreve um ponto no tempo, como
medido pelo calendário gregoriano, o calendário padrão comumente utilizado em quase todo o
mundo atual.
- Construção de objetos GregorianCalendar
1. Você constrói um objeto GregorianCalendar utilizando a data/hora do computador como a
seguir:

2. Você também pode construir um objeto GregorianCalendar a partir de um ano, mês e dia,
como no exemplo a seguir:

Utilize as constantes Calendar.JANUARY, . . ., Calendar.DECEMBER para especificar o mês (a
classe Calendar também pertence ao pacote java.util).
- Alguns métodos da classe GregorianCalendar
1. O método add pode ser utilizado para adicionar alguns dias a um objeto GregorianCalendar,
veja um exemplo:

Esse é um método modificador - ele altera o objeto cal criado utilizando a data/hora do computador
2. O método get pode ser utilizado para consultar um objeto GregorianCalendar:

Exercício:
Utilizando a classe GregorianCalendar, desenvolva um programa que imprime estas informações:
● A data de hoje, a data daqui a 15, 45 e 90 dias a partir da data de hoje (formato: dd/mm/ano)
● O dia da semana do seu aniversário (formato: por extenso)
● O dia da semana do natal e do ano novo de 2021 (formato: por extenso)
