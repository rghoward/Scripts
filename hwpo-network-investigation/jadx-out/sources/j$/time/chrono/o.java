package j$.time.chrono;

import j$.time.temporal.TemporalField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements j {
    public static final o AH;
    public static final /* synthetic */ o[] a;

    static {
        o oVar = new o("AH", 0);
        AH = oVar;
        a = new o[]{oVar};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) a.clone();
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t l(TemporalField temporalField) {
        return temporalField == j$.time.temporal.a.ERA ? j$.time.temporal.t.f(1L, 1L) : super.l(temporalField);
    }
}
