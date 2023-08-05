
Feature: US001 Google testi
  @arac1
Scenario: TC01 Arama Kutusunda Volvo Aratilir
  Given kullanici "googleUrl" sayfasina properties ile gider
And kullanici 2 saniye bekler
Then kullanici arama kutusunda "arac1" aratir
And kullanici 2 saniye bekler
And kullanici sayfa basliginin "arac2" icerdigini test eder
  #hook classi icin bilerek hata aldık
And sayfayi kapatir

    @arac2
  Scenario: TC02 Arama Kutusunda ford Aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider
    And kullanici 2 saniye bekler
    Then kullanici arama kutusunda "arac2" aratir
    And kullanici 2 saniye bekler
    And kullanici sayfa basliginin "arac2" icerdigini test eder
  #hook classi icin bilerek hata aldık
    And sayfayi kapatir


      @arac3
  Scenario: TC03 Arama Kutusunda Audi Aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider
    And kullanici 2 saniye bekler
    Then kullanici arama kutusunda "arac3" aratir
    And kullanici 2 saniye bekler
    And kullanici sayfa basliginin "arac3" icerdigini test eder
  #hook classi icin bilerek hata aldık
    And sayfayi kapatir
  
  
  
  
  
  
  
  
  
  
  
  
  
  