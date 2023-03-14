@regression  @pr1
Feature: US1001 Kullanici Amazon sayfasinda arama yapar

  @ilk
  Scenario: TC01 Kullanici Amazonda Nutella aratir

    Given kullanici Amazon anasayfaya gider
    Then arama kutusuna Nutella yazar ve enter tusuna basar
    And arama sonuclarinin Nutella icerdigini test eder
    And sayfayi kapatir


  Scenario: TC02 kullanici Amazonda Java aratir
    Given kullanici Amazon anasayfaya gider
    When arama kutusuna Java yazar ve enter tusuna basar
    Then arama sonuclarinin Java icerdigini test eder
    And sayfayi kapatir

  Scenario: TC03 kullanici Amazonda Apple aratir
    Given kullanici Amazon anasayfaya gider
    When arama kutusuna Apple yazar ve enter tusuna basar
    Then arama sonuclarinin Apple icerdigini test eder
    And sayfayi kapatir

