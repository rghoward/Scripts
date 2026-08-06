package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hvc implements ServiceConnection, ik0.a, ik0.b {
    public volatile boolean t;
    public volatile hhc u;
    public final /* synthetic */ tvc v;

    public hvc(tvc tvcVar) {
        this.v = tvcVar;
    }

    @Override // ik0.b
    public final void a(ax1 ax1Var) {
        tvc tvcVar = this.v;
        fkc fkcVar = tvcVar.a.g;
        tkc.m(fkcVar);
        fkcVar.l();
        thc thcVar = tvcVar.a.f;
        if (thcVar == null || !thcVar.b) {
            thcVar = null;
        }
        if (thcVar != null) {
            thcVar.n.b(ax1Var, "Service connection failed");
        }
        synchronized (this) {
            this.t = false;
            this.u = null;
        }
        fkc fkcVar2 = this.v.a.g;
        tkc.m(fkcVar2);
        fkcVar2.p(new fvc(this, ax1Var));
    }

    @Override // ik0.a
    public final void g(int i) {
        tkc tkcVar = this.v.a;
        fkc fkcVar = tkcVar.g;
        tkc.m(fkcVar);
        fkcVar.l();
        thc thcVar = tkcVar.f;
        tkc.m(thcVar);
        thcVar.m.a("Service connection suspended");
        fkc fkcVar2 = tkcVar.g;
        tkc.m(fkcVar2);
        fkcVar2.p(new bvc(this));
    }

    @Override // ik0.a
    public final void i() {
        fkc fkcVar = this.v.a.g;
        tkc.m(fkcVar);
        fkcVar.l();
        synchronized (this) {
            try {
                a78.g(this.u);
                jgc jgcVar = (jgc) this.u.x();
                fkc fkcVar2 = this.v.a.g;
                tkc.m(fkcVar2);
                fkcVar2.p(new zuc(this, jgcVar));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.u = null;
                this.t = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        fkc fkcVar = this.v.a.g;
        tkc.m(fkcVar);
        fkcVar.l();
        synchronized (this) {
            if (iBinder == null) {
                this.t = false;
                thc thcVar = this.v.a.f;
                tkc.m(thcVar);
                thcVar.f.a("Service connected with null binder");
                return;
            }
            jgc xfcVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    xfcVar = iInterfaceQueryLocalInterface instanceof jgc ? (jgc) iInterfaceQueryLocalInterface : new xfc(iBinder);
                    thc thcVar2 = this.v.a.f;
                    tkc.m(thcVar2);
                    thcVar2.n.a("Bound to IMeasurementService interface");
                } else {
                    thc thcVar3 = this.v.a.f;
                    tkc.m(thcVar3);
                    thcVar3.f.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                thc thcVar4 = this.v.a.f;
                tkc.m(thcVar4);
                thcVar4.f.a("Service connect failed to get IMeasurementService");
            }
            if (xfcVar == null) {
                this.t = false;
                try {
                    fx1 fx1VarB = fx1.b();
                    tvc tvcVar = this.v;
                    fx1VarB.c(tvcVar.a.a, tvcVar.c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                fkc fkcVar2 = this.v.a.g;
                tkc.m(fkcVar2);
                fkcVar2.p(new nuc(this, xfcVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        tkc tkcVar = this.v.a;
        fkc fkcVar = tkcVar.g;
        tkc.m(fkcVar);
        fkcVar.l();
        thc thcVar = tkcVar.f;
        tkc.m(thcVar);
        thcVar.m.a("Service disconnected");
        fkc fkcVar2 = tkcVar.g;
        tkc.m(fkcVar2);
        fkcVar2.p(new puc(this, componentName));
    }
}
