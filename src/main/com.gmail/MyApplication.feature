Feature: Test Facebook Login smoke test.

    Scenario : Test login with valid details in Facebook
    Given Open FF and start application
    When  Enter "user@phptravels.com" and "demouser" and click on Signin Button
    Then User is able to login successfully