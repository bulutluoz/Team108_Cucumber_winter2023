@regression @pr2
Feature: US1004 kullanici parametre olarak girdigi Url'e gider

  @ilk
  Scenario: TC08 Kullanici url'i parametre olarak girebilmeli

    Given kullanici "qdUrl" anasayfaya gider
    And 5 saniye bekler
    Then "qdUrl" sayfasina gittigini test eder
    And sayfayi kapatir