package easter.george.bookie.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import easter.george.bookie.ChatActivity;
import easter.george.bookie.CreateBookClubActivity;
import easter.george.bookie.MainActivity;
import easter.george.bookie.MyBookClubsActivity;
import easter.george.bookie.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        Button forum_1Btn = root.findViewById(R.id.forum1);
        forum_1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForum();
            }
        });

        Button forum_2Btn = root.findViewById(R.id.forum2);
        forum_2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForum();
            }
        });
        Button forum_3Btn = root.findViewById(R.id.forum3);
        forum_3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForum();
            }
        });
        Button forum_4Btn = root.findViewById(R.id.forum4);
        forum_4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForum();
            }
        });
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(R.string.app_name);
            }
        });
        return root;
    }

    private void openForum()
    {
        Intent i = new Intent(getActivity(), ChatActivity.class);
        startActivity(i);
    }

    @Override
    public void onStart() {
        super.onStart();
    }
}