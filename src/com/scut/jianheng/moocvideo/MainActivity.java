package com.scut.jianheng.moocvideo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.moocvideo.R;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setListAdapter(new SimpleAdapter(this,   
                getData("custom-item"),   
                R.layout.video_list_item,   
                new String[]{"title", "description"},
                new int[]{R.id.titleTextView, R.id.descTextView}));
	}

    /** 
     * 当List的项被选中时触发 
     */  
    protected void onListItemClick(ListView listView, View v, int position, long id) {  
        Map map = (Map)listView.getItemAtPosition(position);  
        Toast toast = Toast.makeText(this, map.get("title")+" is selected.", Toast.LENGTH_LONG);
        toast.show();  
        Intent intent = new Intent(this,VideoDetailActivity.class);
        startActivity(intent);
    }  
    
	/** 
     * 构造SimpleAdapter的第二个参数，类型为List<Map<?,?>> 
     * @param title 
     * @return 
     */  
    private List<Map<String, String>> getData(String title) {  
        List<Map<String, String>> listData = new ArrayList<Map<String, String>>();  
        for(int i = 1; i<=10; i++) {  
            Map<String, String> map = new HashMap<String, String>();  
            map.put("title", title+" "+i);  
            map.put("description", "This is the description of "+title+" "+i);  
            listData.add(map);  
        }  
          
        return listData;  
    }  
}
