package com.example.android.miwok;
import android.content.Context;
import android.view.View;

/**
 * Displays text to the user.
 */
public class Word {

    // String default translation
    private String mDefaultTranslation;

    // String Miwok translation
    private String mMiwokTranslation;

    /**
     * Constructs a new TextView with initial values for text and text color.
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Sets the string value in the TextView.
     *
     * @param text is the updated string to be displayed.
     */
    public void setDefaultTranslation(String text) {
        mDefaultTranslation = text;
    }

    /**
     * Gets the string value in the TextView.
     *
     * @return current text in the TextView.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Sets the string value in the TextView.
     *
     * @param text is the updated string to be displayed.
     */
    public void setMiwokTranslation(String text) {
        mMiwokTranslation = text;
    }

    /**
     * Gets the string value in the TextView.
     *
     * @return current text in the TextView.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

}