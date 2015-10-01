# Controle Atendimento
Sistema de controle de senhas para atendimento bancário.<br/>
<br/>
Utilizados:
- Java 7;
- Tomcat 7;
- Maven;
- Não foi utilizado banco de dados.

Orientações para executar o projeto:
 - Fazer o download o arquivo ./war/ControleAtendimento1.0.0.war;
 - Fazer o deploy do arquivo no tomcat 7;
 - Clicar em "/ControleAtendimento1.0.0" do List Applications (executar a aplicação);
  
Observações:
- Existe apenas uma tela (index.xhtml);
- O Field "Cliente" apresenta os botôes com as funções de gerar senha: Normal (N####) e Preferencial (P####);
- O Field "Gerente" apresenta um botão "Chamar Senha", que tira a senha da lista e mostra em "Senha em Atendimento", e um botão "Reiniciar Contagem", que reinicia a numeração das senhas normais e preferenciais;
- O campo "Quadro de Ordem de Chamada de Senhas" apresenta a lista das senhas geradas, na ordem que elas foram geradas;

<br/> Autor: Bruno Rodrigues Silva
<br/> Contato: brsilva.eng@gmail.com
