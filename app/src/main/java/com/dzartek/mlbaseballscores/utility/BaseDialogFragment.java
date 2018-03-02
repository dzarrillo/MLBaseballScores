package com.dzartek.mlbaseballscores.utility;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;

import com.dzartek.mlbaseballscores.R;

/**
 * Created by dzarrillo on 2/12/2018.
 */

public class BaseDialogFragment extends DialogFragment{

    public BaseDialogFragment() {
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String title;
        String message;

        title = getArguments().getString("TITLE");
        message = getArguments().getString("MESSAGE");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(message).setTitle(title)
                .setIcon(R.mipmap.ic_launcher)
                .setNeutralButton(getResources().getString(R.string.ok), null);

        return builder.create();
    }
}
