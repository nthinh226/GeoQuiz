package com.nt.geoquiz;

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mAnswered;

    public Question(int mTextResId, boolean mAnswerTrue, boolean  mAnswered) {
        this.mTextResId = mTextResId;
        this.mAnswerTrue = mAnswerTrue;
        this.mAnswered = mAnswered;
    }
    public Question(int mTextResId, boolean mAnswerTrue) {
        this.mTextResId = mTextResId;
        this.mAnswerTrue = mAnswerTrue;
        this.mAnswered = false;
    }

    public boolean isAnswered() {
        return mAnswered;
    }

    public void setAnswered(boolean mAnswered) {
        this.mAnswered = mAnswered;
    }

    public int getmTextResId() {
        return mTextResId;
    }

    public void setmTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }

    public boolean ismAnswerTrue() {
        return mAnswerTrue;
    }

    public void setmAnswerTrue(boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }
}
