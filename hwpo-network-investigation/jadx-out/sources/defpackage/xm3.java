package defpackage;

import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xm3 implements yd6 {
    public String t;
    public o4a u;
    public Queue<q4a> v;

    @Override // defpackage.yd6
    public final void a(Object obj, String str) {
        d(new Object[]{obj});
    }

    @Override // defpackage.yd6
    public final void b(String str, Object... objArr) {
        d(objArr);
    }

    @Override // defpackage.yd6
    public final void c(String str) {
        d(null);
    }

    public final void d(Object[] objArr) {
        q4a q4aVar = new q4a();
        System.currentTimeMillis();
        q4aVar.a = this.u;
        q4aVar.b = objArr;
        Thread.currentThread().getName();
        this.v.add(q4aVar);
    }

    @Override // defpackage.yd6
    public final String getName() {
        return this.t;
    }
}
