package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vs7 extends ws7<Object> {
    public final /* synthetic */ ws7 a;

    public vs7(ws7 ws7Var) {
        this.a = ws7Var;
    }

    @Override // defpackage.ws7
    public final void a(sp8 sp8Var, Object obj) {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.a.a(sp8Var, Array.get(obj, i));
        }
    }
}
