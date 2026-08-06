package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nvb extends dvb {
    public final t9a b;

    public nvb(int i, t9a t9aVar) {
        super(i);
        this.b = t9aVar;
    }

    @Override // defpackage.ewb
    public final void a(Status status) {
        this.b.c(new rx(status));
    }

    @Override // defpackage.ewb
    public final void b(Exception exc) {
        this.b.c(exc);
    }

    @Override // defpackage.ewb
    public final void d(rub rubVar) throws DeadObjectException {
        try {
            i(rubVar);
        } catch (DeadObjectException e) {
            a(ewb.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(ewb.e(e2));
        } catch (RuntimeException e3) {
            this.b.c(e3);
        }
    }

    public abstract void i(rub rubVar);
}
