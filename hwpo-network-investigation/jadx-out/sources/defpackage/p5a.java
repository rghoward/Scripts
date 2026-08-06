package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.e;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class p5a extends e {
    public Dialog J;
    public DialogInterface.OnCancelListener K;
    public AlertDialog L;

    @Override // androidx.fragment.app.e
    public final Dialog m() {
        Dialog dialog = this.J;
        if (dialog != null) {
            return dialog;
        }
        this.A = false;
        if (this.L == null) {
            Context context = getContext();
            a78.g(context);
            this.L = new AlertDialog.Builder(context).create();
        }
        return this.L;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.K;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
