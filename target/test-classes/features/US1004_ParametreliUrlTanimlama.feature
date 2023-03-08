Feature: US1004 kullanici parametre olarak girdigi Url'e gider

  Scenario: TC08 Kullanici url'i parametre olarak girebilmeli

    Given kullanici "wiseUrl" anasayfaya gider
    And 5 saniye bekler
    Then "wiseUrl" sayfasina gittigini test eder
    And sayfayi kapatir