Feature: US001 Amazon Sayfasi Testi
  Scenario: TC01 Sayfada Arama Yapma
    Given kullanici amazon sayfasina gider
    Then arama kutusunda iphone aratir
    And sayfayi kapatir



    Scenario: TC02 arama kutusunda urun arama
      Given kullanici amazon sayfasina gider
      Then kullanici Arama Kutusunda Samsung Aratir
      And sayfayi kapatir




