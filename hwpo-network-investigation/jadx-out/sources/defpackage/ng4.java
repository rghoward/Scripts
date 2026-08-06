package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ng4 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ ArrayList u;
    public final /* synthetic */ ArrayList v;
    public final /* synthetic */ ArrayList w;
    public final /* synthetic */ ArrayList x;

    public ng4(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.t = i;
        this.u = arrayList;
        this.v = arrayList2;
        this.w = arrayList3;
        this.x = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.t; i++) {
            View view = (View) this.u.get(i);
            String str = (String) this.v.get(i);
            WeakHashMap<View, fib> weakHashMap = egb.a;
            view.setTransitionName(str);
            ((View) this.w.get(i)).setTransitionName((String) this.x.get(i));
        }
    }
}
