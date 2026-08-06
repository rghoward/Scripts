package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class id5 extends InputConnectionWrapper {
    public final /* synthetic */ hd5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id5(InputConnection inputConnection, hd5 hd5Var) {
        super(inputConnection, false);
        this.a = hd5Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        kd5 kd5Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            kd5Var = new kd5(new kd5.a(inputContentInfo));
        }
        if (this.a.a(kd5Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
