Feature: US1011 demoqa sayfasinda istenen gorevler

  @demo
  Scenario: TC15 kullanici istenen gorevleri yapabilmeli

    Given kullanici "demoqaUrl" anasayfaya gider
    And 3 saniye bekler
    Then Alerts sekmesine tiklar
    And ustten ikinci click me butonuna basar
    And Allert in gorunur olmasini bekler
    Then Allert uzerindeki yazinin "This alert appeared after 5 seconds" oldugunu test eder
    And Ok diyerek alerti kapatir
