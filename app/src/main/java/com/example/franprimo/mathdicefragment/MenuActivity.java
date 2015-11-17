package com.example.franprimo.mathdicefragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MenuActivity extends Activity implements ListFragment.ListFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


    }

    //Tenemos que crear este metodo porque es el que implementa al ListFragmentListener
    public void onListSelected(int position, String item){
        //Toast.makeText(this, "Posicion elegida: "+position,Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MenuActivity.this, ContenedorActivity.class);
        //Con la siguiente linea de codigo pasamos el string de la variable item al
        //activity que conecta el intent.
        intent.putExtra("item", item);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
