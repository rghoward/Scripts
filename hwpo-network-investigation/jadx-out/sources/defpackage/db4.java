package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class db4 implements Callable<hb4.a> {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ bb4 c;
    public final /* synthetic */ int d;

    public db4(String str, Context context, bb4 bb4Var, int i) {
        this.a = str;
        this.b = context;
        this.c = bb4Var;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final hb4.a call() {
        Object[] objArr = {this.c};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return hb4.b(this.a, this.b, Collections.unmodifiableList(arrayList), this.d);
    }
}
