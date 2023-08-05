
@Hepsi

Feature: US003 Techproeducation arama testi
  #Feature file daki scenario'larımızda ortak adımlarımız var ise bunu Feature: yapısından sonra
#Background: yapısı ile kullanabiliriz. Böylece scenario'dan önce Background: step çalışacaktır.
  Background: Kullanıcı techproeducation sayfasına gider
    Given kullanici techproEducation sayfasina gider
    #given kısmını birkez yazıp diger scenariolarda birkez calısır ve tekrar tekrar yazmamıza gerek kalmaz

  Scenario: TC01 Arama kutusunda bolum aratma
    Then arama kutusunda qa aratir
    And sayfayi kapatir

  Scenario: TC02 Arama kutusunda bolum aratma
    Then arama kutusunda mobile aratir
    But cikan dropdown menuden mobile developer secenegini tiklar
    And basligin Mobile icerdigini test eder
    And sayfayi kapatir

  Scenario: TC03 Arama kutusunda bolum arama
    Then arama kutusunda java aratir
    And cikan dropdown menuden free java secenegini tiklar
    And basligin Free icerdigini test eder
    And sayfayi kapatir

    #Eğer scenariolarımız tek bir browser'da çalışmasını istersek yani her scenario'da
#kapanmasın istersek sadece en son scenario'da sayfayı kapat step'ini kullanırız.