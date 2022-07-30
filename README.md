# Applying-the-Parent-axes-method
Assignment 5 W8D5 - SDA - Software QA Bootcamp


## Table of contents
* [Question](#question)
* [Answer](#answer)
* [Output Screenshots](#output-screenshots)


## Question
Create 3 or 4 samples for XPath by applying the Parent axes method

## Answer
I used itmeo website https://itmeo.com/
Before running the code, there are some steps that need to take considered:


### First:
Setup Latest Web Driver for Chrome  Driver.
Donwload the necessary jar files:
- Selenium (Lastest).
- TestNG (Lastest).
- commander (Lastest).

### Second:
Add them as a library in the classpath of the project
- _click-reight on the file project >Build path > configure Bild path > Java Build Path > Libraries > classpath > add external JARs > Apply and close_.

### Third:
I Opened the website, then write four Xpath using 'Parent' axes method.

- XPath= //img//parent::div[@class='logo']

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182002706-445a3fba-fad5-4894-857b-1543a78afe6a.png" width=60% height=60%>
</p>

- XPath= //a[text()='UI & dashboards']//parent::li[contains(@class,'tags-nav__item')]

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182002714-c273d6ac-5ce2-43dd-a0f7-e6fc422e98d9.png" width=60% height=60%>
</p>

- XPath= //img//parent::a[contains(@class,'product-hunt') and contains(@target,'_blank')]

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182003010-3ad650c8-e36b-4ee3-b036-e687a51c5b50.png" width=60% height=60%>
</p>

- XPath= //img//parent::a[@class='product-hunt' or @class='_blank']

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182003029-9f447e1b-d2ad-4844-8cbf-ca07637d583f.png" width=60% height=60%>
</p>


## Output Screenshots:
<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182003035-5b9c1e5d-fc7a-409b-b9d7-528a0f777edd.png" width=80% height=80%>



https://user-images.githubusercontent.com/48597284/182003058-ae02418f-5fa8-41a8-9de6-c096f536e173.mp4
</p>
