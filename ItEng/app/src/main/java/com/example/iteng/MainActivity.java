package com.example.iteng;

import android.os.Build;
import android.os.Bundle;

import com.example.iteng.NavView.AdvicesFragment;
import com.example.iteng.NavView.HomeFragment;
import com.example.iteng.NavView.ProgressFragment;
import com.example.iteng.NavView.TestFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.myToolbar);
        tabLayout=findViewById(R.id.tablayout);
        viewPager= findViewById(R.id.view_pager);
        bottomNavigationView=findViewById(R.id.bottomNav);

        //задаем экран по умолчанию для наввью
        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new HomeFragment()).commit();
        }

        //настраиваем наввью
       bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
               Fragment fragment = null;

               switch (menuItem.getItemId()){
                   case R.id.home:
                       fragment=new HomeFragment();
                       tabLayout.setVisibility(View.VISIBLE);
                       break;
                   case R.id.test:
                       fragment=new TestFragment();
                       tabLayout.setVisibility(View.GONE);
                       break;
                   case R.id.progress:
                       fragment=new ProgressFragment();
                       tabLayout.setVisibility(View.GONE);
                       break;
                   case R.id.advices:
                       fragment=new AdvicesFragment();
                       tabLayout.setVisibility(View.GONE);
                       break;
               }
               getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
               return true;
           }
       });


        setSupportActionBar(toolbar);
        setupViewPager(viewPager);

        tabLayout.setupWithViewPager(viewPager);

    }

    private void setupViewPager(ViewPager viewPager){

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new WordsFragment(),"Слова");
        viewPagerAdapter.addFragment(new ArticlesFragment(),"Статьи");

        viewPager.setAdapter(viewPagerAdapter);

    }

}