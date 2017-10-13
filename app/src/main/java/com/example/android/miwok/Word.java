package com.example.android.miwok;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;

/**
 * Displays text to the user.
 */
public class Word {

    // String default translation
    private String mDefaultTranslation;

    // String Miwok translation
    private String mMiwokTranslation;

    // image path
    private int mImgRes = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    // audio path
    private int mAudioRes;

    private boolean isPlaying = false;

    // Media Player
    private MediaPlayer mMediaPlayer;

    /**
     * Constructs a new Word with default translation and miwok translation.
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Constructs a new Word with default translation, miwok translation, and audio resources
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioRes) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioRes = audioRes;
    }

    /**
     * Constructs a new Word with default translation, miwok translation, image resources, and audio resources
     * @param defaultTranslation
     * @param miwokTranslation
     * @param imgRes
     * @param audioRes
     */
    public Word(String defaultTranslation, String miwokTranslation, int imgRes, int audioRes) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImgRes = imgRes;
        mAudioRes = audioRes;
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

    /**
     * Detects if it has the image associate with it
     * @return
     */
    public boolean hasImage() {
        return mImgRes != NO_IMAGE_PROVIDED;
    }

    /**
     * Updates play state depending on user's onclick
     * @return
     */
    public boolean isPlaying() {
        return !isPlaying;
    }

    /**
     * Sets the audio resource ID
     * @param audioRes
     */
    public void setAudioResId(int audioRes) {
        mAudioRes = audioRes;
    }

    /**
     * Gets the audio resources ID
     * @return
     */
    public int getmAudioRes() {
        return mAudioRes;
    }
}