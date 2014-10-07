@Override
public boolean onTouch(View v, MotionEvent event) {
  switch(event.getActionMasked()){
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