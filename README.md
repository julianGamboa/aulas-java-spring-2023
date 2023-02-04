# Deploy de um sistema simples de LOGIN usando SpringBoot


Uma das vantagens do SpringBoot é a fácil integração, e posta em marcha, das muitas bibliotecas de recursos que dito ecossistema possui. Nesta oportunidade vamos construir um sistema simples para LOGIN usando as modernas e seguras ferramentas de segurança associadas ao framework SpringBoot.

## **Sprint Boot Security** para fazer um sistema de LOGIN

Na atualidade existem diversos framework (**SpringBoot, Angular, React, etc..**) e ferramentas ([AWS Cognito](https://aws.amazon.com/pt/cognito/), Google Firebase)  para acelerar a construção de um "sistema de LOGIN". 

Mas para visualizar os detalhes sobre o funcionamento de Java e de um framework poderoso será feito este projeto usando o framework SpringBoot, considerando:
- Uso do framework SpringBoot junto com o MAVEM para gerar os arquivos JAR que serão colocados numa instância EC2. 
- Será usado o serviço codedeploy da AWS para compilar o arquivo JAR, mencionado no inciso anterior, cada vez que seja alterado o branch main do [repositório](https://github.com/julian-gamboa-ensino/aws-spring-login-2023/tree/main)
- Será usado o terraform para provisionar na AWS. 
- Será usado o Angular para aprimorar vários detalhes estéticos das telas apresentadas neste sistema de login.

## Detalhes dos princípios de **CI/CD** aplicados.

Com o intuito de acelerar o ritmo de integração das diversas versões deste software (CI) e para garantir um provisionamento certo, cuidadoso, e econômico da infraestrutura necessária (Instâncias Spot EC2 da AWS) será usado o serviço AWS de [CodePipeline](https://aws.amazon.com/pt/codepipeline/) junto com **terraform**. 

O terraform será usado desde a máquina local para crear uma instancia EC2 (na modalidade economica **spot**) e no momento de criação dela é coletado um arquivo JAR que será executado para escutar na porta 8080. No caso que não seja possível usar o terraform pode-se considerar outros mecânismos da AWS (CodeDeploy e arquivo [appspec.yml](https://enlear.academy/deploy-your-spring-boot-application-using-codedeploy-and-codepipeline-4d853b1e486e))

Já o serviço [CodePipeline](https://aws.amazon.com/pt/codepipeline/) será acoplado ao repositório de Github (https://github.com/julian-gamboa-ensino/aws-spring-login-2023.git) para gerar uma nova versão do arquivo JAR cada vez que seja feito um commit no branch master deste repositório. Este arquivo JAR será colocado num bucket S3

## Detalhes dos princípios de **CI/CD** aplicados.
## Detalhes dos princípios de **CI/CD** aplicados.
## Detalhes dos princípios de **CI/CD** aplicados.
## Detalhes dos princípios de **CI/CD** aplicados.
## Detalhes dos princípios de **CI/CD** aplicados.
## Detalhes dos princípios de **CI/CD** aplicados.
## Detalhes dos princípios de **CI/CD** aplicados.
## Detalhes dos princípios de **CI/CD** aplicados.





