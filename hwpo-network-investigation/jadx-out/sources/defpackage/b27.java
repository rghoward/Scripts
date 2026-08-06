package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface b27 extends h37<Float>, yz9<Float> {
    void g(float f);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.yz9
    default Float getValue() {
        return Float.valueOf(h());
    }

    float h();

    @Override // defpackage.h37
    /* bridge */ /* synthetic */ default void setValue(Float f) {
        w(f.floatValue());
    }

    default void w(float f) {
        g(f);
    }
}
