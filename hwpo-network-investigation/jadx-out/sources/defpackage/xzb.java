package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xzb implements x1c {
    public static final xzb b = new xzb(0);
    public static final xzb c = new xzb(1);
    public final /* synthetic */ int a;

    public /* synthetic */ xzb(int i) {
        this.a = i;
    }

    @Override // defpackage.x1c
    public final boolean a(int i) {
        switch (this.a) {
            case 0:
                return yzb.e(i) != null;
            default:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
        }
    }
}
