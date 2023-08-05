Feature: US001 Google sayfasinda urun Aratma
  Scenario: TC01 Tabloda verilen urunler aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider
    And kullanici verilen bilgiler ile arama yapar
    #DataTable ile list seklinde verileri girebiliri bunun icin GoogleStepDefinitionda "kullaniciverilenbilgilerilearamayapar"
    #methoduna bakabilirsin

      | urunler  |
      | nokia    |
      | samsun   |
      | iphone   |
      | motorola |

    And sayfayi kapatir



    #AltGr + <> ----> |
  #DataTable Scenariodaki gibi birden fazla veriyi ayni scenario'da test etmek icin kullanilir.
#Scenario Outline'an farkli olarak verilerle ilgili tablolari istedigimiz stepten sonra kendimiz olusturabiliriz.
#Tabloyu olusturdugumuz step'in methoduna parametre olarak io.cucumber'dan DataTable parametresini ekleriz.
#Bu parametre sayesinde olusturmus oldugumuz tabloyu bir list'e donusturup loop ile verileri kullanabiliriz.
#Birden fazla olusturduysak yine DataTable parametresi sayesinde excel'den bildigimiz row() methodu ile bu datalara ulasabiliriz.