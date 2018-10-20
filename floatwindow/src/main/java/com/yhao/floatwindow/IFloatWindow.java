package com.yhao.floatwindow;

import android.view.View;

/**
 * Created by yhao on 2017/12/22.
 * https://github.com/yhaolpz
 */

public abstract class IFloatWindow {
    public abstract void show();

    public abstract void hide();

    public abstract boolean isShowing();

    /**
     * 设置悬浮窗的LayoutParams.flags
     *
     * @param flags {@link android.view.WindowManager.LayoutParams}
     */
    public abstract void setFlags(int flags);

    public abstract int getX();

    public abstract int getY();

    public abstract void updateX(int x);

    public abstract void updateX(@Screen.screenType int screenType, float ratio);

    public abstract void updateY(int y);

    public abstract void updateY(@Screen.screenType int screenType, float ratio);

    public abstract View getView();

    abstract void dismiss();
}
