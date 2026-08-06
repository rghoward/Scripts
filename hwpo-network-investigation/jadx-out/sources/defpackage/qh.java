package defpackage;

import com.google.gson.internal.ObjectConstructor;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qh implements ObjectConstructor {
    public static void a(int i, bj4 bj4Var, int i2, bt1.a.b bVar) {
        bj4Var.C(Integer.valueOf(i));
        bj4Var.b(bVar, Integer.valueOf(i2));
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        return new ArrayDeque();
    }
}
