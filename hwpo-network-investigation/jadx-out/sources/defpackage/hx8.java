package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hx8 {
    public final ArrayList a = new ArrayList();
    public final int b = 128;

    public final synchronized List<gx8> a() {
        return Collections.unmodifiableList(new ArrayList(this.a));
    }

    public final synchronized boolean b(List<gx8> list) {
        this.a.clear();
        if (list.size() <= this.b) {
            return this.a.addAll(list);
        }
        Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.b, null);
        return this.a.addAll(list.subList(0, this.b));
    }
}
