/****** 

@author Ratik Sharma 
Guildlines: These methods have been tested only on RelativeLayout and LinearLayout instances as Views. But, technically, they should just fine with other View instances. You're free to try!    

*******/

.
.

// Add these as global variables
private Context mContext = YourActivityName.this; // Replace YourActivityName with the name of your activity
private int rawYCoordinate;
private int yCoordinate;
private int maxHeight; 
private int nFactor;

.
.

/*********** onCreate() *************/

// Connecting view to listener
yourView.setOnTouchListener(gestureListener); // Replace yourView with the View instance you want to use

/********** onCreate() end **********/

.
.

// Helper method to get maxHeight
// Place this anywhere in the file with the view you're working on
private void getWindowData (Context context) {
    WindowManager windowManager;
    windowManager = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
    maxHeight = windowManager.getDefaultDisplay().getHeight();
    nFactor = maxHeight / 250;
}

// Heart and soul of this implementation
// Place this anywhere in the file with the view you're working on
OnTouchListener gestureListener = new OnTouchListener() {
  @Override
  public boolean onTouch(View v, MotionEvent event) {
    switch(event.getActionMasked()) {
    case MotionEvent.ACTION_DOWN:
      // Nothing here
      break;
    case MotionEvent.ACTION_UP:
      // To suppress warnings
      v.performClick();
      break;
    case MotionEvent.ACTION_MOVE:
      rawYCoordinate = (int) event.getY();
      yCoordinate = 255 - (rawYCoordinate / nFactor);
      android.provider.Settings.System.putInt(mContext.getContentResolver(), 
          android.provider.Settings.System.SCREEN_BRIGHTNESS, yCoordinate);
      break;
    }
    return true;
  }
};
