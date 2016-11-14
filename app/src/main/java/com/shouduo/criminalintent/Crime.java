package com.shouduo.criminalintent;

import java.util.UUID;

/**
 * Created by 刘亨俊 on 16.11.14.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
