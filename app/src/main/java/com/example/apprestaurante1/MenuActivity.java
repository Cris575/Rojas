package com.example.apprestaurante1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import android.view.MenuItem;
import android.content.Intent;

public class MenuActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // Configurar el botón de hamburguesa para abrir y cerrar el drawer
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Manejar la lógica de clic en los elementos del menú aquí
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Abrir la vista de Principal
            openHomeView();
        } else if (id == R.id.nav_cat) {
            // Abrir la vista de Categorías
            openCategoriesView();
        } else if (id == R.id.nav_prod) {
            // Abrir la vista de Productos
            openProductsView();
        }

        // Cerrar el Drawer después de la selección de un item
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    private void openHomeView() {
        // Implementar la lógica para abrir la vista de Principal
    }

    private void openCategoriesView() {
        Intent intent = new Intent(this, openCategoriesView.class);
        startActivity(intent);
    }

    private void openProductsView() {
        Intent intent = new Intent(this, openProductsView.class);
        startActivity(intent);
    }
}