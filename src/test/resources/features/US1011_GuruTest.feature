Feature: US1011 webtablosundaki istenen sutunu yazdirma

  @guru
  Scenario: TC16 kullanici sutun bilgisi ile liste alabilmeli
    Given kullanici "guruUrl" anasayfasinda
    And "Prev Close (Rs)" sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir