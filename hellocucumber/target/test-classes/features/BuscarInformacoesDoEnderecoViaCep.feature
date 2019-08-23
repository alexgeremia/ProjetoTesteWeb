# language:pt
@web
Funcionalidade: Buscar informações do endereço via cep

  Contexto:
    Dado acessei o site dos correios

  Esquema do Cenario: Buscar nome da rua pelo cep
    Quando digitar o cep "<CEP>"
    Então deverá trazer o nome rua "<RUA>"
    Exemplos:
      |      CEP      |       RUA        |
      |   90619-900   | Avenida Ipiranga |