## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


# Notas 

## Boas práticas de controles de fluxo

- *Switch* é para valores exatos e *if* para expressões booleanas
- Evitar usar o default do switch para "cases genéricos"
- Evitar o efeito "flecha" dos if's
- Evitar muitos if's aninhados
- Criar variáveis intermediárias para diminuir os if's

## Exercícios

[Exercício 01](https://github.com/DheniMoura/Logica_Condicional_e_Controle_de_Fluxos_em_Java/blob/main/logica_condicional_e_controle_de_fluxos/src/exercicio1.java) <br>
Com *if*, exiba o nome do mês do ano de acordo com o seu número.
Evite o efeito flecha. Faça também outro if que verifique se o mês é julho, dezembrou ou janeiro, para assim exibir o texto "férias". <br>

[Exercício 02](https://github.com/DheniMoura/Logica_Condicional_e_Controle_de_Fluxos_em_Java/blob/main/logica_condicional_e_controle_de_fluxos/src/exercicio2.java) <br>
Com switch use String para a partir do dia da semana, exibir seu número. Ainda no switch, faça outro exemplo onde, se uma variável inteira for entre 1 e 3 exibir o text "Certo". Se for 4 exibir "Eraado", se for 5 exibir "Talvez". Pra demais valores exibir "Valor indefinido".
