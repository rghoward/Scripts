package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vs2 extends dr7 {
    public static final au3 G = xa6.b(new us2(), new q00(1));
    public final dt7 F;

    public vs2(int i, float f, mh4<Integer> mh4Var) {
        super(f, i);
        this.F = bl7.i(mh4Var);
    }

    @Override // defpackage.dr7
    public final int o() {
        return ((Number) ((mh4) this.F.getValue()).invoke()).intValue();
    }
}
