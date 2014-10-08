# Gesture Brightness Controller 

This repository provides code snippets and a working algorithm to make a gesture based brightness controller for any Android application. 

### How does this function? 

The basic idea is that you can allow the user to swipe upwards or downwards on any portion of a View[1] to increase or decrease the phone's brightness. 

**[1]** This method has only been tested on RelativeLayouts and LinearLayouts; although, in theory, it should work with all sorts of Views.

### Installation

1. Refer to Java class and copy-paste everything in the mentioned locations
2. You **must** add this permission to your manifest file for this to work. 

  ```xml
  <uses-permission android:name="android.permission.WRITE_SETTINGS" />
  ```

3. That's all! It should work now.

### Use cases 

* This can be used while making an alarm application where you want the user to be able to swipe up or down on the screen to make the screen go dim to use the device as a clock at night.

* You could use this in a flashlight application to allow the user to dim down the screen to prevent two light sources (LED and screen) acting in opposite directions.

* etc. 