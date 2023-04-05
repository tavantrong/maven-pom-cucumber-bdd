Feature: Register and Login

@register_login
  Scenario: Register to system and login
    Given Get Login page Url
     When Open Register page by click here linktext
     	And Skip Ads whether or not displays
      And Input to Email textbox
      And Click to Submit button
     Then Get User and Password infor
     When Back to Login page
      And Submit valid infor UserID and Pass to Login form
     Then Home page displayed

@new_customer     
  Scenario Outline: New Customer
    Given Click to "New Customer" link
     When Input to "Customer Name" textbox with value "<CustomerName>"
      And Click to "f" radio button
      And Input to "Date of Birth" textbox with value "<DobIn>"
      And Input to "Address" textarea with value "<Address>"
      And Input to "City" textbox with value "<City>"
      And Input to "State" textbox with value "<State>"
      And Input to "PIN" textbox with value "<Pin>"
      And Input to "Mobile Number" textbox with value "<Phone>"
      And Input to "E-mail" textbox with value "<Email>"
      And Input to "Password" textbox with value "<Password>"
      And Click to "Submit" button
     Then Heading text displayed with "Customer Registered Successfully!!!"
      And The value "<CustomerName>" displayed at row name "Customer Name"
      And The value "<Gender>" displayed at row name "Gender"
      And The value "<DobOut>" displayed at row name "Birthdate"
      And The value "<Address>" displayed at row name "Address"
      And The value "<City>" displayed at row name "City"
      And The value "<State>" displayed at row name "State"
      And The value "<Pin>" displayed at row name "Pin"
      And The value "<Phone>" displayed at row name "Mobile No."
      And The value "<Email>" displayed at row name "Email" 
  
    Examples: 
      | CustomerName | DobIn      | DobOut     | Gender | Address      | City    | State     | Pin    | Phone      | Email     | Password | 
      | Sasin Test   | 07/16/1995 | 1995-07-16 | female | 65 Minh Khai | Can Tho | Can Giuoc | 770000 | 0395453620 | ryangiggs | 1245678  | 