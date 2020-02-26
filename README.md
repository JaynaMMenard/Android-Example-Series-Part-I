# Android-Example-Series-Part-I


**Before Android 3.0 , Activities were used to switch between different screens. 
If your app had two screens, you would need two Activities. However, the issue 
arose that apps were not properly rendered onto the screen of tablets and phones. 
For tablets, it would be difficult to show multiple small screens and resizing them
on larger screens. For phones, apps would swap each other out of view, making it hard for a multi-pane screen.  
In this project, we can see the why fragments are a better option to create apps.**



**The issue rising with using Activities for every single app is:**
1.	Connecting each app to another creates weird code connections
2.	Showing multiple small screens and resizing them on larger screens
 


Thus, along came **Fragments**!



**Fragments**

Breaking up Activities into smaller sections. Roughly acts like an Activity
Used as entry points
Not a view, implements UIs by using Views
Lifecycles and inputs controlled by surroundings
Used in architectural patterns used in applications -> View Model


# Using Activities

![Screenshot (640)](https://user-images.githubusercontent.com/31700864/75368824-4d155500-5890-11ea-8c2f-09e87f6d2b53.png)
![Screenshot (641)](https://user-images.githubusercontent.com/31700864/75368810-47b80a80-5890-11ea-8c74-33d1c66a19e3.png)



## Visible Issues
Sizing on Tablets are skewed 
## On Run Issues
Noticeable transition between Activities 



# Using Fragments
![Screenshot (642)](https://user-images.githubusercontent.com/31700864/75369229-0bd17500-5891-11ea-9317-722a3e6566c7.png)
![Screenshot (644)](https://user-images.githubusercontent.com/31700864/75369234-0c6a0b80-5891-11ea-949d-21d08fc378d3.png)



## Visible Issues
Sizing on Tablets are true to original layout. 
However, need to enlarge to fit screen size (Easier to do) 

## On Run
Faster transition between fragments

