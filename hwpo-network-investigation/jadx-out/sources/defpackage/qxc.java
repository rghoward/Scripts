package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qxc implements Comparable {
    public static final AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(qxc.class, Object.class, "u");
    public static final /* synthetic */ long w = rxc.a.objectFieldOffset(qxc.class.getDeclaredField("u"));
    public final String t;
    public volatile Object u;

    public /* synthetic */ qxc(String str, byte[] bArr) {
        this.t = str;
        this.u = bArr;
    }

    public final /* synthetic */ void a(byte[] bArr) {
        byte[][] bArr2;
        qxc qxcVar;
        int i = 0;
        while (true) {
            Object obj = this.u;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i])) {
                        return;
                    } else {
                        i++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
            byte[][] bArr5 = bArr2;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = rxc.a;
                long j = w;
                qxcVar = this;
                if (unsafe.compareAndSwapObject(qxcVar, j, obj, bArr5)) {
                    return;
                }
                if (unsafe.getObjectVolatile(qxcVar, j) != obj) {
                    break;
                } else {
                    this = qxcVar;
                }
            }
            this = qxcVar;
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.t.compareTo((String) obj);
    }
}
