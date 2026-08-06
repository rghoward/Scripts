package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.appcompat.widget.AppCompatEditText;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hd5 implements pf4 {
    public final /* synthetic */ Object t;

    public /* synthetic */ hd5(Object obj) {
        this.t = obj;
    }

    public boolean a(kd5 kd5Var, int i, Bundle bundle) {
        hz1.b aVar;
        AppCompatEditText appCompatEditText = (AppCompatEditText) this.t;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                kd5Var.a.b();
                Parcelable parcelable = (Parcelable) kd5Var.a.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        kd5.c cVar = kd5Var.a;
        ClipData clipData = new ClipData(cVar.d(), new ClipData.Item(cVar.a()));
        if (i2 >= 31) {
            aVar = new hz1.a(clipData, 2);
        } else {
            hz1.c cVar2 = new hz1.c();
            cVar2.a = clipData;
            cVar2.b = 2;
            aVar = cVar2;
        }
        aVar.a(cVar.c());
        aVar.setExtras(bundle);
        return egb.k(appCompatEditText, aVar.build()) == null;
    }

    @Override // defpackage.pf4
    public void d(Bundle bundle, String str) {
        mj7 mj7Var = (mj7) this.t;
        mj7.a aVar = mj7.Companion;
        rj7 rj7VarQ = mj7Var.q();
        rj7VarQ.f(new jj7.b(rj7VarQ.B.b(R.string.your_personal_record_has_been_saved, new Object[0])));
    }
}
