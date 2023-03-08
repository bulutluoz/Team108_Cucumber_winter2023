Feature: US1002 Kullanici Background kullanarak Amazonda arama yapar

  Background:
    Given kullanici Amazon anasayfaya gider

  Scenario: TC01 Kullanici Amazonda Nutella aratir
    Then arama kutusuna Nutella yazar ve enter tusuna basar
    And arama sonuclarinin Nutella icerdigini test eder
    And sayfayi kapatir


  Scenario: TC02 kullanici Amazonda Java aratir
    When arama kutusuna Java yazar ve enter tusuna basar
    Then arama sonuclarinin Java icerdigini test eder
    And sayfayi kapatir

  Scenario: TC03 kullanici Amazonda Apple aratir
    When arama kutusuna Apple yazar ve enter tusuna basar
    Then arama sonuclarinin Apple icerdigini test eder
    And sayfayi kapatir