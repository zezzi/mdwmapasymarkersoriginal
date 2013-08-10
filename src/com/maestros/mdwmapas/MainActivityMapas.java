package com.maestros.mdwmapas;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.PopupMenu.OnMenuItemClickListener;

public class MainActivityMapas extends Activity implements  OnMenuItemClickListener{
	
	public static final String APPTAG = "MDWRestaurantes";
	Location mCurrentLocation;
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_mapas); 
        
    } 

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_activity_mapas, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_licencia:
            	Log.d("menu"," menu-licencia");
            	Intent nextScreen2 = new Intent(MainActivityMapas.this, Contactenos.class);
                startActivityForResult(nextScreen2, 0);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }  

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            default:
                return false;
        }
    }
    
    
}
