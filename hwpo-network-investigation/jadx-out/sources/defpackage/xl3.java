package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class xl3 extends DialogFragment {
    public Dialog t;
    public DialogInterface.OnCancelListener u;
    public AlertDialog v;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.u;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.t;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.v == null) {
            Activity activity = getActivity();
            a78.g(activity);
            this.v = new AlertDialog.Builder(activity).create();
        }
        return this.v;
    }
}
