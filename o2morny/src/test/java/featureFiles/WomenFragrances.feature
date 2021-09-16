#Author: mostafa.alsaddek@ibm.com

@o2morny
Feature: Automation Reporting Assignment  

  @Open-Women-Fragrances-Page
    Scenario: Open Women Fragrances Page
    Given I successfully connected to o2morny Landing page using label "SPECIAL OFFERS"
    When I select Women Fragrances from Fragrances tab
    Then I want to Go to page 1
    Then I successfully connected to Women Fragrances First page using label "Women Fragrances"

    When I select all the items that have discount only in percentages in this page
		And I want to Count the selected elements
    Then I want to Go to page 2

   Then I successfully connected to Women Fragrances Second page using label "Women Fragrances"
   When I select all the items that have discount only in percentages in this page
	 And I want to Count the selected elements
   Then I want to Go to page 3

    Then I successfully connected to Women Fragrances Third page using label "Women Fragrances"
    When I select all the items that have discount only in percentages in this page
		And I want to Count the selected elements
    Then I want to Go to page 4

    Then I successfully connected to Women Fragrances Fourth page using label "Women Fragrances"
    When I select all the items that have discount only in percentages in this page
		And I want to Count the selected elements
    Then I want to Go to page 5

    Then I successfully connected to Women Fragrances Fifth page using label "Women Fragrances"
    When I select all the items that have discount only in percentages in this page
		And I want to Count the selected elements
    
    When I successfully connected to Ready to checkout Page using label "Ready to checkout?"
    Then I want to assert the total number of elements in the cart
    And I want to assert the total cost is calculated properly
    
    