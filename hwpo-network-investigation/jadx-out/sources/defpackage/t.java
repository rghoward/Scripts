package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class t {
    public static final tx0.b a = new tx0.b();
    public static final int b = -1234567890;

    public static final boolean a(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbB = ao3.b("size=", j, " offset=");
            sbB.append(j2);
            sbB.append(" byteCount=");
            sbB.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbB.toString());
        }
    }

    public static final String c(byte b2) {
        char[] cArr = d.a;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static final String d(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = d.a;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        if (i2 < 0) {
            r.b(pk.d(i2, "startIndex: ", ", endIndex: 8, size: 8"));
            return null;
        }
        if (i2 <= 8) {
            return new String(cArr2, i2, 8 - i2);
        }
        z90.a(pk.d(i2, "startIndex: ", " > endIndex: 8"));
        return null;
    }
}
