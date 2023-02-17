Feature: Computer Page

  Scenario: User should navigate to computer page successfully
    Given User is on home page
    When User click on Computer Tab
    Then User should verify computer text "Computers"


  Scenario: User should navigate to desktop page successfully
    Given User is on home page
    When User click on Computer Tab
    And User click on desktop link
    Then User should verify desktops text "Desktops"


  Scenario: User should build your own computer and add them to cart successfully
    Given User is on home page
    When User click on Computer Tab
    And User click on desktop link
    And User should click on build your own computer
    And User should build own computer
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | VistaHome [+$50.00]     | Total Commander [+$5.00]   |


