Q. When you run your app and rotate the device/emulator are the method displayed in the
TextView consistent with methods called in the log? If not explain why.

Answer:
The methods displayed in the TextView are not consistent with the methods called in the log due to the following reasons:-
1. When the app is running and the device/emulator is rotated the current activity is destroyed and re-created.
So the methods onPause(), onStop() and onDestroy() are not visible on the emulator/device but they are called and are logged.
2. Also, the value in the TextView before rotation is lost. This is because the value in the TextView was not saved and restored
using the onSaveInstanceState() and onRestoreInstanceState()/onCreate() respectively.

