package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zvb extends dvb {
    public final mvb b;
    public final t9a c;
    public final n3a d;

    public zvb(int i, mvb mvbVar, t9a t9aVar, n3a n3aVar) {
        super(i);
        this.c = t9aVar;
        this.b = mvbVar;
        this.d = n3aVar;
        if (i == 2 && mvbVar.b) {
            z90.a("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.ewb
    public final void a(Status status) {
        this.d.getClass();
        this.c.c(status.v != null ? new ht8(status) : new rx(status));
    }

    @Override // defpackage.ewb
    public final void b(Exception exc) {
        this.c.c(exc);
    }

    @Override // defpackage.ewb
    public final void c(cub cubVar, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = cubVar.b;
        t9a t9aVar = this.c;
        map.put(t9aVar, boolValueOf);
        t9aVar.a.b(new fxb(cubVar, t9aVar));
    }

    @Override // defpackage.ewb
    public final void d(rub rubVar) throws DeadObjectException {
        t9a t9aVar = this.c;
        try {
            mvb mvbVar = this.b;
            mvbVar.c.a.accept(rubVar.c, t9aVar);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(ewb.e(e2));
        } catch (RuntimeException e3) {
            t9aVar.c(e3);
        }
    }

    @Override // defpackage.dvb
    public final fu3[] f(rub rubVar) {
        return this.b.a;
    }

    @Override // defpackage.dvb
    public final boolean g(rub rubVar) {
        return this.b.b;
    }

    @Override // defpackage.dvb
    public final int h(rub rubVar) {
        return 0;
    }
}
