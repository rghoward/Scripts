package defpackage;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xl implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ xl(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                cm cmVar = (cm) obj;
                cmVar.X0 = false;
                MotionEvent motionEvent = cmVar.P0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() != 10) {
                    aa0.c("The ACTION_HOVER_EXIT event was not cleared.");
                } else {
                    cmVar.g0(motionEvent);
                }
                break;
            default:
                ((o38) obj).k();
                break;
        }
    }
}
