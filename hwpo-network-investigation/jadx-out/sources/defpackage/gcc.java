package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.g;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.intercom.twig.BuildConfig;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gcc implements aw8 {
    public final mkc a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public gcc(mkc mkcVar) {
        this.a = mkcVar;
    }

    @Override // defpackage.aw8
    public final q6d a(g gVar, zv8 zv8Var) {
        if (zv8Var.b()) {
            return caa.e(null);
        }
        Intent intent = new Intent(gVar, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", zv8Var.a());
        intent.putExtra("window_flags", gVar.getWindow().getDecorView().getWindowSystemUiVisibility());
        t9a t9aVar = new t9a();
        intent.putExtra("result_receiver", new rac(this.b, t9aVar));
        gVar.startActivity(intent);
        return t9aVar.a;
    }

    @Override // defpackage.aw8
    public final q6d b() {
        String str;
        mkc mkcVar = this.a;
        String str2 = mkcVar.b;
        nkc nkcVar = mkc.c;
        nkcVar.a("requestInAppReview (%s)", str2);
        s3d s3dVar = mkcVar.a;
        if (s3dVar != null) {
            t9a t9aVar = new t9a();
            s3dVar.a().post(new tsc(s3dVar, t9aVar, t9aVar, new vec(mkcVar, t9aVar, t9aVar)));
            return t9aVar.a;
        }
        Object[] objArr = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", nkc.c(nkcVar.a, "Play Store app is either not installed or not the official version", objArr));
        }
        Locale locale = Locale.getDefault();
        HashMap map = mxb.a;
        if (map.containsKey(-1)) {
            str = ((String) map.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) mxb.b.get(-1)) + ")";
        } else {
            str = BuildConfig.FLAVOR;
        }
        return caa.d(new yv8(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, str), null, null)));
    }
}
