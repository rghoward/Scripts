package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g5c implements b5c {

    @Deprecated
    public static final rwc a;

    @Deprecated
    public static final rwc b;

    static {
        jxc jxcVar = t4c.c;
        a = jxcVar.a("measurement.set_default_event_parameters.fix_app_update_logging", true);
        b = jxcVar.a("measurement.set_default_event_parameters.fix_service_request_ordering", false);
    }

    @Override // defpackage.b5c
    public final boolean a() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // defpackage.b5c
    public final boolean b() {
        return ((Boolean) b.get()).booleanValue();
    }
}
