package defpackage;

import android.os.Looper;
import android.os.Parcel;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ttc implements mtc {
    public final kpc a;

    public ttc(kpc kpcVar) {
        this.a = kpcVar;
    }

    public static i0.a f(r9a r9aVar) {
        final iqc iqcVar = new iqc();
        iqcVar.A = r9aVar;
        fh7 fh7Var = new fh7() { // from class: rqc
            @Override // defpackage.fh7
            public final /* synthetic */ void b(r9a r9aVar2) {
                boolean zL = r9aVar2.l();
                iqc iqcVar2 = iqcVar;
                if (zL) {
                    iqcVar2.cancel(false);
                    return;
                }
                if (r9aVar2.n()) {
                    iqcVar2.l(r9aVar2.j());
                    return;
                }
                Exception excI = r9aVar2.i();
                if (excI != null) {
                    iqcVar2.m(excI);
                } else {
                    d43.c();
                }
            }
        };
        y03 y03Var = y03.t;
        r9aVar.c(y03Var, fh7Var);
        return ti4.h1(iqcVar, rx.class, qtc.a, y03Var);
    }

    @Override // defpackage.mtc
    public final i0.a a(final String str) {
        str.getClass();
        s9a.a aVarA = s9a.a();
        aVarA.a = new om8() { // from class: woc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.om8
            public final void accept(Object obj, Object obj2) {
                int i = kpc.k;
                ipc ipcVar = new ipc((t9a) obj2);
                xpc xpcVar = (xpc) ((zpc) obj).x();
                Parcel parcelG = xpcVar.g();
                iac.c(parcelG, ipcVar);
                parcelG.writeString(str);
                parcelG.writeString(BuildConfig.FLAVOR);
                parcelG.writeString(null);
                xpcVar.i(parcelG, 11);
            }
        };
        return f(this.a.b(0, aVarA.a()).g(y03.t, new ym2()));
    }

    @Override // defpackage.mtc
    public final i0.a b(final dtc dtcVar) {
        s9a.a aVarA = s9a.a();
        aVarA.a = new om8() { // from class: apc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.om8
            public final void accept(Object obj, Object obj2) {
                int i = kpc.k;
                ipc ipcVar = new ipc((t9a) obj2);
                xpc xpcVar = (xpc) ((zpc) obj).x();
                byte[] bArrG = dtcVar.g();
                Parcel parcelG = xpcVar.g();
                iac.c(parcelG, ipcVar);
                parcelG.writeByteArray(bArrG);
                xpcVar.i(parcelG, 31);
            }
        };
        aVarA.c = new fu3[]{qnc.a};
        aVarA.b = false;
        mvb mvbVarA = aVarA.a();
        final kpc kpcVar = this.a;
        return f(kpcVar.b(0, mvbVarA).h(y03.t, new s02() { // from class: cpc
            @Override // defpackage.s02
            public final Object a(r9a r9aVar) {
                boolean z = r9aVar.i() instanceof m3b;
                dtc dtcVar2 = dtcVar;
                kpc kpcVar2 = kpcVar;
                if (z) {
                    return kpcVar2.c(dtcVar2.x());
                }
                if (r9aVar.i() instanceof rx) {
                    rx rxVar = (rx) r9aVar.i();
                    rxVar.getClass();
                    if (rxVar.t.t == 29514) {
                        return kpcVar2.c(dtcVar2.x());
                    }
                }
                return r9aVar;
            }
        }));
    }

    @Override // defpackage.mtc
    public final i0.a c(String str) {
        str.getClass();
        return f(this.a.c(str));
    }

    @Override // defpackage.mtc
    public final i0.a d() {
        s9a.a aVarA = s9a.a();
        kpc kpcVar = this.a;
        aVarA.a = new h60(kpcVar);
        aVarA.c = new fu3[]{qnc.c};
        aVarA.b = false;
        return f(kpcVar.b(0, aVarA.a()));
    }

    @Override // defpackage.mtc
    public final i0.a e(t0d t0dVar) throws Throwable {
        String string;
        kpc kpcVar = this.a;
        String simpleName = zpc.class.getSimpleName();
        Looper looper = kpcVar.g;
        a78.h(looper, "Looper must not be null");
        db6 db6Var = new db6(looper, t0dVar, simpleName);
        String strA = na8.a();
        if (strA == null) {
            string = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = strA.length() + 1;
            int iIdentityHashCode = System.identityHashCode(zpc.class);
            StringBuilder sb = new StringBuilder(length + String.valueOf(iIdentityHashCode).length());
            sb.append(strA);
            sb.append("|");
            sb.append(iIdentityHashCode);
            string = sb.toString();
        }
        epc epcVar = new epc(kpcVar, string, db6Var);
        kl3 kl3Var = kl3.u;
        rl8 rl8Var = new rl8();
        rl8Var.e = true;
        rl8Var.c = db6Var;
        rl8Var.a = epcVar;
        rl8Var.b = kl3Var;
        rl8Var.d = new fu3[]{qnc.b};
        rl8Var.e = false;
        db6.a aVar = rl8Var.c.b;
        a78.h(aVar, "Key must not be null");
        db6 db6Var2 = rl8Var.c;
        gvb gvbVar = new gvb(rl8Var, db6Var2, rl8Var.d, rl8Var.e);
        hvb hvbVar = new hvb(rl8Var, aVar);
        a78.h(db6Var2.b, "Listener has already been released.");
        zn4 zn4Var = kpcVar.j;
        zn4Var.getClass();
        t9a t9aVar = new t9a();
        evb evbVar = new evb(new wvb(new fvb(gvbVar, hvbVar), t9aVar), zn4Var.B.get(), kpcVar);
        rwb rwbVar = zn4Var.F;
        rwbVar.sendMessage(rwbVar.obtainMessage(8, evbVar));
        return f(t9aVar.a);
    }
}
