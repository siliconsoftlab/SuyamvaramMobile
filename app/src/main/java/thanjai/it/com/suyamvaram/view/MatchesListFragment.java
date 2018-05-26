package thanjai.it.com.suyamvaram.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import thanjai.it.com.suyamvaram.R;
import thanjai.it.com.suyamvaram.model.UserOld;

public class MatchesListFragment extends Fragment {
    private RecyclerView mCrimeRecyclerView;
    private MatchesAdapter mAdapter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_list,container,false);
        mCrimeRecyclerView=view.findViewById(R.id.matches_list_recycler_view);
        mCrimeRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();
        return view;
           }

    private class MatchesHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
       private UserOld mUser;
        private TextView txtView_fname;
        private TextView txtVw_status;
        private TextView txtVw_city;
        public MatchesHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.matches_layout, parent, false));
            txtView_fname=itemView.findViewById(R.id.txtVw_fname);
            txtVw_status=itemView.findViewById(R.id.txtVw_status);
            txtVw_city=itemView.findViewById(R.id.txtVw_city);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            Intent intent=new Intent(getContext(),MatchDetailActivity.class);
            startActivity(intent);
        }
        public void bind(UserOld user){
            mUser=user;
            txtView_fname.setText(mUser.getId()+"");
            txtVw_status .setText("Status");
            txtVw_city.setText("Thanjavur");

        }
    }
    private class MatchesAdapter extends RecyclerView.Adapter<MatchesHolder> {

        private List<UserOld> mMatches;

        public MatchesAdapter(List<UserOld> users) {
            this.mMatches = users;
        }

        @Override
        public MatchesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new MatchesHolder(layoutInflater, parent);

        }

        @Override
        public void onBindViewHolder(MatchesHolder holder, int position) {
        UserOld user=mMatches.get(position);
        holder.bind(user);
        }

        @Override
        public int getItemCount() {
            return mMatches.size();
        }


    }
    private void updateUI() {
        UserOld user= new UserOld();
        List<UserOld> users = new ArrayList<UserOld>();
        for (int i=0;i<10;i++){
            users.add(user);
        }


        mAdapter = new MatchesAdapter(users);
        mCrimeRecyclerView.setAdapter(mAdapter);
    }

}
