Feature:
  @a
  Scenario:
    Given kullanici "productsList" endpointine request gonderir.
    Then kullanici status kodu dogrular.
    And kullanici urunlerin sayisinin 34 oldugunu dogrular
    And kullanici 1000 den kucuk urunleri log dosyasina yazdirir
