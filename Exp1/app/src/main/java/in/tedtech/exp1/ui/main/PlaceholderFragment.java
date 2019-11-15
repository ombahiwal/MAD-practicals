package in.tedtech.exp1.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import in.tedtech.exp1.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;
    private int mOperationIndex;

    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_exp4, container, false);
        final TextView textView = root.findViewById(R.id.exp4_lbl_result);
        pageViewModel.getOperationIndex().observe(this, i -> mOperationIndex = i);

        root.findViewById(R.id.exp4_btn_solve).setOnClickListener( v -> {
            float num1, num2;
            try {
                num1 = Float.parseFloat(((EditText) root.findViewById(R.id.exp4_txt_num1)).getText().toString());
            } catch(Exception e) {
                num1 = 0;
            }
            try {
                num2 = Float.parseFloat(((EditText)root.findViewById(R.id.exp4_txt_num2)).getText().toString());
            } catch (Exception e) {
                num2 = 0;
            }
            float result = 0;
            switch (mOperationIndex) {
                case 0:
                    result = num1 + num2; break;
                case 1:
                    result = num1 - num2; break;
                case 2:
                    result = num1 * num2; break;
                case 3:
                    if(num2 !=0) {
                        result = num1 / num2;
                        break;
                    }
            }
            textView.setText("Result of operation = "+String.valueOf(result));
        });

        return root;
    }
}