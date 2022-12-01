package com.example.lectureclassexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Text;
import java.text.SimpleDateFormat;
import java.util.Date;



public class MainActivity extends AppCompatActivity {

    public JSONArray temp;
    public JSONArray time;
    public JSONArray high;
    public JSONArray low;
    public String dateAndTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //there is this class in the android RTE 'R'
                                    //lets you get the id of various components in your code

        TextView textView = (TextView) findViewById(R.id.textView);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        dateAndTime = sdf.format(new Date());
        Integer month = Integer.valueOf(dateAndTime.substring(5,7));
        Integer day = Integer.valueOf(dateAndTime.substring(8,10));


//        textView = (TextView)findViewById(R.id.textViewd1);
//        textView.setText(month.toString() + "/" + (day).toString());
        day++;
        if (day > 30) {month++; day = 1;}
        textView = (TextView)findViewById(R.id.textViewd2);
        textView.setText(month.toString() + "/" + (day).toString());
        day++;
        if (day > 30) {month++; day = 1;}
        textView = (TextView)findViewById(R.id.textViewd3);
        textView.setText(month.toString() + "/" + (day).toString());
        day++;
        if (day > 30) {month++; day = 1;}
        textView = (TextView)findViewById(R.id.textViewd4);
        textView.setText(month.toString() + "/" + (day).toString());
        day++;
        if (day > 30) {month++; day = 1;}
        textView = (TextView)findViewById(R.id.textViewd5);
        textView.setText(month.toString() + "/" + (day).toString());
        day++;
        if (day > 30) {month++; day = 1;}
        textView = (TextView)findViewById(R.id.textViewd6);
        textView.setText(month.toString() + "/" + (day).toString());
        day++;
        if (day > 30) {month++; day = 1;}
        textView = (TextView)findViewById(R.id.textViewd7);
        textView.setText(month.toString() + "/" + (day).toString());

        Integer i = Integer.parseInt(dateAndTime.substring(17,19)) + 1;
        textView = (TextView)findViewById(R.id.textViewh1);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh2);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh3);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh4);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh5);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh6);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh7);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh8);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh9);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh10);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh11);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh12);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh13);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh14);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh15);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh16);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh17);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh18);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh19);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh20);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh21);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh22);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;
        textView = (TextView)findViewById(R.id.textViewh23);
        textView.setText(i.toString() + ":00"); i++; if (i > 23) i = 0;

        volleyRequest("30.27", "-97.74");

