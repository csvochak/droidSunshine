package com.letmecleanit.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    private ArrayAdapter forecastAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main,container,false);

        String [] forecastArray = {
            "Today - Sunny and Muggy, take cover - 66/22",
            "Tomorrow - Unknown, Umbrella or swimsuit - 88/15",
            "Sat - Stop Trying, 55/33",
            "Sun - Unpredictable, -/-",
            "Mon - Absolute Chaos, 120/105",
            "Tue - Eat your peas, 80/90",
            "Wed - Sleepy Time, 70/80",

        };

        List<String> weekForecast = new ArrayList<String>(
                Arrays.asList(forecastArray));

        forecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast
        );

        ListView forecastList;
        forecastList = (ListView)rootView.findViewById(R.id.listview_forecast);
        forecastList.setAdapter(forecastAdapter);

        return rootView;
    }
}
