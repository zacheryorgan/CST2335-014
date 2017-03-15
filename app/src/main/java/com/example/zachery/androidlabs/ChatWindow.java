package com.example.zachery.androidlabs;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;



public class ChatWindow extends AppCompatActivity {


    public ArrayList<String> messages = new ArrayList<String>();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_window);

        final EditText editSend = (EditText)findViewById(R.id.editSend);
        final Button send = (Button)findViewById(R.id.send);
        final ListView listView = (ListView)findViewById(R.id.listView);

        final ChatAdapter messageAdapter = new ChatAdapter(this);




        listView.setAdapter(messageAdapter);



        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String string = editSend.getText().toString();
                messages.add(string);
                messageAdapter.notifyDataSetChanged();
                editSend.setText("");

            }

        });



    }

     private class ChatAdapter extends ArrayAdapter<String> {

        public ChatAdapter(Context ctx) {
            super(ctx, 0);



        }

         public int getCount(){
             return messages.size();

         }

         public String getItem(int position){
            return messages.get(position);

         }

         public View getView (int position, View convertView, ViewGroup parent){
             LayoutInflater inflater = ChatWindow.this.getLayoutInflater();
             View result = null;
             if(position%2 ==0)
                 result = inflater.inflate(R.layout.chat_row_incoming, null);
             else
                 result = inflater.inflate(R.layout.chat_row_outgoing, null);

             TextView message = (TextView)result.findViewById(R.id.message_text);
             message.setText( getItem(position));
             return result;

         }




     }

}
