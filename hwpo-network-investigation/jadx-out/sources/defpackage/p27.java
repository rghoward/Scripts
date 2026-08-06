package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface p27 extends h37<Long>, yz9<Long> {
    long b();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.yz9
    default Long getValue() {
        return Long.valueOf(b());
    }

    void o(long j);

    default void s(long j) {
        o(j);
    }

    @Override // defpackage.h37
    /* bridge */ /* synthetic */ default void setValue(Long l) {
        s(l.longValue());
    }
}
