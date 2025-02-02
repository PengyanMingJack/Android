package com.tencent.qcloud.tim.uikit11.modules.chat.base;

import com.tencent.qcloud.tim.uikit11.base.BaseFragment;
import com.tencent.qcloud.tim.uikit11.modules.chat.interfaces.IChatLayout;

public class BaseInputFragment extends BaseFragment {

    private IChatLayout mChatLayout;

    public IChatLayout getChatLayout() {
        return mChatLayout;
    }

    public BaseInputFragment setChatLayout(IChatLayout layout) {
        mChatLayout = layout;
        return this;
    }
}
