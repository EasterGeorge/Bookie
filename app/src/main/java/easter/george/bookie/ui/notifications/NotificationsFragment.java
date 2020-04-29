package easter.george.bookie.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import easter.george.bookie.AboutPopup;
import easter.george.bookie.MainActivity;
import easter.george.bookie.R;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_profile, container, false);
        //final TextView textView = root.findViewById(R.id.text_notifications);
        notificationsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
            }
        });
        TextView myTextView= root.findViewById(R.id.logout_Text);
        myTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), MainActivity.class);
                Toast.makeText(getActivity(),"You have been Logged Out",Toast.LENGTH_SHORT).show();
                startActivity(myIntent);
            }
        });
        ImageView myImg = root.findViewById(R.id.info_image);
        myImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AboutPopup myPopUp= new AboutPopup();
                myPopUp.showPopupWindow(v);
            }
        });
        return root;
    }
}