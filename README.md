##Inputmobi Android-SDK
=================

1- Clone this repository.

2- Launch Eclipse.

3- Create an Android Project from Existing Code and Select the folder you cloned this repo to.

4- Go to your Main Project's settings and add the recently created project as a Dependency Library.

5- Add the following lines to your main project AndroidManifest.xml file

```
<activity
    android:name="com.inputmobi.sdk.SecondActivity" 
    android:icon="@drawable/ic_launcher"
    android:label="Feedback">
</activity>
```

6- Initialize Inputmobi by adding this line in your main activity's onCreate() method.

```
com.inputmobi.Inputmobi.startWithApplicationKey("YOUR_APPLICATION_KEY", this, this.getApplicationContext());
```

Get an application key from [http://inputmobi.com](http://inputmobi.com)

7- and you are done. Start gathering feedback by shaking your Android.
