package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fb4 implements Callable<hb4.a> {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;

    public fb4(String str, Context context, ArrayList arrayList, int i) {
        this.a = str;
        this.b = context;
        this.c = arrayList;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final hb4.a call() {
        try {
            return hb4.b(this.a, this.b, this.c, this.d);
        } catch (Throwable unused) {
            return new hb4.a(-3);
        }
    }
}
