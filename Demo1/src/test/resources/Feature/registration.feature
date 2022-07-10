Feature: User Registration

Scenario: User registraion with different data
Given User is on registration page
When User enters following user details
  | Jojo1 | Beans1 | j0123@gmail.com | 999990 | Bangalore1 |
  | Jojo2 | Beans2 | j1123@gmail.com | 999991 | Bangalore2 |
  | Jojo3 | Beans3 | j2123@gmail.com | 999992 | Bangalore3 |
Then User registration should be successfull  