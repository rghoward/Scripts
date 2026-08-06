package defpackage;

import android.util.Log;
import androidx.fragment.app.i;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i04 implements lh7, mb2 {
    @Override // defpackage.mb2
    public Object c(i iVar) {
        iVar.getClass();
        return new jo9();
    }

    @Override // defpackage.lh7
    public void d(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }
}
