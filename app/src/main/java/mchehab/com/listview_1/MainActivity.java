package mchehab.com.listview_1;

import android.app.Dialog;
import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> listStrings = createDummyStringList();
        List<Person> listPerson = createList();

        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> arrayAdapterString = new ArrayAdapter<>(this, R.layout.textview, listStrings);
        final ArrayAdapter<Person> arrayAdapterPerson = new ArrayAdapter<>(this, R.layout.textview,
                listPerson);

//        for the demo, set the adapter that you want
        listView.setAdapter(arrayAdapterPerson);
    }

    /**
     * Helper method to create a list of Strings
     * @return
     */
    private List<String> createDummyStringList(){
        List<String> list = new ArrayList<>();
        for(int i=0;i<100;i++){
            list.add("string #" + (i+1));
        }

        return list;
    }

    /**
     * Helper method for creating List of {@link Person}
     * @return
     */
    private List<Person> createList(){
        List<Person> list = new ArrayList<>();
        list.add(new Person("John", "Smith", 31));
        list.add(new Person("Aaron", "Wilson", 15));
        list.add(new Person("Delisa", "Lecrocy", 18));
        list.add(new Person("Melania", "Pita", 10));
        list.add(new Person("Georgetta", "Bigler", 20));
        list.add(new Person("Celsa", "Ries", 35));
        list.add(new Person("Riley", "Lepore", 19));
        list.add(new Person("Martin", "Cash", 11));
        list.add(new Person("Thomas", "Bittle", 16));
        list.add(new Person("Christopher", "Lacross", 16));
        list.add(new Person("Bennet", "Rodas", 17));

        return list;
    }
}