package defpackage;

import android.media.metrics.TrackChangeEvent;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o82 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Parcelable v;

    public /* synthetic */ o82(Object obj, Parcelable parcelable, int i) {
        this.t = i;
        this.u = obj;
        this.v = parcelable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Parcelable parcelable = this.v;
        Object obj = this.u;
        switch (i) {
            case 0:
                p82 p82Var = (p82) obj;
                q82 q82VarB = p82Var.b((zoa) parcelable);
                if (q82VarB != null) {
                    p82Var.a.add(q82VarB);
                }
                break;
            default:
                ((sp6) obj).d.reportTrackChangeEvent((TrackChangeEvent) parcelable);
                break;
        }
    }
}
