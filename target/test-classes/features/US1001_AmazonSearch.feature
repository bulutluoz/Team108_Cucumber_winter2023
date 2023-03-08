Feature: US1001 Kullanici Amazon sayfasinda arama yapar

  Scenario: TC01 Kullanici Amazonda Nutella aratir

    Given kullanici Amazon anasayfaya gider
    Then arama kutusuna Nutella yazar ve enter tusuna basar
    And arama sonuclarinin Nutella icerdigini test eder
    And sayfayi kapatir