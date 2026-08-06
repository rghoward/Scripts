package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ix6 extends mf6<jx6.a<Object>, Object> {
    @Override // defpackage.mf6
    public final void c(jx6.a<Object> aVar, Object obj) {
        jx6.a<Object> aVar2 = aVar;
        aVar2.getClass();
        ArrayDeque arrayDeque = jx6.a.b;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar2);
        }
    }
}
