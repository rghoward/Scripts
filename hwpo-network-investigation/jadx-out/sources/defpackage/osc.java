package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class osc extends lmc {
    public static final WeakReference e = new WeakReference(null);
    public WeakReference d;

    public osc(byte[] bArr) {
        super(bArr);
        this.d = e;
    }

    public abstract byte[] O();

    @Override // defpackage.lmc
    public final byte[] g() {
        byte[] bArrO;
        synchronized (this) {
            try {
                bArrO = (byte[]) this.d.get();
                if (bArrO == null) {
                    bArrO = O();
                    this.d = new WeakReference(bArrO);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrO;
    }
}
