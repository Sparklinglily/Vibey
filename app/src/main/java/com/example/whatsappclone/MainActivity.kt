package com.example.whatsappclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_maim, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.app_bar_search -> {
                Toast.makeText(this, "Search button  clicked", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.linked -> {
                Toast.makeText(this, "Linked devices clicked", Toast.LENGTH_LONG).show()
                return true
            }

            R.id.new_group -> {
                goToNewGroupActivity()
                return true
            }
            R.id.new_broadcast -> {
                goToNewBroadcast()
                return true
            }
            R.id.settings -> {
                Toast.makeText(this, "Settings clicked", Toast.LENGTH_LONG).show()
                return true
            }
            else-> {
                return false
            }

        }
    }

    private fun goToNewGroupActivity(){
       val i = Intent( this, NewGroup::class.java)
        startActivity(i)

    }
    private fun goToNewBroadcast(){
        val i = Intent( this, broadcast::class.java)
        startActivity(i)

    }

}