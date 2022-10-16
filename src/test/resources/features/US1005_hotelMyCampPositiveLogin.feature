Feature: US1005 Dogru kullanici adi ve sifre ile giris yapilabilmeli

  @hmc
  Scenario: TC08 positive login test
    Given kullanici "HMCUrl" anasayfasinda
    Then Login yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And sayfayi kapatir