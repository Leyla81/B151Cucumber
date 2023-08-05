Feature: US003 Google Sayfasi Testi
  Scenario Outline: TC01 Arama Kutusunda Volvo Aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider
    Then kullanici google arama kutusunda "<aranacakAraclar>" ile propertiesden aratir
    And kullanici 2 saniye bekler
    And kullanici sayfa basliginin "<aranacakAraclar>" icerdigini test eder
    And sayfayi kapatir


    Examples:                 #Scenario outline icin olusturulması gerekir
      | aranacakAraclar |
      | arac1           |
      | arac2           |
      | arac3           |
      | arac4           |
