package defpackage;

import android.os.Parcel;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uoc extends gac {
    public final /* synthetic */ db6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uoc(kpc kpcVar, db6 db6Var) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.b = db6Var;
    }

    @Override // defpackage.gac
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        iac.d(parcel);
        final j50 j50Var = new j50(this, bArrCreateByteArray);
        final db6 db6Var = this.b;
        db6Var.a.execute(new Runnable() { // from class: xub
            @Override // java.lang.Runnable
            public final void run() {
                db6 db6Var2 = db6Var;
                j50 j50Var2 = j50Var;
                db6.a aVar = db6Var2.b;
                if (aVar == null) {
                    return;
                }
                t0d t0dVar = aVar.a;
                try {
                    byte[] bArr = (byte[]) j50Var2.t;
                    f1c f1cVar = f1c.b;
                    int i2 = h0c.a;
                    tzc tzcVarY = tzc.y(bArr, f1c.c);
                    Iterator it = t0dVar.b.f.iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        if (((s0d) it.next()).a((i2c) tzcVarY.x()) && !z) {
                            t0dVar.a.a();
                            z = true;
                        }
                    }
                } catch (RuntimeException e) {
                    throw e;
                } catch (k2c unused) {
                }
            }
        });
        return true;
    }
}
