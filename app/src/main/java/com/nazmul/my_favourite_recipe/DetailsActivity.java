package com.nazmul.my_favourite_recipe;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
     TextView textName,TextDescription;
     ImageView imageFood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("Recipe Details");//for actionbar title

        textName=(TextView) findViewById(R.id.textName);
        TextDescription=(TextView) findViewById(R.id.textDescription);
        imageFood=(ImageView) findViewById(R.id.image_food);


      String getRecipeNo = getIntent().getExtras().getString("recipe_no");

        if(getRecipeNo.equals("one"))
        {
            textName.setText("Falafel Burger");

            TextDescription.setText(R.string.falafel_burger);
            imageFood.setImageResource(R.drawable.falafel_burgers);



        }
        else if (getRecipeNo.equals("two")){
            textName.setText("chicken_biriyani");
            TextDescription.setText(R.string.chicken_biriyani);
            imageFood.setImageResource(R.drawable.chicken_biriyani);

        }



    }







    //for back button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
