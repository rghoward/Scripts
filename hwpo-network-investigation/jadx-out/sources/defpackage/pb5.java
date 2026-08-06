package defpackage;

import android.content.Context;
import android.view.GestureDetector;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pb5 {
    public final cm.k a;
    public int b = 0;
    public boolean c;
    public final GestureDetector d;

    public pb5(Context context, cm.k kVar) {
        this.a = kVar;
        this.d = new GestureDetector(context, new ob5(this));
    }
}
