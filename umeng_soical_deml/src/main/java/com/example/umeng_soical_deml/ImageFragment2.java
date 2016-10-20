package com.example.umeng_soical_deml;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//此组件是要显示的Fragment   也就是 你有几页就需要有几个这样的Fragment
public class ImageFragment2 extends Fragment {

    private static String ARG_IMAGE = "image";
    private int flag = 0;
    private static Context mContext;
    private static IntentBack intentBack;
    public static int image[] = {R.mipmap.guide1,R.mipmap.guide2,R.mipmap.guide3,R.mipmap.guide4,R.mipmap.guide5};
    //传入一个context对象, 标识这 你当前的activity需要实现这个接口
    public static ImageFragment2 newInstance(int param1,Context context) {
        mContext = context;
        intentBack = (IntentBack)mContext;
        ImageFragment2 fragment = new ImageFragment2();
        Bundle args = new Bundle();
        args.putInt(ARG_IMAGE, param1);
        fragment.setArguments(args);

        Log.d("MSH","Static");
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            flag = getArguments().getInt(ARG_IMAGE);
            Log.d("MSH","onCreate()");
        }
    }

    // Fragment 重写这个方法
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.d("MSH","onCreateView()");
        View v = inflater.inflate(R.layout.color_fragment, container, false);
        v.setBackgroundResource(image[flag]);
        TextView tv = (TextView) v.findViewById(R.id.start_inport);
        if(flag == 4){
            tv.setVisibility(View.VISIBLE);
        }else{
            tv.setVisibility(View.GONE);
        }
        tv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                intentBack.getIntentCallBack();
            }
        });
        return v;
    }

    public interface IntentBack{
        void getIntentCallBack();
    }

}
