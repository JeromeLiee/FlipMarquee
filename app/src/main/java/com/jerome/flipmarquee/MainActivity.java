package com.jerome.flipmarquee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * @author Jerome
 * @date 2017/12/01
 */
public class MainActivity extends AppCompatActivity {
    private MessageViewFlipper mFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFlipper = findViewById(R.id.msg_view_flipper);
        mFlipper.setMessage("一盏离愁孤单伫立在窗口，我在门后假装你人还没走。旧地如重游月圆更寂寞，夜半清醒的烛火不忍苛责我。");
        mFlipper.start();

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFlipper.insertNewMessage("一壶漂泊,浪迹天涯难入喉.你走之后,酒暖回忆思念瘦.水向东流时间怎么偷,花开就一次成熟我却错过。");
                mFlipper.notifyMessage();
            }
        });

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFlipper.insertNewMessage("谁在用琵琶弹奏一曲东风破，岁月在墙上剥落看见小时候，犹记得那年我们都还很年幼，而如今琴声幽幽，我的等候你没听过。");
                mFlipper.notifyMessage();
            }
        });
    }
}
