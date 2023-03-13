Feature: US1007 Scenario Outline ile coklu negative login test

  @wip
  Scenario Outline: TC11 kullanici verilen listedeki kullanici isimleri ile giris yapamamali
    Given kullanici "qdUrl" anasayfaya gider
    Then ilk login linkine tiklar
    And username olarak "<username>" girer
    And password olarak "<password>" girer
    And login butonuna basar
    Then giris yapilamadigini test eder
    And sayfayi kapatir

    Examples:
    |username|password|
    |Hasan   |12344   |
    |Said    |645363  |
    |Eyup    |jskdbvk |
    |Fidan   |ytefv86 |