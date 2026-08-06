package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface g27 extends h37<Integer>, yz9<Integer> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.yz9
    default Integer getValue() {
        return Integer.valueOf(k());
    }

    void j(int i);

    int k();

    @Override // defpackage.h37
    /* bridge */ /* synthetic */ default void setValue(Integer num) {
        v(num.intValue());
    }

    default void v(int i) {
        j(i);
    }
}
