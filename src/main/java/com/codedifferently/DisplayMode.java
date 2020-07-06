package com.codedifferently;

public class DisplayMode {
    
    private String whichMode = "";

    /*I added a string array for you, you'll have to fill it in with the different mode
      inside the quotation marks *See Lab for the 4 modes readME*/

    String[] DisplayModeList = {"","","",""};
                             // 0  1  2  3  - array index positions start at 0.
                             // DisplayModeList[0] = your first array item


  /*  The essences of method is a when we call it we should be able to automatically
      change from mode to mode., or in more common terms iterate through our string array. 

    Ex: Before calling it: whichMode "Binary"
        switchDisplayMode();
        After calling it: whichMode = "Decimal"
*/
    public void switchDisplayMode() {

    }

    public String switchDisplayMode(String str) {
        return str;
    }

    public String getMode() {
        return whichMode;
    }


}