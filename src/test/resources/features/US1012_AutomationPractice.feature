Feature: US1012 Kullanici register yapabilmeli

  @aut
  Scenario: TC17 kullanici uygun datalarla register olabilmeli

    Given kullanici "automationUrl" anasayfasinda
    And user sign in linkine tiklar
    And user Create an account bolumune email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And kullanici 60 sn bekler
    And user Register butonuna basar
    And hesap olustugunu dogrular