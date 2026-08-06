package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class um4 implements vm4<Object> {
    public volatile Object a;
    public final /* synthetic */ vm4 b;

    public um4(vm4 vm4Var) {
        this.b = vm4Var;
    }

    @Override // defpackage.vm4
    public final Object get() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        Object obj = this.b.get();
                        ov9.d(obj, "Argument must not be null");
                        this.a = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.a;
    }
}
