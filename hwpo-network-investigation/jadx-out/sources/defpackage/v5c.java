package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v5c implements u5c {

    @Deprecated
    public static final rwc a;

    @Deprecated
    public static final rwc b;

    @Deprecated
    public static final rwc c;

    static {
        jxc jxcVar = t4c.c;
        a = jxcVar.a("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = jxcVar.a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = jxcVar.a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // defpackage.u5c
    public final boolean b() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // defpackage.u5c
    public final boolean c() {
        return ((Boolean) b.get()).booleanValue();
    }

    @Override // defpackage.u5c
    public final boolean d() {
        return ((Boolean) c.get()).booleanValue();
    }
}
