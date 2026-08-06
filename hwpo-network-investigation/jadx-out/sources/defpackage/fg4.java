package defpackage;

import android.util.Log;
import androidx.fragment.app.f;
import androidx.fragment.app.l;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fg4 {
    public static final a a = a.a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a a;

        static {
            a aVar = new a();
            new LinkedHashMap();
            a = aVar;
        }
    }

    public static a a(f fVar) {
        while (fVar != null) {
            if (fVar.isAdded()) {
                fVar.getParentFragmentManager().getClass();
            }
            fVar = fVar.getParentFragment();
        }
        return a;
    }

    public static void b(ijb ijbVar) {
        if (l.M(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(ijbVar.t.getClass().getName()), ijbVar);
        }
    }

    public static final void c(f fVar, String str) {
        fVar.getClass();
        str.getClass();
        b(new qf4(fVar, "Attempting to reuse fragment " + fVar + " with previous ID " + str));
        a(fVar).getClass();
    }
}