//        Button helloButton = (Button)findViewById(R.id.button2); //comes thru R object
//        helloButton.setOnClickListener(new View.OnClickListener() { //creating listener
//           @Override
//           public void onClick(View view){
//
//               Log.i("UI Event Handler", "The OK button was tapped");
////               WebView webView = (WebView) findViewById(R.id.webview);
////               webView.loadUrl("https://utexas.edu");
//               TextView textView = (TextView) findViewById(R.id.textView);
//               SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
//               String currentDateandTime = sdf.format(new Date());
//               //textView.setText(currentDateandTime);
//
//               //findHighLow();
////               try {
////                   //findHighLow();
////                   textView.setText(Double.toString(temp.getDouble(0)));
////               } catch (JSONException e) {
////                   e.printStackTrace();
////               }
//
//           }
//        });
    }

    public void okButtonTap(View view){
        EditText lat = (EditText) findViewById(R.id.editLat);
        EditText lon = (EditText) findViewById(R.id.editLong);
        volleyRequest(lat.getText().toString(), lon.getText().toString());
        TextView city = (TextView) findViewById(R.id.textView2);
        city.setText("Custom");
    }

    private void volleyRequest(String lat, String lon){
        final TextView textView = (TextView) findViewById(R.id.textView);   // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);
        String begin = "https://api.open-meteo.com/v1/forecast?latitude=";
        String middle = "&longitude=";
        String end = "&hourly=temperature_2m,relativehumidity_2m,precipitation,weathercode,windspeed_10m&daily=temperature_2m_max,temperature_2m_min,precipitation_sum,windspeed_10m_max&temperature_unit=fahrenheit&timezone=America%2FChicago";
        String url = begin + lat + middle + lon + end;
        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                // Display the first 500 characters of the response string.
                try {
                    JSONObject reader = new JSONObject(response);
                    JSONObject hourly = reader.getJSONObject("hourly");
                    time = hourly.getJSONArray("time");
                    temp = hourly.getJSONArray("temperature_2m");
                    JSONArray prec = hourly.getJSONArray("precipitation");
                    JSONObject daily = reader.getJSONObject("daily");
                    high = daily.getJSONArray("temperature_2m_max");
                    low = daily.getJSONArray("temperature_2m_min");
                    JSONArray wind = daily.getJSONArray("windspeed_10m_max");
                    //helloWorld.setText("Hello");
                    //Double.toString(temp.getDouble(0)));
//                    textView.setText(time.getString(15) + "  " + Double.toString(temp.getDouble(15))
//                            + "  " + Double.toString(high.getDouble(0)) + "  " + Double.toString(low.getDouble(0)));\
                    Integer h = Integer.valueOf(dateAndTime.substring(17,19));
                    String currTemp = Integer.toString((int)temp.getDouble(h));
                    textView.setText(currTemp + "°");

                    JSONArray cloud = hourly.getJSONArray("weathercode");
                    ImageView iv = (ImageView) findViewById(R.id.imageView);
                    if (cloud.getInt(h) != 0) {
                        iv.setImageResource(R.drawable.ic_baseline_cloud_24);
                    }
                    else {
                        iv.setImageResource(R.drawable.ic_baseline_wb_sunny_24);
                    }

                    int i = 0;
                    TextView temps = (TextView) findViewById(R.id.textViewt1);
                    temps.setText(Double.toString(high.getDouble(i)) + "°   " + Double.toString(low.getDouble(i)) + "°" ); i++;
                    temps = (TextView) findViewById(R.id.textViewt2);
                    temps.setText(Double.toString(high.getDouble(i)) + "°   " + Double.toString(low.getDouble(i)) + "°" ); i++;
                    temps = (TextView) findViewById(R.id.textViewt3);
                    temps.setText(Double.toString(high.getDouble(i)) + "°   " + Double.toString(low.getDouble(i)) + "°" ); i++;
                    temps = (TextView) findViewById(R.id.textViewt4);
                    temps.setText(Double.toString(high.getDouble(i)) + "°   " + Double.toString(low.getDouble(i)) + "°" ); i++;
                    temps = (TextView) findViewById(R.id.textViewt5);
                    temps.setText(Double.toString(high.getDouble(i)) + "°   " + Double.toString(low.getDouble(i)) + "°" ); i++;
                    temps = (TextView) findViewById(R.id.textViewt6);
                    temps.setText(Double.toString(high.getDouble(i)) + "°   " + Double.toString(low.getDouble(i)) + "°" ); i++;
                    temps = (TextView) findViewById(R.id.textViewt7);
                    temps.setText(Double.toString(high.getDouble(i)) + "°   " + Double.toString(low.getDouble(i)) + "°" ); i++;

                    i=0;
                    temps = (TextView) findViewById(R.id.hum1); temps.setText(Double.toString(wind.getDouble(i))); i++;
                    temps = (TextView) findViewById(R.id.hum2); temps.setText(Double.toString(wind.getDouble(i))); i++;
                    temps = (TextView) findViewById(R.id.hum3); temps.setText(Double.toString(wind.getDouble(i))); i++;
                    temps = (TextView) findViewById(R.id.hum4); temps.setText(Double.toString(wind.getDouble(i))); i++;
                    temps = (TextView) findViewById(R.id.hum5); temps.setText(Double.toString(wind.getDouble(i))); i++;
                    temps = (TextView) findViewById(R.id.hum6); temps.setText(Double.toString(wind.getDouble(i))); i++;
                    temps = (TextView) findViewById(R.id.hum7); temps.setText(Double.toString(wind.getDouble(i)));

                    i=Integer.valueOf(dateAndTime.substring(17,19));
                    temps = (TextView) findViewById(R.id.textViewf0); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf1); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf2); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf3); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf4); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf5); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf6); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf7); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf8); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf9); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf10); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf11); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf12); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf13); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf14); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf15); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf16); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf17); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf18); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf19); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf20); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf21); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf22); temps.setText(Double.toString(temp.getDouble(i)) + "°"); i++;
                    temps = (TextView) findViewById(R.id.textViewf23); temps.setText(Double.toString(temp.getDouble(i)) + "°");

                    i=Integer.valueOf(dateAndTime.substring(17,19));
                    temps = (TextView) findViewById(R.id.textViewp0); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp1); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp2); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp3); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp4); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp5); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp6); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp7); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp8); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp9); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp10); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp11); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp12); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp13); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp14); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp15); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp16); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp17); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp18); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp19); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp20); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp21); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp22); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;
                    temps = (TextView) findViewById(R.id.textViewp23); temps.setText(Double.toString(prec.getDouble(i)) + "mm"); i++;



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText("That didn't work!");
            }
        });
// Add the request to the RequestQueue.
        queue.add(stringRequest);
    }

//    void findHighLow(){
//        ArrayList <Double> highLow = new ArrayList<>();
//        double high = 0;
//        double low = 1000;
//        try{
//        for (int i = 0; i < 7; i++){
//            for (int j = 0; j < 24; j++){
//                Double curr = temp.getDouble(i*24+j);
//                if (curr > high) high = curr;
//                if (curr < low) low = curr;
//            }
//            highLow.add(high);
//            highLow.add(low);
//            high = 0;
//            low = 1000;
//        } }
//        catch (JSONException e) {
//            e.printStackTrace();
//        }
//        //return highLow.toString();
//    }
}
/*gradle is the build engine for the android projects. Takes the source code and compiles it into
outputs in a file called APK.
*/