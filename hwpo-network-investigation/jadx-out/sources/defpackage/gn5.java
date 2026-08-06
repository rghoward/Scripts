package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gn5 {
    public final /* synthetic */ int a = 0;
    public int b;
    public Object c;

    public gn5(ax1 ax1Var, int i) {
        a78.g(ax1Var);
        this.c = ax1Var;
        this.b = i;
    }

    public void a(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public void b() {
        ma1 ma1Var = ma1.c;
        char[] cArr = (char[]) this.c;
        ma1Var.getClass();
        cArr.getClass();
        synchronized (ma1Var) {
            try {
                int i = ma1Var.b;
                if (cArr.length + i < p30.a) {
                    ma1Var.b = i + cArr.length;
                    ma1Var.a.addLast(cArr);
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        a(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    public void d(long j) {
        c(String.valueOf(j));
    }

    public void e(String str) {
        byte b;
        str.getClass();
        a(this.b, str.length() + 2);
        char[] cArr = (char[]) this.c;
        int i = this.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = m2a.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    a(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = m2a.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) this.c)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = m2a.a[cCharAt];
                        str2.getClass();
                        a(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) this.c, i4);
                        int length3 = str2.length() + i4;
                        this.b = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) this.c;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        this.b = i4;
                    }
                }
                a(i4, 1);
                ((char[]) this.c)[i4] = '\"';
                this.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        this.b = i3 + 1;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ gn5() {
    }
}
