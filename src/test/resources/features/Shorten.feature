Feature: Como usuario de RapidApi, quiero realizar una peticion, para obtener una respuesta

  @RapidApi
  Scenario Outline: Envio un link y obtengo un link acortado
    When realizo una operacion <operation> a <entity> al endpoint <request>
    Then obtengo el statusCode <statusCode>
    And obtengo la url acortada

    Examples:
    | request                 | statusCode |  operation | entity  |
    | request/shortenRequest  | 200        |    POST    | SHORTEN |
