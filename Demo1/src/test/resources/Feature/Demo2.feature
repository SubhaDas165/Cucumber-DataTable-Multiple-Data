Feature: User Login

Scenario: User login with different data
Given User is on Login Page
When User enter folowing user details
  | Jojo8855 | Beans1088 | j0100223@gmail.com | 02999990 | 8Bangalore1 |
  | Jojo2002 | Beans2002 | j1120023@gmail.com | 0999991 | 5Bangalore2 |
  | Jojo3852 | Beans3055 | j21023@gmail.com | 8999992 | 9Bangalore3 |
Then User Login Successfully