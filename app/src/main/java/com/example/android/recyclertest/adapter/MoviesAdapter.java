package com.example.android.recyclertest.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.recyclertest.R;
import com.example.android.recyclertest.model.Movie;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {

    private List<Movie> adapters;

    public MoviesAdapter(List<Movie> adapters) {
        this.adapters = adapters;
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private TextView genre;
        private TextView year;

        public MovieViewHolder(View itemView) {
            super(itemView);
            this.title = (TextView) itemView.findViewById(R.id.title);
            this.genre = (TextView) itemView.findViewById(R.id.genre);
            this.year = (TextView) itemView.findViewById(R.id.year);
        }
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_row, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {

        Movie movie = this.adapters.get(position);
        holder.title.setText(movie.getTitle());
        holder.
    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
