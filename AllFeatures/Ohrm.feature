Feature: OrangeHRM

  @LoginPage
  Scenario: user is on login page
    Given user should enter valid credentials
    When user enter valid usernmae And password
    When user click on loginbutton
    Then user is on homepage  #verification

  @HomePage
  Scenario: user is on homepage
    When user should click on PIM page button
    When user should click on add employee
    When user should enter firstname And lastname
    When user should click on savebutton
    Then user is on personal details page #verification

  @DetailsPage
  Scenario: user is on personal details page
    When user should capture empId
    Then user should click PIM page button

  @PIMpage
  Scenario: user is on PIM page
    When user enter the empId
    When user should click on search button
    When user should click on checkbox
    Then user should click on delete button
    Then user should click confirm delete
