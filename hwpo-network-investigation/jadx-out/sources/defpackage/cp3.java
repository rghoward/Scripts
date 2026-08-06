package defpackage;

import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.e;
import io.intercom.android.sdk.helpcenter.webview.HelpCenterWebViewInterface;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cp3 implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ cp3(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z;
        switch (this.t) {
            case 0:
                d dVar = (d) this.u;
                e.C0022e c0022e = (e.C0022e) this.v;
                int i2 = dVar.J - c0022e.c;
                dVar.J = i2;
                boolean z2 = true;
                if (c0022e.d) {
                    dVar.K = c0022e.e;
                    dVar.L = true;
                }
                if (i2 == 0) {
                    toa toaVar = c0022e.b.a;
                    int iG = -1;
                    if (!dVar.o0.a.p() && toaVar.p()) {
                        dVar.p0 = -1;
                        dVar.q0 = 0L;
                    }
                    if (!toaVar.p()) {
                        List listAsList = Arrays.asList(((n48) toaVar).i);
                        xl7.r(listAsList.size() == dVar.p.size());
                        for (int i3 = 0; i3 < listAsList.size(); i3++) {
                            ((d.C0021d) dVar.p.get(i3)).b = (toa) listAsList.get(i3);
                        }
                    }
                    long j = -9223372036854775807L;
                    if (dVar.L) {
                        boolean z3 = c0022e.b.a.p() && dVar.o0.a.p();
                        boolean zEquals = c0022e.b.b.equals(dVar.o0.b);
                        boolean z4 = c0022e.b.d == dVar.o0.s;
                        if (z3 || (zEquals && z4)) {
                            z2 = false;
                        }
                        if (z2) {
                            iG = dVar.G();
                            if (toaVar.p() || c0022e.b.b.b()) {
                                j = c0022e.b.d;
                            } else {
                                i28 i28Var = c0022e.b;
                                bq6.b bVar = i28Var.b;
                                long j2 = i28Var.d;
                                Object obj = bVar.a;
                                toa.b bVar2 = dVar.o;
                                toaVar.g(obj, bVar2);
                                j = j2 + bVar2.e;
                            }
                        }
                        i = iG;
                        z = z2;
                    } else {
                        i = -1;
                        z = false;
                    }
                    dVar.L = false;
                    dVar.C0(c0022e.b, 1, z, dVar.K, j, i, false);
                }
                break;
            default:
                ((HelpCenterWebViewInterface) this.u).lambda$handleAction$1((Map) this.v);
                break;
        }
    }
}
