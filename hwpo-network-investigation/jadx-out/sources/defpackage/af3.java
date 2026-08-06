package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class af3 implements ja5 {
    public final boolean t;

    public af3(boolean z) {
        this.t = z;
    }

    @Override // defpackage.ja5
    public final rb7 b() {
        return null;
    }

    @Override // defpackage.ja5
    public final boolean h() {
        return this.t;
    }

    public final String toString() {
        return wu0.a(new StringBuilder("Empty{"), this.t ? "Active" : "New", '}');
    }
}
