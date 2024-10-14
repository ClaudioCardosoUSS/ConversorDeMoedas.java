# Conversor de Moedas

Este é um aplicativo simples de conversão de moedas em Java que utiliza a Exchange Rate API para obter taxas de câmbio em tempo real.

## Funcionalidades

- Conversão entre várias moedas, incluindo:
  - Dólar (USD)
  - Real Brasileiro (BRL)
  - Euro (EUR)
  - Peso Argentino (ARS)
- Interface de linha de comando interativa
- Taxas de câmbio atualizadas em tempo real

## Pré-requisitos

- Java JDK 11 ou superior
- Maven (para gerenciamento de dependências)

## Instalação

1. Clone este repositório:
   ```
   git clone https://github.com/seu-usuario/conversor-de-moedas.git
   ```

2. Navegue até o diretório do projeto:
   ```
   cd conversor-de-moedas
   ```

3. Compile o projeto com Maven:
   ```
   mvn clean install
   ```

## Uso

Para executar o aplicativo, use o seguinte comando no diretório do projeto:

```
java -cp target/conversor-de-moedas-1.0-SNAPSHOT.jar currencyconverter.CurrencyConverter
```

Siga as instruções na tela para selecionar as moedas e os valores para conversão.

## Estrutura do Projeto

- `CurrencyConverter.java`: Classe principal com o método `main` e lógica de interação com o usuário.
- `CurrencyService.java`: Classe responsável por fazer chamadas à API e obter taxas de câmbio.
- `CurrencyUtils.java`: Classe utilitária com métodos auxiliares.

## Dependências

- [Gson](https://github.com/google/gson): Para análise de JSON
- [HttpClient](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html): Para fazer requisições HTTP

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE.md](LICENSE.md) para detalhes.

## Agradecimentos

- [Exchange Rate API](https://www.exchangerate-api.com/) por fornecer as taxas de câmbio em tempo real.


conversor-de-moedas/
│
├── src/
│   └── main/
│       └── java/
│           └── currencyconverter/
│               ├── CurrencyConverter.java
│               ├── CurrencyService.java
│               └── CurrencyUtils.java
│
├── pom.xml (se você estiver usando Maven)
│
└── README.md