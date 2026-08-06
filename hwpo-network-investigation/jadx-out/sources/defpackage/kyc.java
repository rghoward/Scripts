package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kyc implements s0d {
    public static final /* synthetic */ kyc a = new kyc();

    /* JADX WARN: Code duplicated, block: B:39:0x0069 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:25:0x004c, B:27:0x0050, B:29:0x0054, B:34:0x005e, B:39:0x0069, B:40:0x0073), top: B:47:0x004c }] */
    @Override // defpackage.s0d
    public final boolean a(i2c i2cVar) {
        izc izcVar = mzc.i;
        izcVar.getClass();
        if (i2cVar == null || i2cVar.isEmpty()) {
            return false;
        }
        Iterator<E> it = i2cVar.iterator();
        boolean z = false;
        while (it.hasNext()) {
            zxc zxcVar = (zxc) izcVar.a.get((String) it.next());
            if (zxcVar != null) {
                mzc mzcVar = zxcVar.a;
                boolean z2 = true;
                if (mzcVar.e) {
                    f1d f1dVar = mzcVar.a;
                    if (f1dVar != null && (f1dVar.a || f1dVar.e.a == 3 || mzcVar.h.b())) {
                        synchronized (mzcVar) {
                            try {
                                f1d f1dVar2 = mzcVar.a;
                                if (f1dVar2 != null) {
                                    if (f1dVar2.a) {
                                        mzcVar.a = null;
                                        mzcVar.g.a.incrementAndGet();
                                    } else {
                                        if (f1dVar2.e.a != 3) {
                                            z2 = false;
                                        }
                                        if (z2 || mzcVar.h.b()) {
                                            mzcVar.a = null;
                                            mzcVar.g.a.incrementAndGet();
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    z2 = false;
                }
                z |= z2;
            }
        }
        return z;
    }
}
