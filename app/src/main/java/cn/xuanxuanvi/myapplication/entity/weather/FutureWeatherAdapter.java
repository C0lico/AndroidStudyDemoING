package cn.xuanxuanvi.myapplication.entity.weather;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cn.xuanxuanvi.myapplication.R;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHloder> {
    private List<Future> futureList;

    public WeatherAdapter(List<Future> futureList){
        this.futureList = futureList;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView date;
        private TextView temperature;
        private TextView weather;
        private TextView direct;
        private TextView wind;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.);
            temperature = itemView.findViewById(R.id.fu_temperature);
            weather = itemView.findViewById(R.id.fu_weather);
            direct = itemView.findViewById(R.id.fu_direct);
            wind = itemView.findViewById(R.id.fu_wind);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Future future = futureList.get(position);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        holder.date.setText(simpleDateFormat.format(future.getDate()));
        holder.temperature.setText(future.getTemperature());
        holder.weather.setText(future.getWeather());
        holder.direct.setText(future.getDirect());
        holder.wind.setText(future.getWid().getDay() + "~" + future.getWid().getNight());
    }

    @Override
    public int getItemCount() {
        return futureList.size();
    }

    
}
