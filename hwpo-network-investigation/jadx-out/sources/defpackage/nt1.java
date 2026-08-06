package defpackage;

import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class nt1 extends kt1 {
    public final boolean c;

    public nt1(gn5 gn5Var, boolean z) {
        super(gn5Var);
        this.c = z;
    }

    @Override // defpackage.kt1
    public final void b(byte b) {
        if (this.c) {
            g(String.valueOf(b & MessagePack.Code.EXT_TIMESTAMP));
            return;
        }
        String strValueOf = String.valueOf(b & MessagePack.Code.EXT_TIMESTAMP);
        strValueOf.getClass();
        this.a.c(strValueOf);
    }

    @Override // defpackage.kt1
    public final void d(int i) {
        if (this.c) {
            g(Long.toString(((long) i) & 4294967295L, 10));
            return;
        }
        String string = Long.toString(((long) i) & 4294967295L, 10);
        string.getClass();
        this.a.c(string);
    }

    @Override // defpackage.kt1
    public final void e(long j) {
        int i = 63;
        String str = "0";
        if (this.c) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            g(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j3 = (j >>> 1) / 5;
                cArr2[63] = Character.forDigit((int) (j - (j3 * 10)), 10);
                while (j3 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j3 % 10), 10);
                    j3 /= 10;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        str.getClass();
        this.a.c(str);
    }

    @Override // defpackage.kt1
    public final void f(short s) {
        if (this.c) {
            g(String.valueOf(s & 65535));
            return;
        }
        String strValueOf = String.valueOf(s & 65535);
        strValueOf.getClass();
        this.a.c(strValueOf);
    }
}
