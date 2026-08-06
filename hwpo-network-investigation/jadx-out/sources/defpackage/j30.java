package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class j30 {
    public static void a(Status status, Object obj, t9a t9aVar) {
        if (status.t <= 0) {
            t9aVar.b(obj);
        } else {
            t9aVar.a(status.v != null ? new ht8(status) : new rx(status));
        }
    }
}
