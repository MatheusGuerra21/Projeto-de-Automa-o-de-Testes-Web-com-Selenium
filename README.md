Projeto de Automação de Testes Web com Selenium - Pokémon GO Hub
Este projeto foi desenvolvido como parte do Módulo 03: Automação de Testes Web do programa FAST da Cesar School. O objetivo é aplicar os conceitos de automação de testes utilizando Selenium WebDriver para interagir e validar informações do site Pokémon GO Hub DB.

🚀 Tecnologias Utilizadas
Java: Linguagem de programação principal.

Selenium WebDriver: Ferramenta para automação da interação com o navegador.

JUnit 5: Framework para a estruturação e execução dos testes.

Maven: Ferramenta para gerenciamento de dependências e build do projeto.

Page Object Model (POM): Padrão de projeto utilizado para organizar os elementos e ações de cada página, tornando o código mais limpo e reutilizável.

⚙️ Cenários de Teste Automatizados
O projeto cobre os seguintes cenários de validação no site Pokémon GO Hub:

Melhores Atacantes (Normal): Acessa a página de "Melhores Atacantes do tipo Normal" e valida se o título da página está correto.

Melhores Atacantes (Fogo): Valida a navegação para a página de "Melhores Atacantes do tipo Fogo" e a correção do seu título.

Busca de Pokémon: Realiza uma busca pelo Pokémon "Pikachu" e valida se seus movimentos ágil e carregado correspondem ao esperado.

Validação de Lista: Navega para a "Melhor Lista de Atacantes" e valida se a quantidade de níveis de poder (Nível 50, 40, etc.) está correta.

✨ Melhorias e Aprendizados
Baseado no projeto entregue pelo professor, realizei as seguintes implementações e melhorias:

1. Novo Cenário de Teste: Melhores Atacantes do tipo Fogo
   Além dos cenários propostos, foi implementado um novo teste (melhoresAtacantesTipoFogo) para validar a página de "Melhores Atacantes do tipo Fogo". Isso expandiu a cobertura de testes do projeto e ajudou a solidificar o uso do padrão Page Object Model, criando uma nova classe de página (MelhoresAtacantesFogo.java) para representar essa nova área do site.

2. Refatoração da Leitura de Tabelas
   O método original para ler os dados da tabela (printAllTable) foi refatorado. A abordagem inicial, que criava uma lista de WebElements e depois a percorria, era suscetível ao erro StaleElementReferenceException em páginas dinâmicas.

A nova abordagem utiliza um loop for com um contador (for (int i = 0; i < rowCount; i++)) e busca novamente os elementos da tabela a cada iteração. Isso garante que a referência ao elemento esteja sempre atualizada, tornando o teste mais robusto e estável.

👨‍💻 Como Executar o Projeto
Pré-requisitos:

Java JDK instalado.

Apache Maven instalado.

Passos:

Clone este repositório:

Bash

git clone https://github.com/MatheusGuerra21/Projeto-de-Automa-o-de-Testes-Web-com-Selenium.git
Navegue até a pasta do projeto:

Bash

cd test.PokemonGo
Execute os testes via Maven:

Bash

mvn test
❤️ Reflexão Pessoal
Estou muito feliz de estar adquirindo esse aprendizado durante o programa FAST. É muito bom poder estudar e colocar em prática algo que realmente gosto. Este projeto uniu três grandes paixões: Programar, testar e Pokémon!!
