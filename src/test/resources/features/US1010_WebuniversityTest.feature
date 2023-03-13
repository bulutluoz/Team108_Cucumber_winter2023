Feature: US1010 WebUniversity Testi


  Scenario:TC14 Webuniversity sayfasinda istenen gorevleri yapar

    Given kullanici "webUrl" anasayfaya gider
    Then Login Portal gorununceye kadar asagi iner
    And Login Portal butonuna tiklar
    And acilan ikinci window'a gecer
    And Username kutusuna deger yazdirir
    And Password kutusuna deger yazdirir
    Then webUniversity login butonuna basar
    And Popup'ta cikan yazinin validation failed oldugunu test eder
    And Ok diyerek Popup'i kapatir
    Then Ilk sayfaya geri doner
    And Ilk sayfaya donuldugunu test eder
    And sayfayi kapatir
