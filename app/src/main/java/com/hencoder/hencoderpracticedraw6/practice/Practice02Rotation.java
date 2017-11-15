package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice02Rotation extends RelativeLayout {
    private static int CLICKCODE = 0;
    Button animateBt;
    ImageView imageView;

    public Practice02Rotation(Context context) {
        super(context);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(final View v) {
                // // TODO 在这里处理点击事件，通过 View.animate().rotation/X/Y() 来让 View 旋转

//                imageView.animate().rotation(180);
//                CLICKCODE = 100;
                switch (CLICKCODE) {
                    case 0:
                        imageView.animate().rotation(180); // 绕着 Z 轴旋转
                        break;
                    case 1:
                        imageView.animate().rotation(0);
                        break;
                    case 2:
                        imageView.animate().rotationX(200); // 绕着 X 轴旋转
                        break;
                    case 3:
                        imageView.animate().rotationX(0);
                        break;
                    case 4:
                        imageView.animate().rotationY(200);// 绕着 Y 旋转
                        break;
                    case 5:
                        imageView.animate().rotationY(0);
                        break;
                    default:
                        CLICKCODE = -1;
                        break;
                }
                if (CLICKCODE == 5) {
                    CLICKCODE = 0;
                } else {
                    CLICKCODE++;
                }
            }
        });
    }
}