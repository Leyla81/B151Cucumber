Feature: US002 Techproeducation arama testi
  @all
  Scenario: TC01 Arama kutusunda bolum aratma
    Given kullanici techproEducation sayfasina gider
    Then arama kutusunda qa aratir
    And sayfayi kapatir
@g2
Scenario: TC02 Arama kutusunda bolum aratma
  Given kullanici techproEducation sayfasina gider
  Then arama kutusunda mobile aratir
  But cikan dropdown menuden mobile developer secenegini tiklar
  And basligin Mobile icerdigini test eder
  And sayfayi kapatir
@techpro
Scenario: TC03 Arama kutusunda bolum arama
  Given kullanici techproEducation sayfasina gider
  Then arama kutusunda java aratir
  And cikan dropdown menuden free java secenegini tiklar
  And basligin Free icerdigini test eder
  And sayfayi kapatir
