package com.scut.jianheng.moocvideo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.moocvideo.R;

public class VideoDetailActivity extends Activity{

	private TextView headerTv;
	private TextView authorTv;
	private TextView timeTv;
	private ImageButton photoIb;
	private TextView bodyTv;
	private Button commentBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video_detail);

		headerTv = (TextView)findViewById(R.id.headerTv);
		authorTv = (TextView)findViewById(R.id.authorTv);
		timeTv = (TextView)findViewById(R.id.timeTv);
		photoIb = (ImageButton)findViewById(R.id.photoIb);
		bodyTv = (TextView)findViewById(R.id.bodyTv);
		commentBtn = (Button) findViewById(R.id.commentBtn);
		
		String s_header = "华工简介";
		String s_author = "华南理工大学";
		String s_time = "2015年5月";
		String s_body = "华南理工大学是直属教育部的全国重点大学，坐落在南方名城广州，占地面积294多万平方米。校园分为两个校区，五山校区位于广州市天河区石牌高校区，校园内湖光山色、绿树繁花，民族式建筑与现代化楼群错落有致，文化底蕴深厚，是教育部命名的“文明校园”，大学城校区位于广州市番禺区广州大学城内，是一个环境优美、设施先进、管理完善、制度创新的现代化校园。两个校区交相辉映，是莘莘学子求学的理想之地。"
    +"\n华南理工大学原名华南工学院，组建于1952年全国高等学校院系调整时期，是以中山大学工学院、华南联合大学理工学院、岭南大学理工学院工科系及专业、广东工业专科学校为基础，调入湖南大学、武昌中华大学、武汉交通学院、南昌大学、广西大学等5所院校部分工科系及专业组建而成，1988年改为现名。学校办学历史悠久，作为组建基础的中山大学工学院源于1931年成立的国立中山大学理工学院；华南联合大学理工学院由1930年成立的私立广东国民大学工学院和1940年成立的私立广州大学理工学院合并而成；岭南大学理工学院可追溯至1930年成立的岭南大学工学院；广东工业专科学校的前身是1918年成立的广东省立第一甲种工业学校，其历史可追溯至1910年清政府创办的广东工艺局。这些院校是早期中国南方培养高级工程技术人才的摇篮和民主科学思想的重要策源地。";
		
		headerTv.setText(s_header);
		authorTv.setText(s_author);
		timeTv.setText(s_time);
		bodyTv.setText(s_body);
		
//		photoIb.setImageAlpha(R.drawable.scutgate);
		photoIb.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplication(), "抱歉，暂时没有相关视频", Toast.LENGTH_LONG).show();
			}
		});
		
		commentBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(VideoDetailActivity.this,ViewCommentActivity.class);
				startActivity(intent);
			}
		});
		
	}
}
