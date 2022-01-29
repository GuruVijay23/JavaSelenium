Feature: DemoQA Automation Practice Form filling

  @tag1
  Scenario Outline: Form filling practice
    Given I launch the browser
    When choose "<Country1>"  
    Then print

    Examples: 
      | Country1  | 
	    |  BRAZIL   |
	    |  CANADA   |
	  