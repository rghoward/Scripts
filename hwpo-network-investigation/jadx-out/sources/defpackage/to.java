package defpackage;

import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class to {
    public final ArrayList a;
    public final int b;
    public final MotionEvent c;

    public to(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.a = arrayList;
        this.b = i;
        this.c = motionEvent;
        if (arrayList.isEmpty()) {
            z90.a("changes cannot be empty");
            throw null;
        }
    }
}
