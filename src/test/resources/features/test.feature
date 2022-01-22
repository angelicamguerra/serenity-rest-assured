Feature: Login Flickr
  As an existing user
  I want to Login in my Flickr account

  @Scenario1
  Scenario: Wrong credentials
    Given user already has a Flickr account.
    When John types his credentials Email and Password
    Then John gets a wrong message.






