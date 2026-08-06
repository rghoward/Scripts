package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q6c implements p6c {
    public static final xza a = new xza(t4c.c, 11);

    @Override // defpackage.p6c
    public final boolean b() {
        return ((Boolean) a.a(1, "measurement.rb.attribution.client2", true).get()).booleanValue();
    }

    @Override // defpackage.p6c
    public final boolean c() {
        return ((Boolean) a.a(2, "measurement.rb.attribution.service.trigger_uris_high_priority", true).get()).booleanValue();
    }

    @Override // defpackage.p6c
    public final boolean d() {
        return ((Boolean) a.a(4, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true).get()).booleanValue();
    }

    @Override // defpackage.p6c
    public final boolean e() {
        return ((Boolean) a.a(6, "measurement.rb.attribution.service", true).get()).booleanValue();
    }

    @Override // defpackage.p6c
    public final boolean f() {
        return ((Boolean) a.a(7, "measurement.rb.attribution.enable_trigger_redaction", true).get()).booleanValue();
    }

    @Override // defpackage.p6c
    public final boolean h() {
        return ((Boolean) a.a(8, "measurement.rb.attribution.uuid_generation", true).get()).booleanValue();
    }
}
