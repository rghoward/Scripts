package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s2c implements e3c {
    public final e3c[] a;

    public s2c(e3c... e3cVarArr) {
        this.a = e3cVarArr;
    }

    @Override // defpackage.e3c
    public final boolean a(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.e3c
    public final z2c b(Class cls) {
        for (int i = 0; i < 2; i++) {
            e3c e3cVar = this.a[i];
            if (e3cVar.a(cls)) {
                return e3cVar.b(cls);
            }
        }
        ru3.f("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }
}
