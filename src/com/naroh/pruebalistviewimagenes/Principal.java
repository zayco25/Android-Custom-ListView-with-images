package com.naroh.pruebalistviewimagenes;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class Principal extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);

		ListView lista = (ListView) findViewById(R.id.listadirectivos);
		ArrayList<Directivo> arraydir = new ArrayList<Directivo>();
		Directivo directivo;

		// Introduzco los datos
		directivo = new Directivo(getResources().getDrawable(R.drawable.ariannahuffington), "Arianna Huffington", "Presidenta");
		arraydir.add(directivo);
		directivo = new Directivo(getResources().getDrawable(R.drawable.corinna), "Princesa Corinna", "CEO");
		arraydir.add(directivo);
		directivo = new Directivo(getResources().getDrawable(R.drawable.hillaryclinton), "Hillary Clinton", "Tesorera");
		arraydir.add(directivo);
		directivo = new Directivo(getResources().getDrawable(R.drawable.bono), "Bono el de U2", "Amenizador");
		arraydir.add(directivo);
		directivo = new Directivo(getResources().getDrawable(R.drawable.carmenmairena), "Carmen de Mairena", "Directora RRHH");
		arraydir.add(directivo);

		// Creo el adapter personalizado
		AdapterDirectivos adapter = new AdapterDirectivos(this, arraydir);

		// Lo aplico
		lista.setAdapter(adapter);


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;
	}

}
