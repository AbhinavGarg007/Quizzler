package com.londonappbrewery.quizzler;

public class TrueFalse {

    private int mQuestionId;
    private boolean mAnswer;


    public TrueFalse(int questionId,boolean trueOrFalse)
    {

        mQuestionId=questionId;
        mAnswer=trueOrFalse;
    }


    public int getmQuestionId() {
        return mQuestionId;
    }

    public void setmQuestionId(int mQuestionId) {
        this.mQuestionId = mQuestionId;
    }

    public boolean ismAnswer() {
        return mAnswer;
    }

    public void setmAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}
