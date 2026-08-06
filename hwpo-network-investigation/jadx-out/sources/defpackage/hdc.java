package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hdc {
    public final HashSet a;
    public final r82 b;

    public hdc(AppMeasurementSdk appMeasurementSdk, r82 r82Var) {
        this.b = r82Var;
        appMeasurementSdk.a(new xbc(this));
        this.a = new HashSet();
    }
}
