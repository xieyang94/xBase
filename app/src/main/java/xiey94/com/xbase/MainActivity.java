package xiey94.com.xbase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import xiey94.com.xybase.basex.adapterx.recyclerview.sample.SampleAdapter;
import xiey94.com.xybase.widget.xToast;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        recycler = findViewById(R.id.recycler);
//
//        List<String> datas = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            datas.add("春江潮水连海平，海上明月共潮生；滟滟随波千万里，何处春江无月明；");
//            datas.add("江流宛转绕芳甸，月照花林皆似霰；");
//        }
//        SampleAdapter adapter = new SampleAdapter(datas);
//        LinearLayoutManager manager = new LinearLayoutManager(this);
//        manager.setOrientation(LinearLayoutManager.VERTICAL);
//        recycler.setLayoutManager(manager);
//        recycler.setAdapter(adapter);


        xToast.showToast("sasaasa");

    }
}
