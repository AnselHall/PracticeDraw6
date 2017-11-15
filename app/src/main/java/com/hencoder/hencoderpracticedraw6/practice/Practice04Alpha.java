package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice04Alpha extends RelativeLayout {
    private static int CLICKCODE = 0;
    Button animateBt;
    ImageView imageView;

    public Practice04Alpha(Context context) {
        super(context);
    }

    public Practice04Alpha(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice04Alpha(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                // TODO 在这里处理点击事件，通过 View.animate().alpha() 来改变 View 的透明度

                switch (CLICKCODE) {
                    case 0:
                        imageView.animate().alpha(0f); // 绕着 Z 轴旋转
                        break;
                    case 1:
                        imageView.animate().alpha(1);
                        break;
                    default:
                        CLICKCODE = -1;
                        break;
                }
                if (CLICKCODE == 1) {
                    CLICKCODE = 0;
                } else {
                    CLICKCODE++;
                }
            }
        });
    }
}