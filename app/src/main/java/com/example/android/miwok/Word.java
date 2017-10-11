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

    // String image path
    private int mImgRes = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Constructs a new Word with default translation and miwok translation.
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Constructs a new Word with default translation, miwok translation, and image resources
     */
    public Word(String defaultTranslation, String miwokTranslation, int imgRes) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImgRes = imgRes;
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

    /**
     * Sets the image resource ID
     * @param imgRes
     */
    public void setImageResourceId(int imgRes) {
        mImgRes = imgRes;
    }

    /**
     * Gets the image resource ID
     * @return
     */
    public int getImageResourceId() {
        return mImgRes;
    }

    public boolean hasImage() {
        return mImgRes != NO_IMAGE_PROVIDED;
    }
}