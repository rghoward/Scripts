package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tu2 implements f78 {
    public final /* synthetic */ cv2 t;
    public final /* synthetic */ cv2.d u;

    public /* synthetic */ tu2(cv2 cv2Var, cv2.d dVar) {
        this.t = cv2Var;
        this.u = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x006b A[FALL_THROUGH] */
    @Override // defpackage.f78
    public final boolean apply(Object obj) {
        Boolean bool;
        ix9 ix9Var;
        ix9 ix9Var2;
        id4 id4Var = (id4) obj;
        cv2 cv2Var = this.t;
        cv2Var.getClass();
        if (this.u.C && ((bool = cv2Var.j) == null || !bool.booleanValue())) {
            int i = id4Var.G;
            if (i != -1 && i > 2) {
                String str = id4Var.o;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32 && (ix9Var2 = cv2Var.h) != null && ix9Var2.b) {
                            }
                        default:
                            if (Build.VERSION.SDK_INT >= 32) {
                                break;
                            }
                            return false;
                    }
                } else if (Build.VERSION.SDK_INT >= 32 || (ix9Var = cv2Var.h) == null || !ix9Var.b || !ix9Var.c() || !cv2Var.h.d() || !cv2Var.h.a(cv2Var.i, id4Var)) {
                    return false;
                }
            }
        }
        return true;
    }
}
