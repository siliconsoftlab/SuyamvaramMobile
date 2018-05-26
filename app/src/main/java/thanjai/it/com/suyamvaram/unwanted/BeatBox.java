package thanjai.it.com.suyamvaram.unwanted;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BeatBox {
    private static final String TAG="BeatBox";
    private static final String SOUNDS_FOLDER="sample_sounds";
    private AssetManager mAssets;
    private List<Sound> mSounds=new ArrayList<Sound>();
    public BeatBox(Context context){
        mAssets=context.getAssets();
        loadSounds();
    }
       public void loadSounds(){
        String[] soundNames=null;
        try{
            soundNames=mAssets.list(SOUNDS_FOLDER);
            Log.i(TAG,"Found "+soundNames.length+" sounds");
        }catch (IOException ioe){

        }
        for(String filename: soundNames){
            String assetPath=SOUNDS_FOLDER+"/"+filename;
            Sound sound=new Sound(assetPath);
            mSounds.add(sound);

        }
       }

    public List<Sound> getmSounds() {
        return mSounds;
    }
}
