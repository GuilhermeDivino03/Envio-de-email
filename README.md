# Envio de email

Esta é uma API voltada para o envio de email onde ela registra o horario e data que foi enviado, o email do remetente e destinatario o a assunto e a mensagem contida no email tudo isso salvo em uma tabela do banco de dados.



## Uso
 para o uso do correto desta API deve se configurar o smtp do google que pode ser encontrado no application.proprerties.

<br>

#### Exemplo de corpo de requisição para um método POST
```Json

{
  "ownerRef": "",
  "emailFrom": "",
  "emailTo": "",
  "subject": "",
  "text": ""
}
```