package com.example.cardbattle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Card extends Activity {
	 private ImageButton button_fight;
	 private ImageButton button_card;
	 private ImageButton button_shop;
	 private ImageButton button_home;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_midgard);
       button_fight = (ImageButton)findViewById(R.id.imageButton1);
       button_fight.setOnTouchListener(listener);
       button_fight.setOnClickListener(listener5);

       button_card = (ImageButton)findViewById(R.id.imageButton2);
       button_card.setOnTouchListener(listener2);
       button_card.setOnClickListener(listener6);
       button_shop = (ImageButton)findViewById(R.id.imageButton3);
       button_shop.setOnTouchListener(listener3);
       button_shop.setOnClickListener(listener7);

       button_home = (ImageButton)findViewById(R.id.imageButton4);
       button_home.setOnTouchListener(listener4);
       button_home.setOnClickListener(listener8);


   };
private ImageButton.OnTouchListener listener=new ImageButton.OnTouchListener(){
       @Override
      public boolean onTouch(View arg0, MotionEvent motionEvent) {
           if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {  //按下的時候改變背景及顏色
        	   button_fight.setImageResource(R.drawable.menu_click_02);

           }  
           if (motionEvent.getAction() == MotionEvent.ACTION_UP) {  //起來的時候恢復背景與顏色
        	   button_fight.setImageResource(R.drawable.menu_02);
                          }  
       return false;
      };
   };

   private ImageButton.OnClickListener listener5 = new ImageButton.OnClickListener(){

       @Override
       public void onClick(View arg0) {
           // TODO Auto-generated method stub
           Intent intent = new Intent();
           intent.setClass(Card.this,Fight.class);
           startActivity(intent);
           finish();
       }
   };

   private ImageButton.OnTouchListener listener2=new ImageButton.OnTouchListener(){
       @Override
      public boolean onTouch(View arg0, MotionEvent motionEvent) {
           if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {  //按下的時候改變背景及顏色
        	   button_card.setImageResource(R.drawable.menu_click_03);

           }  
           if (motionEvent.getAction() == MotionEvent.ACTION_UP) {  //起來的時候恢復背景與顏色
        	   button_card.setImageResource(R.drawable.menu_03);
                          }  
       return false;
      };
   };
   private ImageButton.OnClickListener listener6 = new ImageButton.OnClickListener(){

       @Override
       public void onClick(View arg0) {
           // TODO Auto-generated method stub
           Intent intent = new Intent();
           intent.setClass(Card.this,Card.class);
           startActivity(intent);
           finish();
       }
   };

   private ImageButton.OnTouchListener listener3=new ImageButton.OnTouchListener(){
       @Override
      public boolean onTouch(View arg0, MotionEvent motionEvent) {
           if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {  //按下的時候改變背景及顏色
        	   button_shop.setImageResource(R.drawable.menu_click_04);

           }  
           if (motionEvent.getAction() == MotionEvent.ACTION_UP) {  //起來的時候恢復背景與顏色
        	   button_shop.setImageResource(R.drawable.menu_04);
                          }  
       return false;
      };
   };
   private ImageButton.OnClickListener listener7 = new ImageButton.OnClickListener(){

       @Override
       public void onClick(View arg0) {
           // TODO Auto-generated method stub
           Intent intent = new Intent();
           intent.setClass(Card.this,Shop.class);
           startActivity(intent);
           finish();
       }
   };

   private ImageButton.OnTouchListener listener4=new ImageButton.OnTouchListener(){
       @Override
      public boolean onTouch(View arg0, MotionEvent motionEvent) {
           if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {  //按下的時候改變背景及顏色
        	   button_home.setImageResource(R.drawable.menu_click_05);

           }  
           if (motionEvent.getAction() == MotionEvent.ACTION_UP) {  //起來的時候恢復背景與顏色
        	   button_home.setImageResource(R.drawable.menu_05);
                          }  
       return false;
      };
   };
   private ImageButton.OnClickListener listener8 = new ImageButton.OnClickListener(){

       @Override
       public void onClick(View arg0) {
           // TODO Auto-generated method stub
           Intent intent = new Intent();
           intent.setClass(Card.this,Midgard.class);
           startActivity(intent);
           finish();
       }
   };
}