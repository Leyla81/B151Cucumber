
Feature: US002 Google Sayfasi Testi
  Scenario Outline: TC01 Arama Kutusunda Volvo Aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider
    Then kullanici google arama kutusunda "<aranacakAraclar>" aratir
    And kullanici 2 saniye bekler
    And kullanici sayfa basliginin "<aranacakAraclar>" icerdigini test etti
    And sayfayi kapatir


    Examples:                 #Scenario outline icin olusturulması gerekir
      | aranacakAraclar |
      | volvo           |
      | ford            |
      | audi            |
      | mercedes        |

#Scenario Outline: kullanimi testNg'deki data provider mantigiyla ayni calisir.
#Yukaridaki ornekteki gibi birden fazla veriyi loop kullanmadan test edebiliriz.
#Scenario Outline kullaniminda Examples yapisini kendimiz yazmamiza gerek yok,
#Scenario Outline yazdigimiz zaman altini kirmizi cizer ve muose ile uzerine geldigimizde
#Example yapisini create edebiliriz.












