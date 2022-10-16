Feature: US1009 Datatables sitesine 5 farkli giris yapalim

  @datatable
  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli

    When kullanici "datatablesUrl" anasayfasinda
    Then new butonuna basar
    And firstName bolumune "<firstName>" yazar
    And kullanici 1 sn bekler
    And lastName bolumune "<lastName>" yazar
    And kullanici 1 sn bekler
    And position bolumune "<position>" yazar
    And kullanici 1 sn bekler
    And office bolumune "<office>" yazar
    And kullanici 1 sn bekler
    And extension bolumune "<extension>" yazar
    And kullanici 1 sn bekler
    And startDate bolumune "<startDate>" yazar
    And kullanici 1 sn bekler
    And salary bolumune "<salary>" yazar
    And kullanici 1 sn bekler
    And Create tusuna basar
    When kullanici "<firstName>" ile arama yapar
    And kullanici 1 sn bekler
    Then isim bolumunde "<firstName>" oldugunu test eder

    Examples:
    |firstName|lastName|position|office  |extension |startDate |salary|
    |Merve    |Alkurt  |qa      |Istanbul|UI        |2021-10-11|13000 |
    |Berk     |Can     |tester  |Istanbul|API       |2021-05-05  |13000 |
    |Huseyin  |Kacmaz  |BA      |Berlin  |-         |2022-03-10 |20000 |
    |Fatma    |Sahin   |PO      |Berlin  |-         |2021-03-12 |45000 |
    |Ahmet    |Kaya    |tester  |Ankara  |database  |2022-06-06  |11000 |