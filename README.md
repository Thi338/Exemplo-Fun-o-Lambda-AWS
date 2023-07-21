# Exemplo-Função-Lambda-AWS

Este é um projeto de Exemplo de como criar uma função Lambda da AWS usando Java. 

# AWS
É necessário ter uma conta na AWS para criar a função no AWS Lambda e fazer o upload do código.
Para invocar a função, use o comando: aws lambda invoke --function-name Funcao01 --invocation-type RequestResponse ./target/resposta.txt
Neste exemplo estou usando a pasta target como destino para a resposta da minha função, e essa resposta é inserida em um arquivo chamado 'resposta.txt' 
que eu mesmo criei.

Lembrando que para invocar a função pelo terminal é necessario ter o AWS CLI instalado na sua máquina, e fazer login com um usuário da sua conta que
tenha permissão para usar o serviço do Lambda. Para fazer o login use o comando 'aws configure' e passe as credenciais do seu usuário.

# Maven
Para fazer o upload para a função Lambda que você criou, você precisa executar o comando 'mvn clean package' no seu projeto e upar o arquivo JAR 
que foi gerado na pasta target do projeto. Após isso, a função pode ser invocada.
