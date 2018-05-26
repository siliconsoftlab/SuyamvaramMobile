package thanjai.it.com.suyamvaram.unwanted;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import thanjai.it.com.suyamvaram.R;
import thanjai.it.com.suyamvaram.databinding.FragmentBeatBoxBinding;
import thanjai.it.com.suyamvaram.databinding.ListItemSoundBinding;

public class BeatBoxFragment extends Fragment{
    private BeatBox mBeatBox;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBeatBox=new BeatBox(getActivity());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentBeatBoxBinding fragmentBeatBoxBinding= DataBindingUtil.inflate(inflater, R.layout.fragment_beat_box,container,false);
        fragmentBeatBoxBinding.recylerView.setLayoutManager(new GridLayoutManager(getActivity(),3));
        fragmentBeatBoxBinding.recylerView.setAdapter(new SoundAdapter(mBeatBox.getmSounds()));
        return fragmentBeatBoxBinding.getRoot();
    }

    @Override
    public boolean getAllowEnterTransitionOverlap() {
        return super.getAllowEnterTransitionOverlap();
    }
    public class SoundHolder extends RecyclerView.ViewHolder{
    private ListItemSoundBinding mListItemSoundBinding;

        public SoundHolder(ListItemSoundBinding listItemSoundBinding) {
            super(listItemSoundBinding.getRoot());
            mListItemSoundBinding=listItemSoundBinding;
        }
    }

    public class SoundAdapter extends RecyclerView.Adapter<SoundHolder>{
        public List<Sound> mSounds;
        public  SoundAdapter(List<Sound> sounds)
        {
            mSounds=sounds;
        }
        @Override
        public SoundHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater=LayoutInflater.from(getActivity());
            ListItemSoundBinding mListItemSoundBinding=DataBindingUtil.inflate(inflater,R.layout.list_item_sound,parent,false);
            return new SoundHolder(mListItemSoundBinding);
        }


        @Override
        public void onBindViewHolder(SoundHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return mSounds.size();
        }
    }
}
